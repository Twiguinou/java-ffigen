package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.data.features.TypeFeature;
import java.util.List;

public interface Type extends DependencyProvider
{
    default Type flatten()
    {
        return this;
    }

    default <T> T apply(TypeFeature<T> feature)
    {
        throw new UnsupportedOperationException(feature.toString());
    }

    default void apply(TypeFeature.Void feature)
    {
        throw new UnsupportedOperationException(feature.toString());
    }

    interface Delegated extends Type
    {
        Type underlying();

        @Override
        default Type flatten()
        {
            return this.underlying().flatten();
        }

        @Override
        default List<Type> dependencies()
        {
            return this.underlying().dependencies();
        }

        @Override
        default <T> T apply(TypeFeature<T> feature)
        {
            return this.underlying().apply(feature);
        }

        @Override
        default void apply(TypeFeature.Void feature)
        {
            this.underlying().apply(feature);
        }
    }

    record OpaqueReference(Type underlying) implements Delegated {}
}
