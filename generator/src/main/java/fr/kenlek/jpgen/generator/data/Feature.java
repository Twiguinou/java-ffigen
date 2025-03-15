package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;

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
