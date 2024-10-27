package fr.kenlek.jpgen;

import org.jspecify.annotations.Nullable;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LayoutData<T extends GroupLayout>
{
    public interface Provider
    {
        LayoutData<StructLayout> createStruct(@Nullable String name, List<Member> members);

        // For some reason UnionLayout-s do not require the size to be a multiple of alignment.
        default LayoutData<UnionLayout> createUnion(@Nullable String name, List<Member> members)
        {
            List<MemoryLayout> memberLayouts = new ArrayList<>();
            long alignment = 1;
            long size = 0;
            for (Member member : members)
            {
                memberLayouts.add(member.layout());
                alignment = Math.max(alignment, member.layout().byteAlignment());
                size = Math.max(size, member.layout().byteSize());
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

    public record MemberState(Member member, long offset)
    {
        public long byteOffset()
        {
            return ForeignUtils.alignDownwards(this.offset >>> 3, this.member.layout().byteAlignment());
        }
    }

    public final T layout;
    private final Map<String, MemberState> m_stateTable;
    private final List<MemberState> m_states;

    public LayoutData(T layout, List<MemberState> states)
    {
        this.layout = layout;
        this.m_states = states;
        this.m_stateTable = states.stream()
                .filter(state -> state.member.layout().name().isPresent())
                .collect(Collectors.toUnmodifiableMap(state -> state.member.layout().name().orElseThrow(), Function.identity()));
    }

    public MemberState state(int index)
    {
        return this.m_states.get(index);
    }

    public MemberState state(String name)
    {
        return Objects.requireNonNull(this.m_stateTable.get(name));
    }

    @Override
    public String toString()
    {
        return this.layout.toString();
    }
}
