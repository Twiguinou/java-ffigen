package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.Feature;
import fr.kenlek.jpgen.generator.data2.features.GetLayout;
import fr.kenlek.jpgen.generator.data2.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data2.features.PrintLayout;
import fr.kenlek.jpgen.generator.data2.features.TypeFeature;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.generator.data2.CodeUtils.*;

public interface Type extends DependencyProvider
{
    static Type resolve(Type type)
    {
        return type instanceof Delegated delegated ? delegated.resolve() : type;
    }

    /// Construct and return the symbolic name representing this very type.
    /// The returned [String] must be a valid and unique Java identifier.
    String symbolicName();

    default void apply(TypeFeature.Void feature)
    {
        throw new TypeFeature.UnsupportedException();
    }

    default <T> T apply(TypeFeature<? extends T> feature)
    {
        throw new TypeFeature.UnsupportedException();
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
        default List<? extends DependencyProvider> dependencies()
        {
            return List.of();
        }
    }

    Type VOID = new Virtual()
    {
        @Override
        public String toString()
        {
            return "Void";
        }
    };

    record Array(Type element, long length) implements Type
    {
        public Array
        {
            if (length <= 0)
            {
                throw new IllegalArgumentException("Array length must be strictly greater than zero.");
            }
        }

        @Override
        public String symbolicName()
        {
            return "ARRAY_%d__%s".formatted(this.length(), this.element().symbolicName());
        }

        @Override
        public void apply(TypeFeature.Void feature)
        {
            try
            {
                if (feature instanceof PrintLayout(PrintingContext context))
                {
                    context.breakLine("public static final %s %s = %s.sequenceLayout(%dl, %s);",
                        SEQUENCE_LAYOUT, this.symbolicName(), MEMORY_LAYOUT, this.length(),
                        this.element().apply(new GetLayout(JavaPath.EMPTY))
                    );
                }
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        @Override
        public <T> T apply(TypeFeature<? extends T> feature)
        {
            return feature.result(switch (feature)
            {
                case JavaTypeString _ -> MEMORY_SEGMENT;
                default -> throw new Feature.UnsupportedException();
            });
        }

        @Override
        public List<? extends DependencyProvider> dependencies()
        {
            return Stream.concat(
                this.element().dependencies().stream(),
                Stream.of(this)
            ).toList();
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
        default void apply(TypeFeature.Void feature)
        {
            this.underlying().apply(feature);
        }

        @Override
        default <T> T apply(TypeFeature<? extends T> feature)
        {
            return this.underlying().apply(feature);
        }

        @Override
        default List<? extends DependencyProvider> dependencies()
        {
            return this.underlying().dependencies();
        }

        default Type resolve()
        {
            Type underlying = this.underlying();
            return underlying instanceof Delegated delegated ? delegated.resolve() : underlying;
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated, Declaration
    {
        public Alias
        {
            Declaration.checkPath(path);
        }
    }

    record OpaqueReference(Type underlying) implements Delegated {}
}
