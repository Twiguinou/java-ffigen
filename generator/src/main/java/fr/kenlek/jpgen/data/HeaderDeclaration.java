package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public class HeaderDeclaration implements Declaration.CodeGenerator<HeaderDeclaration>
{
    public static final String DEFAULT_ALLOCATOR_NAME = "$segmentAllocator";

    public sealed static class Binding extends FunctionType.Wrapper permits IndirectBinding
    {
        public final String name;
        public final String allocatorName;

        public Binding(String name, FunctionType descriptorType, List<String> parametersNames, String allocatorName)
        {
            super(descriptorType, parametersNames);
            parametersNames.forEach(LanguageUtils::requireJavaIdentifier);
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
    }

    public static final class IndirectBinding extends Binding
    {
        public final String handle;

        public IndirectBinding(String name, FunctionType descriptorType, List<String> parametersNames, String allocatorName, String handle)
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

    public record Constant(String type, String name, String value) {}

    private final JavaPath m_path;
    public final List<Binding> bindings;
    public final List<Constant> constants;

    public HeaderDeclaration(JavaPath path, List<Binding> bindings, List<Constant> constants)
    {
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
    public HeaderDeclaration withPath(JavaPath path)
    {
        return new HeaderDeclaration(path, this.bindings, this.constants);
    }

    @Override
    public List<Type> getDependencies()
    {
        return this.bindings.stream()
                .flatMap(binding -> binding.getDependencies().stream())
                .toList();
    }

    protected void writeSourceData(PrintingContext context, JavaPath layoutsClass, String fieldPrefix, String functionPrefix) throws IOException
    {
        if (!this.constants.isEmpty())
        {
            context.breakLine();
            for (HeaderDeclaration.Constant constant : this.constants)
            {
                context.breakLine("%s%s %s = %s;", fieldPrefix, constant.type(), constant.name(), constant.value());
            }
        }

        LayoutReference.Descriptor descriptorReference = new LayoutReference.Descriptor(layoutsClass);
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
                context.breakLine("%1$s%2$s MTD_ADDRESS__%3$s = %4$s.GLOBAL_LOOKUP.findOrThrow(\"%3$s\");",
                        fieldPrefix, MEMORY_SEGMENT, binding.name, FOREIGN_UTILS);
                context.breakLine("%1$s%2$s MTD__%3$s = %4$s.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__%3$s, %5$s);",
                        fieldPrefix, METHOD_HANDLE, binding.name, FOREIGN_UTILS, makeFunctionDescriptor(binding.descriptorType, descriptorReference));

                handle = String.format("MTD__%s", binding.name);
            }

            // on a single line
            context.append("%s%s %s(", functionPrefix, binding.descriptorType.returnType().process(TypeReference.FUNCTION_RETURN), binding.name);
            if (needsAllocator)
            {
                context.append("%s %s", SEGMENT_ALLOCATOR, binding.allocatorName);
                if (!parameters.isEmpty()) context.append(", ");
            }
            context.append(makeJavaParameters(TypeReference.FUNCTION_PARAMETER, parameters)).breakLine(')');
            context.breakLine('{').pushControlFlow();

            StringBuilder result = new StringBuilder();
            result.append(handle).append(".invokeExact(");
            if (needsAllocator)
            {
                result.append(binding.allocatorName);
                if (!parameters.isEmpty()) result.append(", ");
            }
            result.append(processParameters(false, TypeOp.Location.FUNCTION, parameters)).append(")");

            context.append("try {");
            if (!binding.descriptorType.isVoid()) context.append("return ");
            context.breakLine("%s;}", binding.descriptorType.returnType().process(new TypeOp(true, TypeOp.Location.FUNCTION, result.toString())));
            context.breakLine("catch (%s _) {throw new %s();}", THROWABLE, ASSERTION_ERROR);

            context.popControlFlow().breakLine('}');
        }
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        this.emitClassPrefix(context);

        context.breakLine("public final class %s", this.path().tail());
        context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

        this.writeSourceData(context, layoutsClass, "public static final ", "public static ");

        context.popControlFlow().breakLine('}');
    }

    @Override
    public boolean printable()
    {
        return true;
    }

    public static class Specialized extends HeaderDeclaration
    {
        public final Inheritance<Specialized> inheritance;

        public Specialized(JavaPath path, List<Binding> bindings, List<Constant> constants,
                           Inheritance<Specialized> inheritance)
        {
            super(path, bindings, constants);
            this.inheritance = inheritance;
        }

        @Override
        public HeaderDeclaration withPath(JavaPath path)
        {
            return new Specialized(path, this.bindings, this.constants, this.inheritance);
        }

        @Override
        public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            this.emitClassPrefix(context);

            switch (this.inheritance)
            {
                case Inheritance.Base<Specialized> _ ->
                {
                    context.breakLine("public interface %s", this.path().tail());
                    context.breakLine('{').pushControlFlow();

                    this.writeSourceData(context, layoutsClass, "", "static ");
                }
                case Inheritance.Subclass(Inheritance.Element<Specialized> base) ->
                {
                    context.breakLine("public final class %s implements %s", this.path().tail(), base.value().path());
                    context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

                    this.writeSourceData(context, layoutsClass, "public static final ", "public static ");
                }
            }

            context.popControlFlow().breakLine('}');
        }
    }
}
