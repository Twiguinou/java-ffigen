package fr.kenlek.jpgen.data;

import java.util.List;

public interface DependencyProvider
{
    List<Type> getDependencies();
}
