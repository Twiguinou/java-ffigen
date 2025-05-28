package fr.kenlek.jpgen.generator.data2;

import java.util.List;

public interface DependencyProvider
{
    List<? extends DependencyProvider> dependencies();
}
