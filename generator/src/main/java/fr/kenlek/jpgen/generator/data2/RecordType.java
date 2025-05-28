package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.LanguageUtils;
import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data2.features.GetLayout;
import org.jspecify.annotations.Nullable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.generator.data2.CodeUtils.FOREIGN_UTILS;

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

    public static final String POINTER_NAME = "pointer";

    public final Kind kind;
    public final List<Member> members;
    public final long alignment;

    public RecordType(Kind kind, long alignment, List<? extends Member> members)
    {
        checkAlignment(alignment);
        long distinctCount = members.stream()
            .map(member -> member.name)
            .filter(Objects::nonNull)
            .distinct()
            .count();
        if (distinctCount != members.size())
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
        private final String m_symbolicName;

        public Decl(JavaPath path, RecordType.Kind kind, long alignment, List<? extends Member> members)
        {
            super(kind, alignment, members);
            Declaration.checkPath(path);

            this.m_path = path;
            this.m_symbolicName = "RECORD_DECL__" + path.symbolize();
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
        public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
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
                throw new IllegalArgumentException("Member name %s is already in use.".formatted(member.name));
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
