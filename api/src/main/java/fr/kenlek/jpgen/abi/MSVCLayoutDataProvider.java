package fr.kenlek.jpgen.abi;

import fr.kenlek.jpgen.ForeignUtils;
import fr.kenlek.jpgen.LayoutData;
import fr.kenlek.jpgen.Member;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.List;

// Unlike SystemV, MSVC will not count bit-fields of different type size as part of the same storage unit.

public class MSVCLayoutDataProvider implements LayoutData.Provider
{
    public MSVCLayoutDataProvider() {}

    public LayoutData<StructLayout> createStruct(@Nullable String name, List<Member> members)
    {
        List<LayoutData.MemberState> states = new ArrayList<>(members.size());
        List<MemoryLayout> layouts = new ArrayList<>();

        long bits = 0;
        long bitAlignment = 1 << 3;
        long lastLayoutOffset = 0;
        MemoryLayout currentBitfield = null;

        for (Member member : members)
        {
            long typeAlignment = member.layout().byteAlignment() << 3;
            long typeSize = member.layout().byteSize() << 3;
            long bitOffset = switch (member)
            {
                case Member.Field(MemoryLayout layout) ->
                {
                    currentBitfield = null;

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
                    if (currentBitfield != null)
                    {
                        bits = ForeignUtils.alignUpwards(bits, typeAlignment);
                        bitAlignment = Math.max(bitAlignment, typeAlignment);
                        currentBitfield = null;
                    }
                    // else pretend it doesn't exist
                    yield bits;
                }
                case Member.Bitfield(MemoryLayout layout, long width) ->
                {
                    long offset;
                    if (currentBitfield != null && layout.byteSize() == currentBitfield.byteSize() &&
                        bits % typeAlignment + width <= typeSize)
                    {
                        offset = bits;
                    }
                    else
                    {
                        offset = ForeignUtils.alignUpwards(bits, typeAlignment);
                    }

                    bits = offset + width;
                    bitAlignment = Math.max(bitAlignment, typeAlignment);
                    currentBitfield = layout;
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
    public LayoutData<UnionLayout> createUnion(@Nullable String name, List<Member> members)
    {
        List<MemoryLayout> memberLayouts = new ArrayList<>();
        long alignment = 1;
        long size = 0;
        // This is honestly weird, typically member order doesn't matter in unions.
        boolean insideBitfield = false;
        for (Member member : members)
        {
            if (member instanceof Member.Bitfield(_, long width))
            {
                if (width == 0 && !insideBitfield)
                {
                    continue;
                }

                insideBitfield = true;
            }
            else
            {
                insideBitfield = false;
            }

            memberLayouts.add(member.layout());
            size = Math.max(size, member.layout().byteSize());
            alignment = Math.max(alignment, member.layout().byteAlignment());
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
