package fr.kenlek.jpgen;

import org.jspecify.annotations.Nullable;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LayoutData<T extends GroupLayout>
{
    public interface Provider
    {
        LayoutData<StructLayout> createStruct(@Nullable String name, List<Member> members);

        LayoutData<UnionLayout> createUnion(@Nullable String name, List<Member> members);
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

    public Optional<MemberState> findMember(String name)
    {
        return Optional.ofNullable(this.m_stateTable.get(name));
    }
}
