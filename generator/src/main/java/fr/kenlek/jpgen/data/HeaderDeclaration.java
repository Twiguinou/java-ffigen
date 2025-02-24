package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.features.GetLayout;
import fr.kenlek.jpgen.data.features.GetTypeReference;
import fr.kenlek.jpgen.data.features.ProcessTypeValue;
import fr.kenlek.jpgen.data.path.JavaPath;
import org.jspecify.annotations.NonNull;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public class HeaderDeclaration implements Declaration.CodeGenerator
{
    public static final String DEFAULT_ALLOCATOR_NAME = "$segmentAllocator";

    public sealed static class Binding extends FunctionType.Wrapper implements Comparable<Binding>
        permits IndirectBinding
    {
        public final String name;
        public final String allocatorName;

        public Binding(String name, FunctionType descriptorType, List<String> parametersNames, String allocatorName)
        {
            super(descriptorType, parametersNames);
            LanguageUtils.requireJavaIdentifier(name);
            LanguageUtils.requireJavaIdentifier(allocatorName);

            this.name = name;
            this.allocatorName = allocatorName;
        }

        public Binding(String name, FunctionType descriptorType, List<String> parametersNames)
        {
            this(name, descriptorType, parametersNames, DEFAULT_ALLOCATOR_NAME);
        }

        public Binding(FunctionDeclaration declaration, String allocatorName)
        {
            this(declaration.path().tail(), declaration.descriptorType, declaration.parametersNames, allocatorName);
        }

        public Binding(FunctionDeclaration declaration)
        {
            this(declaration, DEFAULT_ALLOCATOR_NAME);
        }

        @Override
        public int compareTo(@NonNull Binding binding)
        {
            int nameCV = this.name.compareTo(binding.name);
            if (nameCV != 0)
            {
                return nameCV;
            }

            int parameterCountCV = Integer.compare(this.parametersNames.size(), binding.parametersNames.size());
            if (parameterCountCV != 0)
            {
                return parameterCountCV;
            }

            Iterator<Type> p1 = this.descriptorType.parametersTypes().iterator();
            Iterator<Type> p2 = binding.descriptorType.parametersTypes().iterator();
            while (p1.hasNext())
            {
                String type1 = p1.next().process(GetTypeReference.FUNCTION_PARAMETER);
                String type2 = p2.next().process(GetTypeReference.FUNCTION_PARAMETER);
                int typeCV = type1.compareTo(type2);
                if (typeCV != 0)
                {
                    return typeCV;
                }
            }

            return 0;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (obj instanceof Binding binding && this.name.equals(binding.name) && this.parametersNames.size() == binding.parametersNames.size())
            {
                Iterator<Type> p1 = this.descriptorType.parametersTypes().iterator();
                Iterator<Type> p2 = binding.descriptorType.parametersTypes().iterator();
                while (p1.hasNext())
                {
                    String type1 = p1.next().process(GetTypeReference.FUNCTION_PARAMETER);
                    String type2 = p2.next().process(GetTypeReference.FUNCTION_PARAMETER);
                    if (!type1.equals(type2))
                    {
                        return false;
                    }
                }

                return true;
            }

            return false;
        }
    }

    public static final class IndirectBinding extends Binding
    {
        public final String handle;

        public IndirectBinding(String name, FunctionType descriptorType, List<String> parametersNames,
                               String allocatorName, String handle)
        {
            super(name, descriptorType, parametersNames, allocatorName);
            this.handle = handle;
        }

        public IndirectBinding(String name, FunctionType descriptorType, List<String> parametersNames, String handle)
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

    public record Constant(String type, String name, String value)
    {
        public Constant
        {
            LanguageUtils.requireJavaIdentifier(name);
        }
    }

    private final JavaPath m_path;
    public final List<Binding> bindings;
    public final List<Constant> constants;

    public HeaderDeclaration(JavaPath path, List<Binding> bindings, List<Constant> constants)
    {
        Declaration.checkPath(path);
        if (constants.stream().map(Constant::name).distinct().count() != constants.size())
        {
            throw new IllegalArgumentException("Header constants must have distinct names.");
        }

        if (bindings.stream().distinct().count() != bindings.size())
        {
            throw new IllegalArgumentException("Header bindings must be distinct.");
        }

        this.m_path = path;
        this.bindings = bindings;
        this.constants = constants;
    }

    public HeaderDeclaration(JavaPath path, List<Binding> bindings)
    {
        this(path, bindings, List.of());
    }

    @Override
    public JavaPath path()
    {
        return this.m_path;
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.bindings.stream()
            .flatMap(binding -> binding.getDependencies().stream())
            .toList();
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        context.breakLine("public final class %s", this.path().tail());
        context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

        if (!this.constants.isEmpty())
        {
            context.breakLine();
            for (HeaderDeclaration.Constant constant : this.constants)
            {
                context.breakLine("public static final %s %s = %s;", constant.type(), constant.name(), constant.value());
            }
        }

        GetLayout.ForDescriptor forDescriptor = new GetLayout.ForDescriptor(layoutsClass);
        for (HeaderDeclaration.Binding binding : this.bindings)
        {
            List<FunctionType.Parameter> parameters = binding.createParameters();
            boolean needsAllocator = binding.descriptorType.hasCompositeReturnType();
            context.breakLine();

            String handle;
            if (binding instanceof HeaderDeclaration.IndirectBinding indirect)
            {
                handle = indirect.handle;
            }
            else
            {
                context.breakLine("public static final %1$s MTD_ADDRESS__%2$s = %3$s.loaderLookup().findOrThrow(\"%2$s\");", MEMORY_SEGMENT, binding.name, SYMBOL_LOOKUP);
                context.breakLine("public static final %1$s MTD__%2$s = %3$s.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__%2$s, %4$s);",
                    METHOD_HANDLE, binding.name, FOREIGN_UTILS, makeFunctionDescriptor(binding.descriptorType, forDescriptor)
                );

                handle = "MTD__".concat(binding.name);
            }

            // on a single line
            context.append("public static %s %s(", binding.descriptorType.returnType()
                .process(GetTypeReference.FUNCTION_RETURN), binding.name);
            if (needsAllocator)
            {
                context.append("%s %s", SEGMENT_ALLOCATOR, binding.allocatorName);
                if (!parameters.isEmpty())
                {
                    context.append(", ");
                }
            }
            context.append(makeJavaParameters(GetTypeReference.FUNCTION_PARAMETER, parameters)).breakLine(')');
            context.breakLine('{').pushControlFlow();

            StringBuilder result = new StringBuilder();
            result.append(handle).append(".invokeExact(");
            if (needsAllocator)
            {
                result.append(binding.allocatorName);
                if (!parameters.isEmpty())
                {
                    result.append(", ");
                }
            }
            result.append(processParameters(false, ProcessTypeValue.Location.FUNCTION, parameters)).append(")");

            context.append("try {");
            if (!binding.descriptorType.isVoid())
            {
                context.append("return ");
            }
            context.breakLine("%s;}", binding.descriptorType.returnType()
                .process(new ProcessTypeValue(true, ProcessTypeValue.Location.FUNCTION, result.toString())));
            context.breakLine("catch (%s _) {throw new %s();}", THROWABLE, ASSERTION_ERROR);

            context.popControlFlow().breakLine('}');
        }

        context.popControlFlow().breakLine('}');
    }

    @Override
    public boolean printable()
    {
        return true;
    }
}
