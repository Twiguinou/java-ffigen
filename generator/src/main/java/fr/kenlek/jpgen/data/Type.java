package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.features.GetLayout;
import fr.kenlek.jpgen.data.features.GetTypeReference;
import fr.kenlek.jpgen.data.features.PrintLayout;
import fr.kenlek.jpgen.data.features.PrintMember;
import fr.kenlek.jpgen.data.features.ProcessTypeValue;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public interface Type extends DependencyProvider
{
    interface InputLocation {}

    /// Construct and return the symbolic name representing this very type.
    /// The returned [String] must be a valid and unique Java identifier.
    String symbolicName();

    TypeKind kind();

    void consume(Feature.Void feature) throws IOException;

    String process(Feature feature);

    default Type resolve()
    {
        return this;
    }

    /// A type that lacks memory representation, this includes size and alignment.
    interface Virtual extends Type
    {
        @Override
        default String symbolicName()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default void consume(Feature.Void feature)
        {
            throw new Feature.UnsupportedException();
        }

        @Override
        default String process(Feature feature)
        {
            throw new Feature.UnsupportedException();
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
        public String process(Feature feature)
        {
            return switch (feature)
            {
                case GetTypeReference.CALLBACK_RAW_RETURN, GetTypeReference.CALLBACK_RETURN, GetTypeReference.FUNCTION_RETURN -> "void";
                case ProcessTypeValue(_, _, String element) -> element;
                default -> Virtual.super.process(feature);
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
        public void consume(Feature.Void feature) throws IOException
        {
            if (feature instanceof PrintLayout(PrintingContext context, PrintLayout.Location location) && location == PrintLayout.Location.LAYOUTS_CLASS)
            {
                context.breakLine("public static final %s %s = %s.sequenceLayout(%d, %s);",
                        SEQUENCE_LAYOUT, this.symbolicName(), MEMORY_LAYOUT, this.length(), this.element().process(new GetLayout.ForPhysical(JavaPath.EMPTY)));
            }
            else if (feature instanceof PrintMember.Plain plain && plain.member.name().isPresent())
            {
                String name = plain.member.name().orElseThrow();

                plain.context.breakLine();
                plain.writeConstant(context -> context.append("long MEMBER_OFFSET__%s = %s", name, plain.member.containerByteOffset(plain.layoutsClass)));
                plain.writeFunction(true,
                        context -> context.append("%s %s()", MEMORY_SEGMENT, name),
                        context -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s);", plain.pointer, name, plain.layoutsClass.child(this.symbolicName())));
                this.element().consume(new PrintMember.Array(plain.context, plain.layoutsClass, name));
            }
        }

        @Override
        public String process(Feature feature)
        {
            return switch (feature)
            {
                case GetLayout.ForDescriptor descriptor -> descriptor.processLayout(FOREIGN_UTILS.concat(".UNBOUNDED_POINTER"));
                case GetLayout layout -> layout.processLayout(layout.layoutsClass.child(this.symbolicName()));
                case GetTypeReference typeReference when typeReference.isMethod() -> MEMORY_SEGMENT;
                case ProcessTypeValue typeValue -> typeValue.cast(MEMORY_SEGMENT);
                default -> throw new Feature.UnsupportedException();
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
        default void consume(Feature.Void feature) throws IOException
        {
            if (!(feature instanceof PrintLayout layout && layout.location() == PrintLayout.Location.LAYOUTS_CLASS))
            {
                this.underlying().consume(feature);
            }
        }

        @Override
        default String process(Feature feature)
        {
            return this.underlying().process(feature);
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

        @Override
        default Type resolve()
        {
            return this.underlying().resolve();
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated, Declaration<Alias>
    {
        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.path, this.underlying);
        }
    }

    record OpaqueReference(Type underlying) implements Delegated
    {
        @Override
        public String toString()
        {
            return this.underlying().toString();
        }
    }
}
