package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.data2.features.CommonFlags;
import fr.kenlek.jpgen.generator.data2.features.TypeFeature;

public interface Type
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
    }

    Type VOID = new Virtual()
    {
        @Override
        public <T> T apply(TypeFeature<? extends T> feature)
        {
            return feature.result(switch (feature)
            {
                case CommonFlags _ -> false;
                default -> throw new TypeFeature.UnsupportedException();
            });
        }

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

        default Type resolve()
        {
            Type underlying = this.underlying();
            return underlying instanceof Delegated delegated ? delegated.resolve() : underlying;
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated {}

    record OpaqueReference(Type underlying) implements Delegated {}
}
