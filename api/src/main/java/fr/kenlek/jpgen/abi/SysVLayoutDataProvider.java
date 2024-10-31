package fr.kenlek.jpgen.abi;

import fr.kenlek.jpgen.ForeignUtils;
import fr.kenlek.jpgen.Member;
import fr.kenlek.jpgen.Platform;
import fr.kenlek.jpgen.LayoutData;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.List;

// This class is not strictly for the SysV ABI!

// <Itanium, RISC-V, s390x, PowerPC>
// Unnamed bit-fields do not contribute to the overall alignment but do
// require space like regular bit-fields. As for empty bit-fields, they act as a way to realign
// the next unit according to their alignment.

// <ARM>
// Unnamed bit-fields contribute to alignment.

public class SysVLayoutDataProvider implements LayoutData.Provider
{
    private final boolean m_alwaysAlign;

    public SysVLayoutDataProvider(Platform platform)
    {
        this.m_alwaysAlign = platform.arch() == Platform.Arch.AARCH_64;
    }

    public SysVLayoutDataProvider()
    {
        this(Platform.CURRENT);
    }

    public LayoutData<StructLayout> createStruct(@Nullable String name, List<Member> members)
    {
        List<LayoutData.MemberState> states = new ArrayList<>(members.size());
        List<MemoryLayout> layouts = new ArrayList<>();

        long bits = 0;
        long bitAlignment = 1 << 3;
        long lastLayoutOffset = 0;

        for (Member member : members)
        {
            long typeAlignment = member.layout().byteAlignment() << 3;
            long typeSize = member.layout().byteSize() << 3;
            long bitOffset = switch (member)
            {
                case Member.Field(MemoryLayout layout) ->
                {
                    long offset = ForeignUtils.alignUpwards(bits, typeAlignment);
                    bits = offset + typeSize;
                    bitAlignment = Math.max(bitAlignment, typeAlignment);

                    LayoutData.computeBitPadding(offset, lastLayoutOffset).ifPresent(layouts::add);
                    layouts.add(layout);

                    lastLayoutOffset = bits;
                    yield offset;
                }
                case Member.Bitfield(_, long width) when width == 0 ->
                {
                    if (this.m_alwaysAlign)
                    {
                        bitAlignment = Math.max(bitAlignment, typeAlignment);
                    }

                    bits = ForeignUtils.alignUpwards(bits, typeAlignment);
                    yield bits;
                }
                case Member.Bitfield(MemoryLayout layout, long width) ->
                {
                    long offset;
                    if (bits % typeAlignment + width <= typeSize)
                    {
                        offset = bits;
                    }
                    else
                    {
                        offset = ForeignUtils.alignUpwards(bits, typeAlignment);
                    }

                    bits = offset + width;
                    if (layout.name().isPresent() || this.m_alwaysAlign)
                    {
                        bitAlignment = Math.max(bitAlignment, typeAlignment);
                    }

                    yield offset;
                }
            };

            states.add(new LayoutData.MemberState(member, bitOffset));
        }

        LayoutData.computeBitPadding(ForeignUtils.alignUpwards(bits, bitAlignment), lastLayoutOffset).ifPresent(layouts::add);

        StructLayout layout = MemoryLayout.structLayout(layouts.toArray(MemoryLayout[]::new));
        if (name != null) layout = layout.withName(name);

        return new LayoutData<>(layout, List.copyOf(states));
    }

    @Override
    public  LayoutData<UnionLayout> createUnion(@Nullable String name, List<Member> members)
    {
        List<MemoryLayout> memberLayouts = new ArrayList<>();
        long alignment = 1;
        long size = 0;
        for (Member member : members)
        {
            memberLayouts.add(member.layout());
            size = Math.max(size, member.layout().byteSize());
            if (member instanceof Member.Field || member.layout().name().isPresent() || this.m_alwaysAlign)
            {
                alignment = Math.max(alignment, member.layout().byteAlignment());
            }
        }

        long alignedSize = ForeignUtils.alignUpwards(size, alignment);
        if (alignedSize - size > 0)
        {
            memberLayouts.add(MemoryLayout.paddingLayout(alignedSize));
        }

        UnionLayout layout = MemoryLayout.unionLayout(memberLayouts.toArray(MemoryLayout[]::new));
        if (name != null)
        {
            layout = layout.withName(name);
        }

        List<LayoutData.MemberState> states = members.stream()
                .map(member -> new LayoutData.MemberState(member, 0))
                .toList();

        return new LayoutData<>(layout, states);
    }
}
