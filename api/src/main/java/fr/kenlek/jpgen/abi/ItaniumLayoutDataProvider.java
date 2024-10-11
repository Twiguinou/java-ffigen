package fr.kenlek.jpgen.abi;

import fr.kenlek.jpgen.ForeignUtils;
import fr.kenlek.jpgen.Member;
import fr.kenlek.jpgen.Platform;
import fr.kenlek.jpgen.LayoutData;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItaniumLayoutDataProvider implements LayoutData.Provider
{
    private final Platform m_platform;

    public ItaniumLayoutDataProvider(Platform platform)
    {
        this.m_platform = platform;
    }

    public ItaniumLayoutDataProvider()
    {
        this(Platform.CURRENT);
    }

    private static Optional<PaddingLayout> computePadding(long offset, long expected)
    {
        long diff = offset - expected;
        return diff > 0 ? Optional.of(MemoryLayout.paddingLayout(diff >>> 3)) : Optional.empty();
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
            MemoryLayout layout = member.layout();
            long typeAlignment = layout.byteAlignment() << 3;
            long typeSize = layout.byteSize() << 3;
            long bitOffset = switch (member)
            {
                case Member.Field _ ->
                {
                    long offset = ForeignUtils.alignUpwards(bits, typeAlignment);
                    bits = offset + typeSize;
                    bitAlignment = Math.max(bitAlignment, typeAlignment);

                    computePadding(offset, lastLayoutOffset).ifPresent(layouts::add);
                    layouts.add(layout);

                    lastLayoutOffset = bits;
                    yield offset;
                }
                case Member.Bitfield(_, long width) ->
                {
                    long fieldAlignment;
                    if (width > 0 && bits % typeAlignment + width <= typeSize)
                    {
                        // the whole bit-field can be fit inside the current unit
                        fieldAlignment = 1;
                    }
                    else
                    {
                        // alignment bit-field or overlaps with unit bounds
                        fieldAlignment = typeAlignment;
                    }

                    long offset = ForeignUtils.alignUpwards(bits, fieldAlignment);
                    bits = offset + width;
                    if (layout.name().isPresent() || this.m_platform.arch().hasAlignmentBitfields)
                    {
                        bitAlignment = Math.max(bitAlignment, typeAlignment);
                    }

                    yield offset;
                }
            };

            states.add(new LayoutData.MemberState(member, bitOffset));
        }

        computePadding(ForeignUtils.alignUpwards(bits, bitAlignment), lastLayoutOffset).ifPresent(layouts::add);

        StructLayout layout = MemoryLayout.structLayout(layouts.toArray(MemoryLayout[]::new));
        if (name != null) layout = layout.withName(name);

        return new LayoutData<>(layout, List.copyOf(states));
    }

    @Override
    public LayoutData<UnionLayout> createUnion(@Nullable String name, List<Member> members)
    {
        UnionLayout layout = MemoryLayout.unionLayout(members.stream()
                .map(Member::layout)
                .toArray(MemoryLayout[]::new));
        if (name != null) layout = layout.withName(name);
        List<LayoutData.MemberState> states = members.stream()
                .map(member -> new LayoutData.MemberState(member, 0))
                .toList();

        return new LayoutData<>(layout, states);
    }
}
