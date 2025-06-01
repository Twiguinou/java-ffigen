package fr.kenlek.jpgen.generator.data.features;

import fr.kenlek.jpgen.generator.data.JavaPath;

public record GetLayout(JavaPath layoutsClass) implements TypeFeature<String> {}
