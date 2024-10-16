package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;

import java.util.List;

public record HeaderDeclaration(JavaPath path, List<Binding> bindings, List<Constant> constants) implements Declaration
{
    public static final String DEFAULT_ALLOCATOR_NAME = "$segmentAllocator";

    public sealed static class Binding extends FunctionType.Wrapper permits IndirectBinding
    {
        public final String name;
        public final String allocatorName;
        private final List<String> m_parametersNames;

        public Binding(String name, Type descriptorType, String allocatorName,
                       List<String> parametersNames)
        {
            super(descriptorType);
            parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
            this.m_parametersNames = parametersNames;
            this.name = name;
            this.allocatorName = allocatorName;
        }

        public Binding(String name, Type descriptorType, List<String> parametersNames)
        {
            this(name, descriptorType, DEFAULT_ALLOCATOR_NAME, parametersNames);
        }

        public Binding(FunctionDeclaration declaration, String allocatorName)
        {
            this(declaration.path().name(), declaration.rawDescriptorType,
                    allocatorName, declaration.parametersNames());
        }

        public Binding(FunctionDeclaration declaration)
        {
            this(declaration, DEFAULT_ALLOCATOR_NAME);
        }

        @Override
        public List<String> parametersNames()
        {
            return this.m_parametersNames;
        }
    }

    public static final class IndirectBinding extends Binding
    {
        public final String handle;

        public IndirectBinding(String name, Type descriptorType, String allocatorName,
                               List<String> parametersNames, String handle)
        {
            super(name, descriptorType, allocatorName, parametersNames);
            this.handle = handle;
        }

        public IndirectBinding(String name, Type descriptorType, List<String> parametersNames,
                               String handle)
        {
            super(name, descriptorType, parametersNames);
            this.handle = handle;
        }

        public IndirectBinding(FunctionDeclaration declaration, String allocatorName, String handle)
        {
            super(declaration, allocatorName);
            this.handle = handle;
        }

        public IndirectBinding(FunctionDeclaration declaration, String handle)
        {
            super(declaration);
            this.handle = handle;
        }
    }

    public record Constant(String type, String name, String value) {}

    public HeaderDeclaration(JavaPath path, List<Binding> bindings)
    {
        this(path, bindings, List.of());
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.bindings.stream()
                .flatMap(binding -> binding.getDependencies().stream())
                .toList();
    }
}
