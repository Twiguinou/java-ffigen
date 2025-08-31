package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeSpec;

public record AppendLayouts(TypeSpec.Builder builder, ClassName layouts) implements TypeFeature.Void {}
