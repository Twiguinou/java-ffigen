package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.StaticLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public interface Type extends DependencyProvider
{
    interface InputLocation {}
    interface ProcessingHint {}

    /// Construct and return the symbolic name representing this very type.
    /// The returned [String] must be a valid and unique Java identifier.
    String symbolicName();

    TypeKind kind();

    void write(PrintingContext context, InputLocation location) throws IOException;

    String process(ProcessingHint hint);

    /// A type that lacks memory representation, this includes size and alignment.
    interface Virtual extends Type
    {
        @Override
        default String symbolicName()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default void write(PrintingContext context, InputLocation location)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default String process(ProcessingHint hint)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default List<Type> getDependencies()
        {
            return List.of();
        }
    }

    Type VOID = new Virtual()
    {
        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> "void";
                case TypeOp(_, String element) -> element;
                default -> Virtual.super.process(hint);
            };
        }

        @Override
        public TypeKind kind()
        {
            return TypeKind.VOID;
        }

        @Override
        public String toString()
        {
            return "Void";
        }
    };

    record Array(Type element, long length) implements Type
    {
        @Override
        public String symbolicName()
        {
            return String.format("ARRAY_%d__%s", this.length(), this.element().symbolicName());
        }

        @Override
        public void write(PrintingContext context, InputLocation location) throws IOException
        {
            if (location == StaticLocation.LAYOUTS_CLASS)
            {
                context.breakLine("public static final %s %s = %s.sequenceLayout(%d, %s);",
                        SEQUENCE_LAYOUT, this.symbolicName(), MEMORY_LAYOUT, this.length(), this.element().process(new LayoutReference.Physical()));
            }
            else if (location instanceof RecordLocation rl && rl.member().name().isPresent())
            {
                String name = rl.member().name().orElseThrow();

                context.breakLine();
                rl.target().tryWriteConstant(context, _ -> context.append("long MEMBER_OFFSET__%s = %s.state(%d).byteOffset()",
                        name, rl.layoutData(), rl.index()));
                rl.target().writeFunction(context, true,
                        _ -> context.append("%s %s()", MEMORY_SEGMENT, name),
                        _ -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s);", rl.pointer(), name, rl.layoutsClass().child(this.symbolicName())));
                this.element().write(context, new RecordLocation.Array(rl.layoutsClass(), name, rl.target()));
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case LayoutReference.Descriptor descriptor -> descriptor.processLayout(UNBOUNDED_POINTER);
                case LayoutReference reference -> reference.processLayout(reference.layoutsClass().child(this.symbolicName()));
                case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> MEMORY_SEGMENT;
                case TypeOp op -> op.cast(MEMORY_SEGMENT);
                default -> throw new UnsupportedOperationException();
            };
        }

        @Override
        public TypeKind kind()
        {
            return TypeKind.COMMON;
        }

        @Override
        public List<Type> getDependencies()
        {
            return Stream.concat(this.element.getDependencies().stream(), Stream.of(this)).toList();
        }
    }

    /// This interface provides an easy way to decorate another type.
    interface Delegated extends Type
    {
        Type underlying();

        @Override
        default String symbolicName()
        {
            return this.underlying().symbolicName();
        }

        @Override
        default void write(PrintingContext context, InputLocation location) throws IOException
        {
            if (location != StaticLocation.LAYOUTS_CLASS)
            {
                this.underlying().write(context, location);
            }
        }

        @Override
        default String process(ProcessingHint hint)
        {
            return this.underlying().process(hint);
        }

        @Override
        default TypeKind kind()
        {
            return this.underlying().kind();
        }

        @Override
        default List<Type> getDependencies()
        {
            return this.underlying().getDependencies();
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated, Declaration<Alias>
    {
        @Override
        public Alias withPath(JavaPath path)
        {
            return new Alias(path, this.underlying());
        }

        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.path, this.underlying);
        }
    }
}
