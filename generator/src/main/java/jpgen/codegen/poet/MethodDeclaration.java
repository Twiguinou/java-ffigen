package jpgen.codegen.poet;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public record MethodDeclaration(Visibility visibility, boolean isStatic, boolean isFinal, @Nullable ClassLocation returnTypeLocation,
                                String name, Iterable<Parameter> parameters, boolean variadic, Iterable<CodeLine> lines) implements Declaration
{
    public record Parameter(ClassLocation typeLocation, String name)
    {
        @Override
        public boolean equals(Object o)
        {
            return o == this || (o instanceof Parameter param && param.name.equals(this.name));
        }

        @Override
        public int hashCode()
        {
            return this.name.hashCode();
        }
    }

    public record CodeLine(Kind kind, String data)
    {
        public enum Kind
        {
            INSTRUCTION,
            PUSH_CONTROL_FLOW,
            POP_CONTROL_FLOW,
            NO_OP
        }
    }

    public static class Builder
    {
        public final Visibility visibility;
        public final boolean isStatic, isFinal;
        public final @Nullable ClassLocation returnTypeLocation;
        public final String name;
        public final boolean variadic;
        private final Set<Parameter> m_parameters = new LinkedHashSet<>();
        private final List<CodeLine> m_lines = new ArrayList<>();
        private int m_controlFlowCount = 0;

        public Builder(Visibility visibility, boolean isStatic, boolean isFinal,
                       @Nullable ClassLocation returnTypeLocation, String name, boolean variadic)
        {
            this.visibility = visibility;
            this.isStatic = isStatic;
            this.isFinal = isFinal;
            this.returnTypeLocation = returnTypeLocation;
            this.name = name;
            this.variadic = variadic;
        }

        public Iterable<Parameter> parameters()
        {
            return this.m_parameters;
        }

        public Iterable<CodeLine> lines()
        {
            return this.m_lines;
        }

        public Builder appendParameter(Parameter parameter)
        {
            if (!this.m_parameters.add(parameter))
            {
                throw new IllegalArgumentException(STR."Parameter \{parameter.name} is already declared.");
            }

            return this;
        }

        public Builder appendInstruction(String line)
        {
            this.m_lines.add(new CodeLine(CodeLine.Kind.INSTRUCTION, line));
            return this;
        }

        public Builder appendNoOp()
        {
            this.m_lines.add(new CodeLine(CodeLine.Kind.NO_OP, null));
            return this;
        }

        public Builder pushControlFlow()
        {
            ++this.m_controlFlowCount;
            this.m_lines.add(new CodeLine(CodeLine.Kind.PUSH_CONTROL_FLOW, "{"));
            return this;
        }

        public Builder popControlFlow()
        {
            if (this.m_controlFlowCount > 0)
            {
                --this.m_controlFlowCount;
                this.m_lines.add(new CodeLine(CodeLine.Kind.POP_CONTROL_FLOW, "}"));
            }

            return this;
        }

        public MethodDeclaration build()
        {
            if (this.m_controlFlowCount > 0)
            {
                throw new IllegalStateException("Remaining control flow.");
            }

            if (this.variadic && this.m_parameters.isEmpty())
            {
                throw new IllegalStateException("Method without parameters cannot be declared variadic.");
            }

            return new MethodDeclaration(this.visibility, this.isStatic, this.isFinal, this.returnTypeLocation, this.name,
                    List.copyOf(this.m_parameters), this.variadic, List.copyOf(this.m_lines));
        }
    }

    @Override
    public Scope scope()
    {
        return this.isStatic ? Scope.STATIC : Scope.INSTANCE;
    }

    @Override
    public Mutability mutability()
    {
        return this.isFinal ? Mutability.FINAL : Mutability.MUTABLE;
    }

    @Override
    public void print(OutputContext context) throws IOException
    {
        // Modifiers
        if (this.isStatic) context.append("static ");
        if (this.isFinal) context.append("final ");
        if (this.returnTypeLocation != null) context.append(this.returnTypeLocation.classpath()).append(' ');
        context.append(this.name);

        // Parameters
        context.append('(');
        Iterator<Parameter> parameterIterator = this.parameters.iterator();
        if (parameterIterator.hasNext())
        {
            Parameter parameter = parameterIterator.next();
            context.append(parameter.typeLocation.classpath());
            while (parameterIterator.hasNext())
            {
                context.append(' ').append(parameter.name).append(", ");
                parameter = parameterIterator.next();
                context.append(parameter.typeLocation.classpath());
            }

            if (this.variadic)
            {
                context.append("...");
            }

            context.append(' ').append(parameter.name);
        }
        context.breakLine(')');

        Iterator<CodeLine> lineIterator = this.lines.iterator();
        if (!lineIterator.hasNext())
        {
            context.breakLine(';');
            return;
        }

        // Begin method control flow
        context.breakLine('{');
        context.pushControlFlow();

        // Actual code
        for (CodeLine line : this.lines)
        {
            if (line.kind == CodeLine.Kind.NO_OP) continue;

            context.breakLine(line.data);
            if (line.kind == CodeLine.Kind.PUSH_CONTROL_FLOW)
            {
                context.pushControlFlow();
            }
            else if (line.kind == CodeLine.Kind.POP_CONTROL_FLOW)
            {
                context.popControlFlow();
            }
        }

        // End method control flow
        context.popControlFlow();
        context.append('}');
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o instanceof MethodDeclaration method && method.name.equals(this.name))
        {
            Iterator<Parameter> it1 = method.parameters.iterator(), it2 = this.parameters.iterator();
            while (it1.hasNext())
            {
                if (!it2.hasNext() || !it1.next().typeLocation.equals(it2.next().typeLocation))
                {
                    return false;
                }
            }

            return !it2.hasNext();
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
}
