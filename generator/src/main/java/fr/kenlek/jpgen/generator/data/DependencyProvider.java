package fr.kenlek.jpgen.generator.data;

import java.util.List;

public interface DependencyProvider
{
    List<? extends DependencyProvider> dependencies();
}
