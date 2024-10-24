package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.HostReference;

import java.util.List;

public sealed interface Inheritance<T extends Declaration<?>> permits Inheritance.Base, Inheritance.Subclass
{
    record Element<T extends Declaration<?>>(HostReference host, T value) {}
    record Base<T extends Declaration<?>>(List<Element<T>> children) implements Inheritance<T> {}
    record Subclass<T extends Declaration<?>>(Element<T> base) implements Inheritance<T> {}
}
