package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.CommonFlags;
import fr.kenlek.jpgen.generator.data.features.GetLayout;
import fr.kenlek.jpgen.generator.data.features.GetTypeReference;
import fr.kenlek.jpgen.generator.data.features.PrintLayout;
import fr.kenlek.jpgen.generator.data.features.PrintMember;
import fr.kenlek.jpgen.generator.data.features.ProcessTypeValue;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

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

    public static sealed class Member permits Bitfield, Padding
    {
        public final Type type;
        public final long bitOffset;
        private final @Nullable String m_name;

        public Member(Type type, long bitOffset, @Nullable String name)
        {
            checkOffset(bitOffset);
            if (name != null)
            {
                LanguageUtils.requireJavaIdentifier(name);
            }

            this.type = type;
            this.bitOffset = bitOffset;
            this.m_name = name;
        }

        public Optional<String> name()
        {
            return Optional.ofNullable(this.m_name);
        }

        public String containerByteOffset(JavaPath layoutsClass)
        {
            return Long.toString(this.bitOffset >>> 3);
        }
    }

    public static final class Bitfield extends Member
    {
        public final long width;

        public Bitfield(Type type, long bitOffset, @Nullable String name, long width)
        {
            super(type, bitOffset, name);
            if (width < 0)
            {
                throw new IllegalArgumentException("Bit-field width must be positive.");
            }

            this.width = width;
        }

        @Override
        public String containerByteOffset(JavaPath layoutsClass)
        {
            String typeAlignment = this.type.process(new GetLayout.ForPhysical(layoutsClass))
                .concat(".byteAlignment()");
            return "%s.alignDownwards(%d, %s)".formatted(FOREIGN_UTILS, this.bitOffset >>> 3, typeAlignment);
        }
    }

    public static final class Padding extends Member
    {
        public final long size;

        public Padding(long bitOffset, long size)
        {
            super(null, bitOffset, null);
            if (size <= 0)
            {
                throw new IllegalArgumentException("Padding size must be strictly positive.");
            }

            this.size = size;
        }
    }

    public static final String POINTER_NAME = "pointer";

    public final Kind kind;
    public final List<Member> members;
    public final long alignment;

    public RecordType(Kind kind, long alignment, List<Member> members)
    {
        checkAlignment(alignment);
        List<String> memberNames = members.stream()
            .map(Member::name)
            .filter(Optional::isPresent)
            .map(Optional::orElseThrow)
            .toList();
        if (memberNames.stream().distinct().count() != memberNames.size())
        {
            throw new IllegalArgumentException("Record member names must be distinct.");
        }

        this.kind = kind;
        this.members = members;
        this.alignment = alignment;
    }

    private static void checkAlignment(long alignment)
    {
        if ((alignment & (alignment - 1)) != 0)
        {
            throw new IllegalArgumentException("Alignment is not a power of 2.");
        }
    }

    private static void checkOffset(long offset)
    {
        if (offset < 0)
        {
            throw new IllegalArgumentException("Offset is strictly negative.");
        }
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

        return "RECORD_%s__%s".formatted(this.kind, this.members.stream()
            .map(member ->
            {
                if (member instanceof Padding padding)
                {
                    return "p%d$%d".formatted(padding.bitOffset, padding.size);
                }

                String suffix = member.name()
                    .map(name -> "$%s$%d$%s".formatted(name, member.bitOffset, member.type.symbolicName()))
                    .orElseGet(() -> "$".concat(member.type.symbolicName()));
                if (member instanceof Bitfield bitfield)
                {
                    return "b%d%s".formatted(bitfield.width, suffix);
                }

                return "f".concat(suffix);
            })
            .collect(Collectors.joining("_")));
    }

    protected void writeLayout(PrintingContext context, String layoutFieldName, JavaPath layoutsClass,
                               @Nullable String layoutName) throws IOException
    {
        context.breakLine("@%s(\"LAYOUT\")", LAYOUT_VALUE);
        if (this.kind == Kind.STRUCT)
        {
            context.append("public static final %s %s = %s.structLayout(", STRUCT_LAYOUT, layoutFieldName, MEMORY_LAYOUT);
        }
        else
        {
            context.append("public static final %s %s = %s.unionLayout(", UNION_LAYOUT, layoutFieldName, MEMORY_LAYOUT);
        }

        context.breakLine().pushControlFlow(1);
        ListIterator<Member> iterator = this.members.stream()
            .filter(member -> !(member instanceof Bitfield))
            .toList().listIterator();
        while (iterator.hasNext())
        {
            Member member = iterator.next();
            if (member instanceof Padding padding)
            {
                context.append("%s.paddingLayout(%d)", MEMORY_LAYOUT, padding.size);
            }
            else
            {
                context.append(member.type.process(new GetLayout.ForRecord(layoutsClass, member)));
            }

            if (!iterator.hasNext())
            {
                context.breakLine();
                break;
            }

            context.breakLine(',');
        }
        context.popControlFlow(1).append(')');
        if (layoutName != null)
        {
            context.append(".withName(\"%s\")", layoutName);
        }
        context.breakLine(".withByteAlignment(%d);", this.alignment);
    }

    @Override
    public void print(Feature.Opt feature) throws IOException
    {
        if (this.isIncomplete())
        {
            throw new Feature.UnsupportedException();
        }

        if (feature instanceof PrintLayout(
            PrintingContext context, PrintLayout.Location location
        ) && location == PrintLayout.Location.LAYOUTS_CLASS)
        {
            this.writeLayout(context, this.symbolicName(), JavaPath.EMPTY, null);
        }
    }

    @Override
    public String process(Feature feature)
    {
        if (this.isIncomplete())
        {
            throw new Feature.UnsupportedException();
        }

        return switch (feature)
        {
            case GetLayout layout -> layout.processLayout(layout.layoutsClass.child(this.symbolicName()));
            case GetTypeReference reference when reference.isMethod() -> MEMORY_SEGMENT;
            case ProcessTypeValue typeValue -> typeValue.cast(MEMORY_SEGMENT);
            default -> throw new Feature.UnsupportedException();
        };
    }

    @Override
    public boolean check(Feature.Flag flag)
    {
        return switch (flag)
        {
            case CommonFlags.IS_COMPOSITE -> true;
            case CommonFlags _ -> false;
            default -> throw new Feature.UnsupportedException();
        };
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.isIncomplete() ? List.of() : Stream.concat(
            this.members.stream()
                .filter(member -> !(member instanceof Padding))
                .flatMap(member -> member.type.getDependencies().stream()),
            Stream.of(this)
        ).toList();
    }

    @Override
    public String toString()
    {
        if (this.isIncomplete())
        {
            return "IncompleteRecord[%s]".formatted(this.kind);
        }

        return "Record[%s, members={%s}]".formatted(this.kind,
            this.members.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Decl extends RecordType implements Declaration.CodeGenerator
    {
        private final JavaPath m_path;
        private final String m_symbolicName;

        public Decl(JavaPath path, RecordType.Kind kind, long alignment, List<Member> members,
                    String symbolicName)
        {
            super(kind, alignment, members);
            Declaration.checkPath(path);
            LanguageUtils.requireJavaIdentifier(symbolicName);

            this.m_path = path;
            this.m_symbolicName = symbolicName;
        }

        public Decl(JavaPath path, RecordType.Kind kind, long alignment, List<Member> members)
        {
            this(path, kind, alignment, members, "RECORD_DECL__".concat(path.symbolize()));
        }

        @Override
        public JavaPath path()
        {
            return this.m_path;
        }

        @Override
        public String symbolicName()
        {
            return this.m_symbolicName;
        }

        @Override
        public void print(Feature.Opt feature) throws IOException
        {
            switch (feature)
            {
                case PrintMember.Plain plain when plain.member.name().isPresent() ->
                {
                    String name = plain.member.name().orElseThrow();
                    String layout = this.process(new GetLayout.ForPhysical(plain.layoutsClass));

                    plain.context().breakLine();
                    plain.writeConstant(context -> context.append("long MEMBER_OFFSET__%s = %s", name, plain.member.containerByteOffset(plain.layoutsClass)));
                    plain.writeFunction(true,
                        context -> context.append("%s %s()", this.path(), name),
                        context -> context.append("return new %s(%s.asSlice(MEMBER_OFFSET__%s, %s));", this.path(), plain.pointer, name, layout)
                    );
                    plain.writeFunction(true,
                        context -> context.append("void %s(%s<%s> consumer)", name, CONSUMER, this.path()),
                        context -> context.append("consumer.accept(this.%s());", name)
                    );
                    plain.writeFunction(true,
                        context -> context.append("void %s(%s value)", name, this.path()),
                        context -> context.append("%s.copy(value.%s(), 0, %s, MEMBER_OFFSET__%s, %s.byteSize());", MEMORY_SEGMENT, POINTER_NAME, plain.pointer, name, layout)
                    );
                    plain.writeFunction(true,
                        context -> context.append("%s $%s()", MEMORY_SEGMENT, name),
                        context -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s);", plain.pointer, name, layout)
                    );
                }
                case PrintMember.Array array ->
                {
                    array.writeFunction(true,
                        context -> context.append("%s %s(long index)", this.path(), array.name),
                        context -> context.append("return %s.getAtIndex(this.%s(), index);", this.path(), array.name)
                    );
                    array.writeFunction(true,
                        context -> context.append("void %s(long index, %s<%s> consumer)", array.name, CONSUMER, this.path()),
                        context -> context.append("consumer.accept(this.%s(index));", array.name)
                    );
                    array.writeFunction(true,
                        context -> context.append("void %s(long index, %s value)", array.name, this.path()),
                        context -> context.append("%s.setAtIndex(this.%s(), index, value);", this.path(), array.name)
                    );
                }
                default -> super.print(feature);
            }
        }

        @Override
        public String process(Feature feature)
        {
            return switch (feature)
            {
                case GetLayout layout -> layout.processLayout(this.path().child("LAYOUT"));
                case GetTypeReference typeReference when typeReference.isFunction() || typeReference.isCallback() ->
                    this.path().toString();
                case ProcessTypeValue typeValue when typeValue.wrap() ->
                    "new %s(%s)".formatted(this.path(), typeValue.cast(MEMORY_SEGMENT));
                case ProcessTypeValue(_, _, String element) -> "%s.%s()".formatted(element, POINTER_NAME);
                default -> super.process(feature);
            };
        }

        @Override
        public boolean check(Feature.Flag flag)
        {
            return flag == CommonFlags.IS_TRANSLATABLE || super.check(flag);
        }

        @Override
        public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            String pointer = "this.%s()".formatted(POINTER_NAME);
            this.emitClassPrefix(context);

            context.breakLine("public record %s(%s %s) implements %s", this.path().tail(), MEMORY_SEGMENT, POINTER_NAME, ADDRESSABLE);
            context.breakLine('{').pushControlFlow();

            this.writeLayout(context, "LAYOUT", layoutsClass, this.path().tail());

            context.breakLine();
            context.breakLine("public %s(%s allocator)", this.path().tail(), SEGMENT_ALLOCATOR);
            context.breakLine('{').pushControlFlow();
            context.breakLine("this(allocator.allocate(LAYOUT));");
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public static %s getAtIndex(%s buffer, long index)", this.path().tail(), MEMORY_SEGMENT);
            context.breakLine('{').pushControlFlow();
            context.breakLine("return new %s(buffer.asSlice(index * LAYOUT.byteSize(), LAYOUT));", this.path().tail());
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public static void setAtIndex(%s buffer, long index, %s value)", MEMORY_SEGMENT, this.path()
                .tail());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%s.copy(value.%s(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());", MEMORY_SEGMENT, POINTER_NAME);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public void copyFrom(%s other)", this.path().tail());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%s.copy(other.%s(), 0, %s, 0, LAYOUT.byteSize());", MEMORY_SEGMENT, POINTER_NAME, pointer);
            context.popControlFlow().breakLine('}');

            for (Member member : this.members)
            {
                if (!(member instanceof Padding))
                {
                    member.type.print(new PrintMember.Plain(context, layoutsClass, pointer, member));
                }
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public List<Type> getDependencies()
        {
            return this.isIncomplete() ? List.of() : this.members.stream()
                .filter(member -> !(member instanceof Padding))
                .flatMap(member -> member.type.getDependencies().stream())
                .toList();
        }

        @Override
        public boolean printable()
        {
            return !this.isIncomplete();
        }

        @Override
        public String toString()
        {
            if (this.isIncomplete())
            {
                return "IncompleteRecordDeclaration[%s, kind=%s]".formatted(this.path(), this.kind);
            }

            return "RecordDeclaration[%s, kind=%s, members={%s}]".formatted(this.path(), this.kind,
                this.members.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }

    public static class Builder
    {
        public final Kind kind;
        public final long alignment;
        public final List<Member> members = new ArrayList<>();
        private final Set<String> m_names = new HashSet<>();

        public Builder(Kind kind, long alignment)
        {
            this.kind = kind;
            this.alignment = alignment;
        }

        public Builder(RecordType recordType)
        {
            this(recordType.kind, recordType.alignment);
            this.members.addAll(recordType.members);
            this.m_names.addAll(recordType.members.stream()
                .map(Member::name)
                .filter(Optional::isPresent)
                .map(Optional::orElseThrow)
                .toList());
        }

        public Builder appendMember(Member member)
        {
            member.name().ifPresent(name ->
            {
                if (!this.m_names.add(name))
                {
                    throw new IllegalArgumentException("The name %s is already in use.".formatted(name));
                }
            });

            this.members.add(member);
            return this;
        }

        public RecordType build()
        {
            return new RecordType(this.kind, this.alignment, List.copyOf(this.members));
        }

        public RecordType.Decl build(JavaPath path)
        {
            return new Decl(path, this.kind, this.alignment, List.copyOf(members));
        }
    }
}
