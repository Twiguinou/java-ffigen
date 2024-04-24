package jpgen.data2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecordType implements Type
{
    public enum Kind
    {
        STRUCT,
        UNION
    }

    public sealed interface Member permits Field, Padding, Bitfield
    {
        Type type();

        String name();
    }

    public record Field(Type type, String name) implements Member
    {
        @Override
        public String toString()
        {
            return String.format("Field[%s, type=%s]", this.name, this.type);
        }
    }

    public record Padding(long size) implements Member
    {
        @Override
        public Type type()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public String name()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public String toString()
        {
            return String.format("Padding[%d]", this.size);
        }
    }

    public record Bitfield(Type type, String name, long count) implements Member
    {
        @Override
        public String toString()
        {
            return String.format("Bitfield[%s, type=%s, count=%d]", this.name, this.type, this.count);
        }
    }

    public final Kind kind;
    public final long alignment;
    // Workaround for mutability.
    public final Member[] members;

    public RecordType(Kind kind, long alignment, Member[] members)
    {
        this.kind = kind;
        this.alignment = alignment;
        this.members = members;
    }

    @Override
    public String toString()
    {
        if (this.members.length == 0)
        {
            return String.format("IncompleteRecord[%s]", this.kind);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.members[0]);
        for (int i = 1; i < this.members.length; i++)
        {
            builder.append(',').append(this.members[i]);
        }

        return String.format("Record[%s, alignment=%d, members={%s}]", this.kind, this.alignment, builder);
    }

    public static class Decl extends RecordType implements Declaration
    {
        private final String m_name;

        public Decl(Kind kind, long alignment, String name, Member[] members)
        {
            super(kind, alignment, members);
            this.m_name = name;
        }

        @Override
        public String name()
        {
            return this.m_name;
        }

        @Override
        public String toString()
        {
            if (this.members.length == 0)
            {
                return String.format("IncompleteRecord[%s, kind=%s]", this.m_name, this.kind);
            }

            StringBuilder builder = new StringBuilder();
            builder.append(this.members[0]);
            for (int i = 1; i < this.members.length; i++)
            {
                builder.append(',').append(this.members[i]);
            }

            return String.format("Record[name=%s, kind=%s, alignment=%d, members={%s}]", this.m_name, this.kind, this.alignment, builder);
        }
    }

    public static class Builder
    {
        public final Kind kind;
        public final long alignment;
        private final List<Member> m_members = new ArrayList<>();
        private final Set<String> m_usedNames = new HashSet<>();

        public Builder(Kind kind, long alignment)
        {
            this.kind = kind;
            this.alignment = alignment;
        }

        public Iterable<Member> members()
        {
            return this.m_members;
        }

        public Builder appendMember(Member member)
        {
            if (member instanceof Padding)
            {
                if (this.kind == Kind.UNION)
                {
                    throw new IllegalArgumentException("Padding members are not allowed inside unions.");
                }
            }
            else
            {
                if (!member.name().isEmpty() && !this.m_usedNames.add(member.name()))
                {
                    throw new IllegalArgumentException(String.format("Member with name %s already exists.", member.name()));
                }
            }

            this.m_members.add(member);
            return this;
        }

        public RecordType buildAsType()
        {
            return new RecordType(this.kind, this.alignment, this.m_members.toArray(Member[]::new));
        }

        public Decl buildAsDeclaration(String name)
        {
            return new Decl(this.kind, this.alignment, name, this.m_members.toArray(Member[]::new));
        }
    }
}
