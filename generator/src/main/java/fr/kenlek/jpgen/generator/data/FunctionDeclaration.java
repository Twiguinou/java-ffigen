package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.CodeBlock;

import java.util.List;
import java.util.Optional;

public record FunctionDeclaration(Optional<CodeBlock> javadoc, String name, FunctionType type,
                                  List<ParameterInfo> parameterInfos)
{
    public FunctionDeclaration(Optional<CodeBlock> javadoc, String name, FunctionType type,
                               List<ParameterInfo> parameterInfos)
    {
        type.checkParameterInfos(parameterInfos);
        this.javadoc = javadoc;
        this.name = name;
        this.type = type;
        this.parameterInfos = List.copyOf(parameterInfos);
    }

    public FunctionDeclaration(String name, FunctionType type, List<ParameterInfo> parameterInfos)
    {
        this(Optional.empty(), name, type, parameterInfos);
    }
}
