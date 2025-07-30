package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.GetLayout;
import fr.kenlek.jpgen.generator.data.features.HeaderFlag;
import fr.kenlek.jpgen.generator.data.features.HintWriteFeature;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data.features.PrintMember;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

public class RecordType implements Type
{
    public enum Kind
    {
        STRUCT,
        UNION
    }

    public static sealed class Member permits Bitfield, Padding
    {
        public final Type type;
        public final long bitOffset;
        public final @Nullable String name;

        public Member(Type type, long bitOffset, @Nullable String name)
        {
            checkOffset(bitOffset);
            if (name != null)
            {
                LanguageUtils.requireJavaIdentifier(name);
            }

            this.type = type;
            this.bitOffset = bitOffset;
            this.name = name;
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
            String typeAlignment = this.type.apply(new GetLayout(layoutsClass)) + ".byteAlignment()";
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

    public final Kind kind;
    public final List<Member> members;
    public final long alignment;

    public RecordType(Kind kind, long alignment, List<? extends Member> members)
    {
        checkAlignment(alignment);
        if (members.stream()
            .map(member -> member.name)
            .filter(Objects::nonNull)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()
            .stream()
            .anyMatch(c -> c > 1))
        {
            throw new IllegalArgumentException("Record member names must be distinct.");
        }

        this.kind = kind;
        this.members = List.copyOf(members);
        this.alignment = alignment;
    }

    private static void checkAlignment(long alignment)
    {
        if ((alignment & (alignment - 1)) != 0)
        {
            throw new IllegalArgumentException("Alignment is not a power of 2");
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
            throw new UnsupportedOperationException("Record is incomplete.");
        }

        return "RECORD_%s__%s".formatted(this.kind, this.members.stream()
            .map(member ->
            {
                if (member instanceof Padding padding)
                {
                    return "p%d$%d".formatted(padding.bitOffset, padding.size);
                }

                String suffix = "$" + (member.name == null
                    ? member.type.symbolicName()
                    : "%s$%d$%s".formatted(member.name, member.bitOffset, member.type.symbolicName())
                );
                if (member instanceof Bitfield bitfield)
                {
                    return "b%d%s".formatted(bitfield.width, suffix);
                }

                return "f" + suffix;
            })
            .collect(Collectors.joining("_")));
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return this.isIncomplete() ? List.of() : Stream.concat(
            this.members.stream()
                .filter(member -> !(member instanceof Padding))
                .flatMap(member -> member.type.dependencies().stream()),
            Stream.of(this)
        ).toList();
    }

    protected void writeLayout(PrintingContext context, String fieldName, JavaPath layoutsClass, @Nullable String layoutName)
        throws IOException
    {
        if (this.isIncomplete())
        {
            throw new TypeFeature.UnsupportedException();
        }

        context.breakLine("@%s(\"%s\")", LAYOUT_VALUE, fieldName);
        if (this.kind == Kind.STRUCT)
        {
            context.append("public static final %s %s = %s.structLayout(", STRUCT_LAYOUT, fieldName, MEMORY_LAYOUT);
        }
        else
        {
            context.append("public static final %s %s = %s.unionLayout(", UNION_LAYOUT, fieldName, MEMORY_LAYOUT);
        }

        GetLayout getLayout = new GetLayout(layoutsClass);

        context.breakLine().pushControlFlow();
        for (Iterator<Member> iterator = this.members.stream()
            .filter(member -> !(member instanceof Bitfield))
            .iterator(); iterator.hasNext();)
        {
            Member member = iterator.next();
            if (member instanceof Padding padding)
            {
                context.append("%s.paddingLayout(%dL)", MEMORY_LAYOUT, padding.size);
            }
            else
            {
                context.append(member.type.apply(getLayout));
                if (member.name != null)
                {
                    context.append(".withName(\"%s\")", member.name);
                }
                else
                {
                    context.append(".withoutName()");
                }
            }

            if (!iterator.hasNext())
            {
                context.breakLine();
                break;
            }

            context.breakLine(',');
        }

        context.popControlFlow().append(')');
        if (layoutName != null)
        {
            context.append(".withName(\"%s\")", layoutName);
        }

        context.breakLine(".withByteAlignment(%d);", this.alignment);
    }

    @Override
    public void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
    {
        switch (feature)
        {
            case HintWriteFeature.PRINT_LAYOUT -> this.writeLayout(context, this.symbolicName(), JavaPath.EMPTY, null);
            case PrintMember _ ->
            {
                if (feature instanceof PrintMember.Plain plain && plain.member.name != null)
                {
                    String name = plain.member.name;

                    context.breakLine();
                    context.breakLine("public static final long MEMBER_OFFSET__%s = %s;", name, plain.member.containerByteOffset(plain.layoutsClass));
                    context.breakLine("public %s %s()", MEMORY_SEGMENT, name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("return this.pointer().asSlice(MEMBER_OFFSET__%s, %s);", name, this.apply(new GetLayout(plain.layoutsClass)));
                    context.popControlFlow().breakLine('}');
                }
            }
            default -> throw new TypeFeature.UnsupportedException();
        }
    }

    @Override
    public <T> T apply(TypeFeature<? extends T> feature)
    {
        if (feature == HeaderFlag.APPEND_ALLOCATOR)
        {
            return feature.result(true);
        }

        return feature.result(switch (feature)
        {
            case GetLayout(JavaPath layoutsClass) -> layoutsClass.child(this.symbolicName()).toString();
            case JavaTypeString(_, JavaPath layoutsClass, boolean decorated) -> decorated
                ? "@%s(value = \"%s\", container = %s.class) %s".formatted(LAYOUT, this.symbolicName(), layoutsClass, MEMORY_SEGMENT)
                : MEMORY_SEGMENT;
            default -> throw new TypeFeature.UnsupportedException();
        });
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

    public static class Decl extends RecordType implements Declaration.Writable
    {
        private final JavaPath m_path;

        public Decl(JavaPath path, RecordType.Kind kind, long alignment, List<? extends Member> members)
        {
            super(kind, alignment, members);
            Declaration.checkPath(path);

            this.m_path = path;
        }

        @Override
        public JavaPath path()
        {
            return this.m_path;
        }

        @Override
        public String symbolicName()
        {
            return "RECORD_DECL__" + path().symbolize();
        }

        @Override
        public void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
        {
            switch (feature)
            {
                case HintWriteFeature _ -> {}
                case PrintMember.Plain plain ->
                {
                    if (plain.member.name != null)
                    {
                        String name = plain.member.name;
                        String layout = this.apply(new GetLayout(plain.layoutsClass));

                        context.breakLine();
                        context.breakLine("public static final long MEMBER_OFFSET__%s = %s;", name, plain.member.containerByteOffset(plain.layoutsClass));

                        context.breakLine("public %s %s()", this.path(), name);
                        context.breakLine('{').pushControlFlow();
                        context.breakLine("return new %s(this.pointer().asSlice(MEMBER_OFFSET__%s, %s));", this.path(), name, layout);
                        context.popControlFlow().breakLine('}');

                        context.breakLine();
                        context.breakLine("public void %s(%s<%s> consumer)", name, CONSUMER, this.path());
                        context.breakLine('{').pushControlFlow();
                        context.breakLine("consumer.accept(this.%s());", name);
                        context.popControlFlow().breakLine('}');

                        context.breakLine();
                        context.breakLine("public void %s(%s value)", name, this.path());
                        context.breakLine('{').pushControlFlow();
                        context.breakLine("%s.copy(value.pointer(), 0, this.pointer(), MEMBER_OFFSET__%s, %s.byteSize());", MEMORY_SEGMENT, name, layout);
                        context.popControlFlow().breakLine('}');
                    }
                }
                case PrintMember.Array array ->
                {
                    context.breakLine();
                    context.breakLine("public %s %s(long index)", this.path(), array.name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("return %s.getAtIndex(this.%s(), index);", this.path(), array.name);
                    context.popControlFlow().breakLine('}');

                    context.breakLine();
                    context.breakLine("public void %s(long index, %s<%s> consumer)", array.name, CONSUMER, this.path());
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("consumer.accept(this.%s(index));", array.name);
                    context.popControlFlow().breakLine('}');

                    context.breakLine();
                    context.breakLine("public void %s(long index, %s value)", array.name, this.path());
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("%s.setAtIndex(this.%s(), index, value);", this.path(), array.name);
                    context.popControlFlow().breakLine('}');
                }
                default -> throw new TypeFeature.UnsupportedException();
            }
        }

        @Override
        public <T> T apply(TypeFeature<? extends T> feature)
        {
            return feature.result(switch (feature)
            {
                case GetLayout _ -> this.path().child("LAYOUT").toString();
                case JavaTypeString _ -> this.path().toString();
                default -> super.apply(feature);
            });
        }

        @Override
        public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            this.emitClassPrefix(context);

            context.breakLine("public record %s(%s pointer) implements %s", this.path().tail(), MEMORY_SEGMENT, ADDRESSABLE);
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
            context.breakLine("public static void setAtIndex(%s buffer, long index, %s value)", MEMORY_SEGMENT, this.path().tail());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%s.copy(value.pointer(), 0, buffer, index * LAYOUT.byteSize(), LAYOUT.byteSize());", MEMORY_SEGMENT);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public void copyFrom(%s other)", this.path().tail());
            context.breakLine('{').pushControlFlow();
            context.breakLine("%s.copy(other.pointer(), 0, this.pointer(), 0, LAYOUT.byteSize());", MEMORY_SEGMENT);
            context.popControlFlow().breakLine('}');

            for (Member member : this.members)
            {
                if (member instanceof Padding)
                {
                    continue;
                }

                member.type.apply(new PrintMember.Plain(layoutsClass, member), context);
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public boolean writable()
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
        private final List<Member> m_members = new ArrayList<>();
        private final Set<String> m_names = new HashSet<>();

        public Builder(Kind kind, long alignment)
        {
            this.kind = kind;
            this.alignment = alignment;
        }

        public Builder(RecordType recordType)
        {
            this(recordType.kind, recordType.alignment);
            this.m_members.addAll(recordType.members);
            this.m_names.addAll(recordType.members.stream()
                .map(member -> member.name)
                .filter(Objects::nonNull)
                .toList());
        }

        public Builder appendMember(Member member)
        {
            if (member.name != null && !this.m_names.add(member.name))
            {
                throw new IllegalArgumentException("Member name is already in use: " + member.name);
            }

            this.m_members.add(member);
            return this;
        }

        public RecordType build()
        {
            return new RecordType(this.kind, this.alignment, this.m_members);
        }

        public RecordType.Decl build(JavaPath path)
        {
            return new RecordType.Decl(path, this.kind, this.alignment, this.m_members);
        }
    }
}
