package jpgen.data;

import jpgen.SizedIterable;
import jpgen.PrintingContext;

import java.io.IOException;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.StreamSupport;

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
    public final SizedIterable<Member> members;

    public RecordType(Kind kind, long alignment, SizedIterable<Member> members)
    {
        this.kind = kind;
        this.alignment = alignment;
        this.members = members;
    }

    public RecordType(RecordType recordType)
    {
        this(recordType.kind, recordType.alignment, recordType.members);
    }

    @Override
    public Optional<? extends GroupLayout> layout()
    {
        if (this.members.size() == 0)
        {
            return Optional.empty();
        }

        MemoryLayout[] memberLayouts = StreamSupport.stream(this.members.spliterator(), false)
                .map(member -> switch (member)
                {
                    case Padding(long size) -> MemoryLayout.paddingLayout(size);
                    case Field(Type fieldType, _) -> fieldType.layout().orElseThrow();
                    case Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not supported.");
                })
                .toArray(MemoryLayout[]::new);

        GroupLayout recordLayout = this.kind == Kind.STRUCT ? MemoryLayout.structLayout(memberLayouts) : MemoryLayout.unionLayout(memberLayouts);

        return Optional.of(recordLayout.withByteAlignment(this.alignment));
    }

    @Override
    public final String layoutClass()
    {
        return this.kind == Kind.UNION ? "java.lang.foreign.UnionLayout" : "java.lang.foreign.StructLayout";
    }

    @Override public String layoutInstance() {throw new UnsupportedOperationException();}
    @Override public String nativeLayoutInstance() {throw new UnsupportedOperationException();}
    @Override public String javaType() {throw new UnsupportedOperationException();}

    @Override
    public final String nativeType()
    {
        return "java.lang.foreign.MemorySegment";
    }

    @Override public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException {}
    @Override public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException {}

    @Override public void writeReturnWrapping(Appendable output, String result) throws IOException {throw new UnsupportedOperationException();}
    @Override public void writeReturnUnwrapping(Appendable output, String result) throws IOException {throw new UnsupportedOperationException();}
    @Override public void writeParameterWrapping(Appendable output, String parameter) throws IOException {throw new UnsupportedOperationException();}
    @Override public void writeParameterUnwrapping(Appendable output, String parameter) throws IOException {throw new UnsupportedOperationException();}

    @Override
    public String toString()
    {
        Iterator<Member> memberIterator = this.members.iterator();
        if (!memberIterator.hasNext())
        {
            return String.format("IncompleteRecord[%s]", this.kind);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(memberIterator.next());
        while (memberIterator.hasNext())
        {
            builder.append(',').append(memberIterator.next());
        }

        return String.format("Record[%s, alignment=%d, members={%s}]", this.kind, this.alignment, builder);
    }

    public static class Decl extends RecordType implements Declaration
    {
        private final RecordInformation m_information;

        public Decl(Kind kind, long alignment, RecordInformation information, SizedIterable<Member> members)
        {
            super(kind, alignment, members);
            this.m_information = information;
        }

        public Decl(Decl recordDecl)
        {
            this(recordDecl.kind, recordDecl.alignment, recordDecl.m_information, recordDecl.members);
        }

        public RecordInformation information()
        {
            return this.m_information;
        }

        @Override
        public String name()
        {
            return this.m_information.name();
        }

        @Override
        public Optional<String> canonicalPackage()
        {
            if (this.m_information.canonicalPackage().isEmpty())
            {
                return Optional.empty();
            }

            return Optional.of(this.m_information.canonicalPackage());
        }

        @Override
        public Optional<? extends GroupLayout> layout()
        {
            return super.layout().map(layout -> layout.withName(this.name()));
        }

        @Override
        public final String layoutInstance()
        {
            return this.m_information.layoutInstance();
        }

        @Override
        public final String nativeLayoutInstance()
        {
            return this.m_information.layoutInstance();
        }

        @Override
        public final String javaType()
        {
            return this.m_information.javaType();
        }

        @Override
        public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
        {
            context.breakLine();
            context.append("public ").append(this.javaType()).append(' ').append(name).append("() {return new ").append(this.javaType()).append('(').append(data).append(".asSlice(").append(offset).append(", ").append(layout).breakLine("));}");
            context.append("public void ").append(name).append("(java.util.function.Consumer<").append(this.javaType()).append("> consumer) {consumer.accept(this.").append(name).breakLine("());}");
            context.append("public void ").append(name).append('(').append(this.javaType()).append(" value) {java.lang.foreign.MemorySegment.copy(value.").append(this.m_information.pointerName()).append("(), 0, ").append(data).append(", ").append(offset).append(", ").append(layout).breakLine(".byteSize());}");
        }

        @Override
        public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
        {
            context.append("public ").append(this.javaType()).append(' ').append(name).append("(int index) {return ").append(this.javaType()).append(".getAtIndex(").append(array).breakLine(", index);}");
            context.append("public void ").append(name).append("(int index, java.util.function.Consumer<").append(this.javaType()).append("> consumer) {consumer.accept(this.").append(name).breakLine("(index));}");
            context.append("public void ").append(name).append("(int index, ").append(this.javaType()).append(" value) {").append(this.javaType()).append(".setAtIndex(").append(array).breakLine(", index, value);}");
        }

        @Override
        public void writeReturnWrapping(Appendable output, String result) throws IOException
        {
            output.append("return new ").append(this.javaType()).append("((").append(this.nativeType()).append(')').append(result).append(')');
        }

        @Override
        public void writeReturnUnwrapping(Appendable output, String result) throws IOException
        {
            output.append("return ").append(result).append('.').append(this.m_information.pointerName()).append("()");
        }

        @Override
        public void writeParameterWrapping(Appendable output, String parameter) throws IOException
        {
            output.append("new ").append(this.javaType()).append('(').append(parameter).append(')');
        }

        @Override
        public void writeParameterUnwrapping(Appendable output, String parameter) throws IOException
        {
            output.append(parameter).append('.').append(this.m_information.pointerName()).append("()");
        }

        @Override
        public String toString()
        {
            Iterator<Member> memberIterator = this.members.iterator();
            if (!memberIterator.hasNext())
            {
                return String.format("IncompleteRecord[%s, kind=%s]", this.name(), this.kind);
            }

            StringBuilder builder = new StringBuilder();
            builder.append(memberIterator.next());
            while (memberIterator.hasNext())
            {
                builder.append(',').append(memberIterator.next());
            }

            return String.format("Record[name=%s, kind=%s, alignment=%d, members={%s}]", this.name(), this.kind, this.alignment, builder);
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
            return new RecordType(this.kind, this.alignment, SizedIterable.ofArray(this.m_members.toArray(Member[]::new)));
        }

        public Decl buildAsDeclaration(RecordInformation information)
        {
            return new Decl(this.kind, this.alignment, information, SizedIterable.ofArray(this.m_members.toArray(Member[]::new)));
        }
    }
}
