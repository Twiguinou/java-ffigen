package fr.kenlek.jpgen.data;

// Marker interface
public interface Feature
{
    interface Void {}

    class UnsupportedException extends RuntimeException
    {
        public UnsupportedException()
        {
            super();
        }
    }
}
