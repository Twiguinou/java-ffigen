package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;

public interface Feature
{
    interface Opt
    {
        PrintingContext context();
    }

    interface Flag {}

    class UnsupportedException extends IllegalArgumentException
    {
        public UnsupportedException()
        {
            super();
        }
    }
}
