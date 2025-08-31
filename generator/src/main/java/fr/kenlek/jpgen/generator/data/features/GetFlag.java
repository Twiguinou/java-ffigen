package fr.kenlek.jpgen.generator.data.features;

public enum GetFlag implements TypeFeature<Boolean>
{
    NEEDS_ALLOCATOR;

    @Override
    public Boolean check(Object result)
    {
        return (Boolean) result;
    }
}
