package fr.kenlek.jpgen.generator.data.features;

public interface TypeFeature<T>
{
    interface Write {}

    @SuppressWarnings("unchecked")
    default T result(Object o)
    {
        return (T) o;
    }

    class UnsupportedException extends IllegalArgumentException
    {
        public UnsupportedException()
        {
            super();
        }
    }
}
