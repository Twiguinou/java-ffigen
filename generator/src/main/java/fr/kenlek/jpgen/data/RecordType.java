package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.ClassMaker.*;

public class RecordType implements Type
{
    public enum Kind
    {
        STRUCT,
        UNION;

        public static Kind map(int cursorKind)
        {
            return switch (cursorKind)
            {
                case CXCursor_StructDecl -> STRUCT;
                case CXCursor_UnionDecl -> UNION;
                default -> throw new IllegalArgumentException();
            };
        }
    }

    public sealed interface Member permits Field, Bitfield
    {
        Type type();

        Optional<String> name();

        boolean fuzzyEquals(Member other);
    }

    public record Field(Type type, Optional<String> name) implements Member
    {
        public Field
        {
            name.ifPresent(LanguageUtils::requireJavaIdentifier);
        }

        @Override
        public boolean fuzzyEquals(Member other)
        {
            return other instanceof Field(Type t, Optional<String> n) &&
                   this.name.equals(n) && this.type.fuzzyEquals(t);
        }
    }

    public record Bitfield(Type type, Optional<String> name, long width) implements Member
    {
        public Bitfield
        {
            name.ifPresent(LanguageUtils::requireJavaIdentifier);
        }

        @Override
        public boolean fuzzyEquals(Member other)
        {
            return other instanceof Bitfield(Type t, Optional<String> n, long w) &&
                   this.width == w && this.name.equals(n) && this.type.fuzzyEquals(t);
        }
    }

    public static final String DEFAULT_POINTER_NAME = "ptr";

    public final Kind kind;
    public final List<Member> members;
    protected final String m_symbolicName;

    protected RecordType(Kind kind, List<Member> members, String symbolicName)
    {
        this.kind = kind;
        this.members = members;
        this.m_symbolicName = symbolicName;
    }

    public RecordType(Kind kind, List<Member> members)
    {
        this.kind = kind;
        this.members = members;

        if (this.isIncomplete())
        {
            this.m_symbolicName = "";
        }
        else
        {
            this.m_symbolicName = String.format("RECORD_%s__%s", this.kind, this.members.stream()
                    .map(member ->
                    {
                        String suffix = member.name()
                                .map(name -> String.format("$%s$%s", name, member.type().getSymbolicName()))
                                .orElseGet(() -> "$".concat(member.type().getSymbolicName()));
                        return switch (member)
                        {
                            case Field _ -> "f".concat(suffix);
                            case Bitfield(_, _, long width) -> String.format("b%d%s", width, suffix);
                        };
                    })
                    .collect(Collectors.joining("_")));
        }
    }

    public boolean isIncomplete()
    {
        return this.members.isEmpty();
    }

    @Override
    public String getSymbolicName()
    {
        return this.m_symbolicName;
    }

    private void writeLayoutList(PrintingContext context) throws IOException
    {
        for (int i = 0;; i++)
        {
            context.append(this.members.get(i).type().process(
                    new LayoutReferenceHint.RecordElement(this, i)));
            if (i >= this.members.size() - 1)
            {
                context.breakLine();
                break;
            }

            context.breakLine(',');
        }
    }

    protected @Nullable String getLayoutNameElement()
    {
        return null;
    }

    @Override
    public void write(PrintingContext context, WriteLocation location) throws IOException
    {
        switch (location)
        {
            case WriteLocation.Static.LAYOUTS_CLASS ->
            {
                if (kind == Kind.STRUCT)
                {
                    context.append("public static final %s<%s> %s = %s.LAYOUT_PROVIDER.createStruct(%s, %s.of(",
                            LAYOUT_DATA, STRUCT_LAYOUT, this.getSymbolicName(), FOREIGN_UTILS, this.getLayoutNameElement(), LIST);
                }
                else
                {
                    context.append("public static final %s<%s> %s = %s.LAYOUT_PROVIDER.createUnion(%s, List.of(",
                            LAYOUT_DATA, UNION_LAYOUT, this.getSymbolicName(), FOREIGN_UTILS, this.getLayoutNameElement(), LIST);
                }

                context.breakLine().pushControlFlow(2);
                this.writeLayoutList(context);
                context.popControlFlow(2).breakLine("));");
            }
            // TODO
            case WriteLocation.RecordAccess access ->
            {
            }
            case WriteLocation.ArrayRecordAccess access ->
            {
            }
        }
    }

    @Override
    public String process(ProcessingHint hint)
    {
        return switch (hint)
        {
            case LayoutReferenceHint reference -> reference.processLayout(
                    reference.layoutsClass().child(this.m_symbolicName).child("layout"));
            case TypeLocationHint.CALLBACK, TypeLocationHint.CALLBACK_RAW, TypeLocationHint.FUNCTION -> MEMORY_SEGMENT;
            case TypeOperationHint op -> op.cast(MEMORY_SEGMENT);
            default -> throw new UnsupportedOperationException();
        };
    }

    @Override
    public TypeKind kind()
    {
        return TypeKind.COMPOSITE;
    }

    @Override
    public boolean fuzzyEquals(Type other)
    {
        if (Type.flatten(other) instanceof RecordType r &&
            this.kind == r.kind && this.members.size() == r.members.size())
        {
            for (int i = 0; i < this.members.size(); i++)
            {
                if (!this.members.get(i).fuzzyEquals(r.members.get(i)))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    @Override
    public List<Type> getDependencies()
    {
        return Stream.concat(
                this.members.stream()
                        .flatMap(member -> member.type().getDependencies().stream()),
                Stream.of(this)
        ).toList();
    }

    @Override
    public String toString()
    {
        if (this.isIncomplete())
        {
            return String.format("IncompleteRecord[%s]", this.kind);
        }

        return String.format("Record[%s, members={%s}]", this.kind,
                this.members.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Decl extends RecordType implements Declaration
    {
        private final JavaPath m_path;
        public final String pointerName;

        public Decl(JavaPath path, String pointerName, RecordType.Kind kind, List<Member> members)
        {
            super(kind, members, String.format("RECORD_DECL__%s", path.symbolize()));
            this.m_path = path;
            this.pointerName = pointerName;
        }

        public Decl(JavaPath path, RecordType.Kind kind, List<Member> members)
        {
            this(path, DEFAULT_POINTER_NAME, kind, members);
        }

        public Decl(JavaPath path, String pointerName, RecordType recordType)
        {
            this(path, pointerName, recordType.kind, recordType.members);
        }

        public Decl(JavaPath path, RecordType recordType)
        {
            this(path, DEFAULT_POINTER_NAME, recordType);
        }

        @Override
        public JavaPath path()
        {
            return this.m_path;
        }

        @Override
        protected @Nullable String getLayoutNameElement()
        {
            return String.format("\"%s\"", this.m_path.name());
        }

        @Override
        public void write(PrintingContext context, WriteLocation location) throws IOException
        {
            switch (location)
            {
                case WriteLocation.RecordAccess access ->
                {
                    String name = access.member().name().orElseThrow();
                    String layout = access.layoutsClass().child(this.m_symbolicName).toString();
                    String pointer = access.pointer();

                    context.breakLine();
                    context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                            name, access.layoutData(), access.index());
                    context.breakLine("public %1$s %2$s() {return new %1$s(%3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s.layout));}",
                            this.m_path, name, pointer, layout);
                    context.breakLine("public void %1$s(%2$s<%3$s> consumer) {consumer.accept(this.%1$s());}",
                            name, CONSUMER, this.m_path);
                    context.breakLine("public void %1$s(%2$s value) {%3$s.copy(value.%4$s(), 0, %5$s, MEMBER_OFFSET__%1$s, %6$s.layout.byteSize());}",
                            name, this.m_path, MEMORY_SEGMENT, this.pointerName, pointer, layout);
                    context.breakLine("public %1$s $%2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s.layout);}",
                            MEMORY_SEGMENT, name, pointer, layout);
                }
                case WriteLocation.ArrayRecordAccess(_, String name) ->
                {
                    context.breakLine("public %1$s %2$s(long index) {return %1$s.getAtIndex(this.%2$s(), index);}",
                            this.m_path, name);
                    context.breakLine("public void %1$s(long index, %2$s<%3$s> consumer) {consumer.accept(this.%1$s(index));}",
                            name, CONSUMER, this.m_path);
                    context.breakLine("public void %1$s(long index, %2$s value) {%2$s.setAtIndex(this.%1$s(), index, value);}",
                            name, this.m_path);
                }
                default -> super.write(context, location);
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case TypeLocationHint.CALLBACK, TypeLocationHint.FUNCTION -> this.m_path.toString();
                case TypeOperationHint(TypeOperationHint.Kind opKind, String element) when opKind == TypeOperationHint.Kind.WRAPPING
                        -> String.format("new %s((%s)%s)", this.m_path, MEMORY_SEGMENT, element);
                case TypeOperationHint(TypeOperationHint.Kind opKind, String element) when opKind == TypeOperationHint.Kind.UNWRAPPING
                        -> String.format("%s.%s()", element, this.pointerName);
                default -> super.process(hint);
            };
        }

        @Override
        public TypeKind kind()
        {
            return new TypeKind(false, true, false, true);
        }

        @Override
        public boolean fuzzyEquals(Type other)
        {
            return Type.flatten(other) instanceof RecordType.Decl r &&
                   this.m_path.equals(r.path()) && super.fuzzyEquals(r);
        }

        @Override
        public String toString()
        {
            if (this.isIncomplete())
            {
                return String.format("IncompleteRecordDeclaration[%s, kind=%s]", this.m_path, this.kind);
            }

            return String.format("RecordDeclaration[%s, kind=%s, members={%s}]", this.m_path, this.kind,
                    this.members.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }

    public static class Builder
    {
        public final Kind kind;
        public final List<Member> members = new ArrayList<>();

        public Builder(Kind kind)
        {
            this.kind = kind;
        }

        public Builder(Kind kind, List<Member> members)
        {
            this(kind);
            this.members.addAll(members);
        }

        public Builder(RecordType recordType)
        {
            this(recordType.kind, recordType.members);
        }

        public Builder appendMember(Member member)
        {
            this.members.add(member);
            return this;
        }

        public RecordType build()
        {
            return new RecordType(this.kind, List.copyOf(this.members));
        }

        public RecordType.Decl build(Declaration.JavaPath path, String pointerName)
        {
            return new Decl(path, pointerName, this.kind, List.copyOf(members));
        }

        public RecordType.Decl build(Declaration.JavaPath path)
        {
            return new Decl(path, this.kind, List.copyOf(members));
        }
    }
}
