package fr.kenlek.jpgen.generator.data.features;

public interface TypeFeature<T>
{
    interface Void {}

    T check(Object result);
}
