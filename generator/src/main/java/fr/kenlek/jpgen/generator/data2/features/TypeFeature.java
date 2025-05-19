package fr.kenlek.jpgen.generator.data2.features;

public interface TypeFeature<T>
{
    interface Void {}

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
