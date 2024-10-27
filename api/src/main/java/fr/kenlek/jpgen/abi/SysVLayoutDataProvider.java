package fr.kenlek.jpgen.abi;

import fr.kenlek.jpgen.ForeignUtils;
import fr.kenlek.jpgen.Member;
import fr.kenlek.jpgen.Platform;
import fr.kenlek.jpgen.LayoutData;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.PaddingLayout;
import java.lang.foreign.StructLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// This class is not strictly for the SysV ABI!

// Itanium, RISC-V: Unnamed bit-fields do not contribute to the overall alignment but do require
// space like regular bit-fields. As for empty bit-fields, they act as a way to realign the next
// unit according to their alignment.

// ARM: Unnamed non-empty bit-fields do contribute to alignment, this also applies to
// zero-width ones.

public class SysVLayoutDataProvider implements LayoutData.Provider
{
    private final boolean m_alwaysAlign;

    public SysVLayoutDataProvider(Platform platform)
    {
        this.m_alwaysAlign = switch (platform.arch())
        {
            case AARCH_64 -> true;
            default -> false;
        };
    }

    public SysVLayoutDataProvider()
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
            long typeAlignment = member.layout().byteAlignment() << 3;
            long typeSize = member.layout().byteSize() << 3;
            long bitOffset = switch (member)
            {
                case Member.Field(MemoryLayout layout) ->
                {
                    long offset = ForeignUtils.alignUpwards(bits, typeAlignment);
                    bits = offset + typeSize;
                    bitAlignment = Math.max(bitAlignment, typeAlignment);

                    computePadding(offset, lastLayoutOffset).ifPresent(layouts::add);
                    layouts.add(layout);

                    lastLayoutOffset = bits;
                    yield offset;
                }
                case Member.Bitfield(MemoryLayout layout, long width) when width == 0 ->
                {
                    if (this.m_bitFieldAlignment)
                    {
                        bitAlignment = Math.max(bitAlignment, typeAlignment);
                    }
                }
                case Member.Bitfield(MemoryLayout layout, long width) ->
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
}
