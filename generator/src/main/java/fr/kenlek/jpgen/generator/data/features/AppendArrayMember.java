package fr.kenlek.jpgen.generator.data.features;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeSpec;

public record AppendArrayMember(TypeSpec.Builder builder, ClassName layouts, CodeBlock sequenceLayout, String name, String offsetFieldName)
    implements TypeFeature.Void
{}
