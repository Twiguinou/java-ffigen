package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public record HeaderDeclaration(JavaPath path, List<Binding> bindings, List<Constant> constants)
        implements Declaration.CodeGenerator
{
    public static final String DEFAULT_ALLOCATOR_NAME = "$segmentAllocator";

    public sealed static class Binding extends FunctionType.Wrapper permits IndirectBinding
    {
        public final String name;
        public final String allocatorName;
        private final List<String> m_parametersNames;

        public Binding(String name, Type.Reference<FunctionType> descriptorType, String allocatorName,
                       List<String> parametersNames)
        {
            super(descriptorType);
            parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
            this.m_parametersNames = parametersNames;
            this.name = name;
            this.allocatorName = allocatorName;
        }

        public Binding(String name, Type.Reference<FunctionType> descriptorType, List<String> parametersNames)
        {
            this(name, descriptorType, DEFAULT_ALLOCATOR_NAME, parametersNames);
        }

        public Binding(FunctionDeclaration declaration, String allocatorName)
        {
            this(declaration.path().name(), declaration.descriptorType, allocatorName, declaration.parametersNames());
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

        public IndirectBinding(String name, Type.Reference<FunctionType> descriptorType, String allocatorName,
                               List<String> parametersNames, String handle)
        {
            super(name, descriptorType, allocatorName, parametersNames);
            this.handle = handle;
        }

        public IndirectBinding(String name, Type.Reference<FunctionType> descriptorType, List<String> parametersNames,
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
        return this.bindings().stream()
                .flatMap(binding -> binding.getDependencies().stream())
                .toList();
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        LayoutReference.Descriptor descriptorReference = new LayoutReference.Descriptor(layoutsClass);
        this.emitClassPrefix(context);

        context.breakLine("public final class %s", this.path().name());
        context.breakLine("{private %s() {}", this.path().name()).pushControlFlow();

        if (!this.constants().isEmpty())
        {
            context.breakLine();
            for (HeaderDeclaration.Constant constant : this.constants())
            {
                context.breakLine("public static final %s %s = %s;",
                        constant.type(), constant.name(), constant.value());
            }
        }

        for (HeaderDeclaration.Binding binding : this.bindings())
        {
            FunctionType descriptorType = binding.descriptorType();
            List<FunctionType.Parameter> parameters = binding.parameters();
            boolean needsAllocator = descriptorType.hasCompositeReturnType();
            context.breakLine();

            String handle;
            if (binding instanceof HeaderDeclaration.IndirectBinding indirect)
            {
                handle = indirect.handle;
            }
            else
            {
                context.breakLine("public static final %1$s MTD_ADDRESS__%2$s = %3$s.GLOBAL_LOOKUP.findOrThrow(\"%2$s\");",
                        MEMORY_SEGMENT, binding.name, FOREIGN_UTILS);
                context.breakLine("public static final %1$s MTD__%2$s = %3$s.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__%2$s, %4$s);",
                        METHOD_HANDLE, binding.name, FOREIGN_UTILS, makeFunctionDescriptor(descriptorType, descriptorReference));

                handle = String.format("MTD__%s", binding.name);
            }

            // on a single line
            context.append("public static %s %s(", descriptorType.returnType().process(TypeReference.FUNCTION), binding.name);
            if (needsAllocator)
            {
                context.append("%s %s", SEGMENT_ALLOCATOR, binding.allocatorName);
                if (!parameters.isEmpty()) context.append(", ");
            }
            context.breakLine("%s)", makeJavaParameters(TypeReference.FUNCTION, parameters));
            context.breakLine('{').pushControlFlow();

            StringBuilder result = new StringBuilder();
            result.append(handle).append(".invokeExact(");
            if (needsAllocator)
            {
                result.append(binding.allocatorName);
                if (!parameters.isEmpty()) result.append(", ");
            }
            result.append(processParameters(false, parameters)).append(")");

            context.append("try {");
            if (!descriptorType.isVoid()) context.append("return ");
            context.breakLine("%s;}", descriptorType.returnType().process(new TypeOp(true, result.toString())));
            context.breakLine("catch (%s _) {throw new %s();}", THROWABLE, ASSERTION_ERROR);

            context.popControlFlow().breakLine('}');
        }

        context.popControlFlow().breakLine('}');
    }
}
