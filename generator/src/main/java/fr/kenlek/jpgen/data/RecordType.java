package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.StaticLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.data.CodeUtils.*;

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
                   this.name().equals(n) && this.type().symbolicName().equals(t.symbolicName());
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
                   this.width() == w && this.name().equals(n) && this.type().symbolicName().equals(t.symbolicName());
        }
    }

    public static final String DEFAULT_POINTER_NAME = "ptr";

    public final Kind kind;
    public final List<Member> members;

    public RecordType(Kind kind, List<Member> members)
    {
        this.kind = kind;
        this.members = members;
    }

    public boolean isIncomplete()
    {
        return this.members.isEmpty();
    }

    @Override
    public String symbolicName()
    {
        if (this.isIncomplete())
        {
            throw new UnsupportedOperationException("Record has no member.");
        }

        return String.format("RECORD_%s__%s", this.kind, this.members.stream()
                .map(member ->
                {
                    String suffix = member.name()
                            .map(name -> String.format("$%s$%s", name, member.type().symbolicName()))
                            .orElseGet(() -> "$".concat(member.type().symbolicName()));
                    return switch (member)
                    {
                        case Field _ -> "f".concat(suffix);
                        case Bitfield(_, _, long width) -> String.format("b%d%s", width, suffix);
                    };
                })
                .collect(Collectors.joining("_")));
    }

    private void writeLayoutList(PrintingContext context) throws IOException
    {
        for (int i = 0;; i++)
        {
            context.append(this.members.get(i).type().process(new LayoutReference.RecordElement(this, i)));
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
    public void write(PrintingContext context, InputLocation location) throws IOException
    {
        if (this.isIncomplete()) throw new UnsupportedOperationException();

        if (location == StaticLocation.LAYOUTS_CLASS)
        {
            if (kind == Kind.STRUCT)
            {
                context.append("public static final %s<%s> %s = %s.LAYOUT_PROVIDER.createStruct(%s, %s.of(",
                        LAYOUT_DATA, STRUCT_LAYOUT, this.symbolicName(), FOREIGN_UTILS, this.getLayoutNameElement(), LIST);
            }
            else
            {
                context.append("public static final %s<%s> %s = %s.LAYOUT_PROVIDER.createUnion(%s, List.of(",
                        LAYOUT_DATA, UNION_LAYOUT, this.symbolicName(), FOREIGN_UTILS, this.getLayoutNameElement(), LIST);
            }

            context.breakLine().pushControlFlow(2);
            this.writeLayoutList(context);
            context.popControlFlow(2).breakLine("));");
        }
    }

    @Override
    public String process(ProcessingHint hint)
    {
        if (this.isIncomplete()) throw new UnsupportedOperationException();

        return switch (hint)
        {
            case LayoutReference reference -> reference.processLayout(reference.layoutsClass().child(this.symbolicName()).child("layout"));
            case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> MEMORY_SEGMENT;
            case TypeOp op -> op.cast(MEMORY_SEGMENT);
            default -> throw new UnsupportedOperationException();
        };
    }

    @Override
    public TypeKind kind()
    {
        return TypeKind.COMPOSITE;
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.isIncomplete() ? List.of() : Stream.concat(
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

    public static class Decl extends RecordType implements Declaration.CodeGenerator
    {
        private static final TypeKind RECORD_DECL_KIND = new TypeKind(false, true, true);

        private final JavaPath m_path;
        public final String pointerName;
        private final String m_symbolicName;

        public Decl(JavaPath path, String pointerName, RecordType.Kind kind, List<Member> members,
                    String symbolicName)
        {
            super(kind, members);
            this.m_path = path;
            this.pointerName = pointerName;
            this.m_symbolicName = symbolicName;
        }

        public Decl(JavaPath path, String pointerName, RecordType.Kind kind, List<Member> members)
        {
            this(path, pointerName, kind, members, String.format("RECORD_DECL__%s", path.symbolize()));
        }

        public Decl(JavaPath path, RecordType.Kind kind, List<Member> members)
        {
            this(path, DEFAULT_POINTER_NAME, kind, members);
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
        public String symbolicName()
        {
            return this.m_symbolicName;
        }

        @Override
        public void write(PrintingContext context, InputLocation location) throws IOException
        {
            switch (location)
            {
                case RecordLocation rl when rl.member().name().isPresent() ->
                {
                    String name = rl.member().name().orElseThrow();
                    String layout = rl.layoutsClass().child(this.symbolicName()).toString();
                    String pointer = rl.pointer();

                    context.breakLine();
                    context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                            name, rl.layoutData(), rl.index());
                    context.breakLine("public %1$s %2$s() {return new %1$s(%3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s.layout));}",
                            this.path(), name, pointer, layout);
                    context.breakLine("public void %1$s(%2$s<%3$s> consumer) {consumer.accept(this.%1$s());}",
                            name, CONSUMER, this.path());
                    context.breakLine("public void %1$s(%2$s value) {%3$s.copy(value.%4$s(), 0, %5$s, MEMBER_OFFSET__%1$s, %6$s.layout.byteSize());}",
                            name, this.path(), MEMORY_SEGMENT, this.pointerName, pointer, layout);
                    context.breakLine("public %1$s $%2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s.layout);}",
                            MEMORY_SEGMENT, name, pointer, layout);
                }
                case RecordLocation.Array(_, String name) ->
                {
                    context.breakLine("public %1$s %2$s(long index) {return %1$s.getAtIndex(this.%2$s(), index);}",
                            this.path(), name);
                    context.breakLine("public void %1$s(long index, %2$s<%3$s> consumer) {consumer.accept(this.%1$s(index));}",
                            name, CONSUMER, this.path());
                    context.breakLine("public void %1$s(long index, %2$s value) {%2$s.setAtIndex(this.%1$s(), index, value);}",
                            name, this.path());
                }
                default -> super.write(context, location);
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case TypeReference.CALLBACK, TypeReference.FUNCTION -> this.m_path.toString();
                case TypeOp(boolean wrap, String element) when wrap -> String.format("new %s((%s)%s)", this.m_path, MEMORY_SEGMENT, element);
                case TypeOp(_, String element) -> String.format("%s.%s()", element, this.pointerName);
                default -> super.process(hint);
            };
        }

        @Override
        public TypeKind kind()
        {
            return RECORD_DECL_KIND;
        }

        @Override
        public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            String pointer = "this.".concat(this.pointerName);
            String layout = this.process(new LayoutReference.Physical(layoutsClass));
            this.emitClassPrefix(context);

            context.breakLine("public record %s(%s %s)", this.path().name(), MEMORY_SEGMENT, this.pointerName);
            context.breakLine('{').pushControlFlow();

            context.breakLine("public %s(%s allocator)", this.path().name(), SEGMENT_ALLOCATOR);
            context.breakLine('{').pushControlFlow();
            context.breakLine("this(allocator.allocate(%s));", layout);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public static %s getAtIndex(%s buffer, long index)", this.path().name(), MEMORY_SEGMENT);
            context.breakLine('{').pushControlFlow();
            context.breakLine("return new %1$s(buffer.asSlice(index * %2$s.byteSize(), %2$s));", this.path().name(), layout);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public static void setAtIndex(%s buffer, long index, %s value)", MEMORY_SEGMENT, this.path().name());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%1$s.copy(value.%2$s, 0, buffer, index * %3$s.byteSize(), %3$s.byteSize());",
                    MEMORY_SEGMENT, this.pointerName, layout);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public void copyFrom(%s other)", this.path().name());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%s.copy(other.%s, 0, %s, 0, %s.byteSize());", MEMORY_SEGMENT, this.pointerName, pointer, layout);
            context.popControlFlow().breakLine('}');

            for (int i = 0; i < this.members.size(); i++)
            {
                this.members.get(i).type().write(context, new RecordLocation(layoutsClass, this, i));
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public String toString()
        {
            if (this.isIncomplete())
            {
                return String.format("IncompleteRecordDeclaration[%s, kind=%s]", this.path(), this.kind);
            }

            return String.format("RecordDeclaration[%s, kind=%s, members={%s}]", this.path(), this.kind,
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
            return new Decl(path, this.kind, List.copyOf(this.members));
        }
    }
}
