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

    public boolean isIncomplete()
    {
        return this.members.size() == 0;
    }

    @Override
    public Optional<? extends GroupLayout> layout()
    {
        if (this.isIncomplete()) return Optional.empty();

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
    public void writeMemberProperties(PrintingContext context, String name, long offset) throws IOException
    {
        if (name.isEmpty())
        {
            for (Member member : this.members)
            {
                switch (member)
                {
                    case Padding(long size) -> offset += size;
                    case Field(Type fieldType, String fieldName) ->
                    {
                        fieldType.writeMemberProperties(context, fieldName, offset);
                        if (this.kind == Kind.STRUCT)
                        {
                            offset += fieldType.layout().orElseThrow().byteSize();
                        }
                    }
                    case Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not supported.");
                }
            }
        }
        else
        {
            Type.super.writeMemberProperties(context, name, offset);
        }
    }

    @Override
    public String getLayoutList(String name)
    {
        if (name.isEmpty())
        {
            StringBuilder list = new StringBuilder();
            Iterator<Member> memberIterator = this.members.iterator();
            while (memberIterator.hasNext())
            {
                switch (memberIterator.next())
                {
                    case Padding(long size) -> list.append("java.lang.foreign.MemoryLayout.paddingLayout(").append(size).append(')');
                    case Field(Type fieldType, String fieldName) -> list.append(fieldType.getLayoutList(fieldName));
                    case Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not supported.");
                }

                if (memberIterator.hasNext()) list.append(", ");
            }

            return list.toString();
        }

        return Type.super.getLayoutList(name);
    }

    @Override
    public void writeAccessors(PrintingContext context, String name, String data) throws IOException
    {
        if (name.isEmpty())
        {
            for (Member member : this.members)
            {
                if (member instanceof Field(Type fieldType, String fieldName))
                {
                    fieldType.writeAccessors(context, fieldName, data);
                }
            }
        }
        else
        {
            context.breakLine();
            context.append("public java.lang.foreign.MemorySegment ").append(name).append("() {return ").append(data).append(".asSlice(OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(");}");
            context.append("public void ").append(name).append("(java.lang.foreign.MemorySegment value) {java.lang.foreign.MemorySegment.copy(value, 0, ").append(data).append(", OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(".byteSize());}");
        }
    }

    @Override
    public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
    {
        context.append("public java.lang.foreign.MemorySegment ").append(name).append("(int index) {return ").append(array).append(".asSlice(index * LAYOUT__").append(name).append(".elementLayout().byteSize(), LAYOUT__").append(name).breakLine(".elementLayout());}");
        context.append("public void ").append(name).append("(int index, java.lang.foreign.MemorySegment value) {java.lang.foreign.MemorySegment.copy(value, 0, ").append(array).append(", index * LAYOUT__").append(name).append(".elementLayout().byteSize(), LAYOUT__").append(name).breakLine(".byteSize());}");
    }

    @Override
    public String getWrappedFunctionParameterType()
    {
        return "java.lang.foreign.MemorySegment";
    }

    @Override
    public String getWrappedFunctionParameter(String name)
    {
        return name;
    }

    @Override
    public String getUnwrappedFunctionParameterType()
    {
        return "java.lang.foreign.MemorySegment";
    }

    @Override
    public String getUnwrappedFunctionParameter(String name)
    {
        return name;
    }

    @Override
    public String getWrappedFunctionReturnType()
    {
        return "java.lang.foreign.MemorySegment";
    }

    @Override
    public String getWrappedFunctionReturnValue(String data)
    {
        return String.format("return (java.lang.foreign.MemorySegment)%s", data);
    }

    @Override
    public String getUnwrappedFunctionReturnType()
    {
        return "java.lang.foreign.MemorySegment";
    }

    @Override
    public String getUnwrappedFunctionReturnValue(String data)
    {
        return String.format("return %s", data);
    }

    @Override public String getFunctionLayoutInstance()
    {
        return this.getRecordMemberLayoutInstance();
    }

    @Override
    public String getRecordMemberLayoutType()
    {
        if (this.isIncomplete()) throw new UnsupportedOperationException();
        return this.kind == Kind.STRUCT ? "java.lang.foreign.StructLayout" : "java.lang.foreign.UnionLayout";
    }

    @Override public String getRecordMemberLayoutInstance()
    {
        StringBuilder layoutList = new StringBuilder();
        Iterator<Member> memberIterator = this.members.iterator();
        while (memberIterator.hasNext())
        {
            layoutList.append(switch (memberIterator.next())
            {
                case Field(Type type, String name) when name.isEmpty() -> String.format("%s.withoutName()", type.getRecordMemberLayoutInstance());
                case Field(Type type, String name) -> String.format("%s.withName(\"%s\")", type.getRecordMemberLayoutInstance(), name);
                case Padding(long size) -> String.format("java.lang.foreign.MemoryLayout.paddingLayout(%d)", size);
                case Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not yet supported.");
            });
            if (memberIterator.hasNext()) layoutList.append(", ");
        }

        return String.format("java.lang.foreign.MemoryLayout.%sLayout(%s)", this.kind.name().toLowerCase(), layoutList);
    }

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
        public void writeAccessors(PrintingContext context, String name, String data) throws IOException
        {
            if (name.isEmpty())
            {
                super.writeAccessors(context, name, data);
            }
            else
            {
                String javaType = this.information().javaType();

                context.breakLine();
                context.append("public ").append(javaType).append(' ').append(name).append("() {return new ").append(javaType).append('(').append(data).append(".asSlice(OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine("));}");
                context.append("public void ").append(name).append("(java.util.function.Consumer<").append(javaType).append("> consumer) {consumer.accept(this.").append(name).breakLine("());}");
                context.append("public void ").append(name).append('(').append(javaType).append(" value) {java.lang.foreign.MemorySegment.copy(value.").append(this.m_information.pointerName()).append("(), 0, ").append(data).append(", OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(".byteSize());}");
            }
        }

        @Override
        public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
        {
            String javaType = this.information().javaType();

            context.append("public ").append(javaType).append(' ').append(name).append("(int index) {return ").append(javaType).append(".getAtIndex(").append(array).breakLine(", index);}");
            context.append("public void ").append(name).append("(int index, java.util.function.Consumer<").append(javaType).append("> consumer) {consumer.accept(this.").append(name).breakLine("(index));}");
            context.append("public void ").append(name).append("(int index, ").append(javaType).append(" value) {").append(javaType).append(".setAtIndex(").append(array).breakLine(", index, value);}");
        }

        @Override
        public String getWrappedFunctionParameterType()
        {
            return this.information().javaType();
        }

        @Override
        public String getWrappedFunctionParameter(String name)
        {
            return String.format("new %s(%s)", this.m_information.javaType(), name);
        }

        @Override
        public String getUnwrappedFunctionParameter(String name)
        {
            return String.format("%s.%s()", name, this.information().pointerName());
        }

        @Override
        public String getWrappedFunctionReturnType()
        {
            return this.information().javaType();
        }

        @Override
        public String getWrappedFunctionReturnValue(String data)
        {
            return String.format("return new %s((java.lang.foreign.MemorySegment)%s)", this.information().javaType(), data);
        }

        @Override
        public String getUnwrappedFunctionReturnValue(String data)
        {
            return String.format("return %s.%s()", data, this.m_information.pointerName());
        }

        @Override
        public String getFunctionLayoutInstance()
        {
            return this.information().layoutInstance();
        }

        @Override
        public String getRecordMemberLayoutInstance()
        {
            return this.information().layoutInstance();
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
