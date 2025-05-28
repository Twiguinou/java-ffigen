package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data2.features.EnumConstant;
import fr.kenlek.jpgen.generator.data2.features.JavaTypeString;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static fr.kenlek.jpgen.generator.LanguageUtils.requireJavaIdentifier;

// Delegated for now, because we can't provide type safety without adding overhead.
public class EnumType implements Type.Delegated
{
    public record Constant(String name, long value)
    {
        public Constant
        {
            requireJavaIdentifier(name);
        }
    }

    private final Type m_integralType;
    public final List<Constant> constants;

    private EnumType(Type integralType, List<Constant> constants, boolean copy)
    {
        if (constants.stream().map(Constant::name).distinct().count() != constants.size())
        {
            throw new IllegalArgumentException("Enum constants must have distinct names.");
        }

        this.m_integralType = integralType;
        this.constants = copy ? List.copyOf(constants) : constants;
    }

    private EnumType(Type integralType, List<Constant> constants)
    {
        this(integralType, constants, true);
    }

    @Override
    public Type underlying()
    {
        return this.m_integralType;
    }

    @Override
    public String toString()
    {
        if (this.constants.isEmpty())
        {
            return "Enum[integerType=%s]".formatted(this.underlying());
        }

        return "Enum[integerType=%s, constants={%s}]".formatted(this.underlying(),
                this.constants.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public static class Decl extends EnumType implements Declaration.Writable
    {
        private final JavaPath m_path;

        public Decl(JavaPath path, Type integralType, List<Constant> constants, boolean copy)
        {
            super(integralType, constants, copy);
            this.m_path = Declaration.checkPath(path);
        }

        public Decl(JavaPath path, Type integralType, List<Constant> constants)
        {
            this(path, integralType, constants, true);
        }

        public Decl(JavaPath path, EnumType enumType)
        {
            this(path, enumType.underlying(), enumType.constants, false);
        }

        @Override
        public JavaPath path()
        {
            return this.m_path;
        }

        @Override
        public void write(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            String typePath = this.apply(new JavaTypeString(JavaTypeString.Target.ENUM_CONSTANT_TYPE, layoutsClass));
            this.emitClassPrefix(context);

            context.breakLine("public final class %s", this.path().tail());
            context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

            context.breakLine();
            for (Constant constant : this.constants)
            {
                String valueString = this.apply(new EnumConstant(constant.value));
                context.breakLine("public static final %s %s = %s;", typePath, constant.name(), valueString);
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public String toString()
        {
            if (this.constants.isEmpty())
            {
                return "EnumDeclaration[%s, integerType=%s]".formatted(this.path(), this.underlying());
            }

            return "EnumDeclaration[%s, integerType=%s, constants={%s}]".formatted(this.path(), this.underlying(),
                    this.constants.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }

    public static class Builder
    {
        public final Type integralType;
        private final Map<String, Constant> m_constants = new LinkedHashMap<>();

        public Builder(Type integralType)
        {
            this.integralType = integralType;
        }

        public Builder(Type integralType, List<Constant> constants)
        {
            this(integralType);
            constants.forEach(this::addConstant);
        }

        public Builder(EnumType enumType)
        {
            this(enumType.underlying(), enumType.constants);
        }

        public Collection<Constant> constants()
        {
            return Collections.unmodifiableCollection(this.m_constants.values());
        }

        public Builder addConstant(Constant constant)
        {
            this.m_constants.put(constant.name, constant);
            return this;
        }

        public Builder addConstant(String name, long value)
        {
            return this.addConstant(new Constant(name, value));
        }

        public Builder removeConstant(String name)
        {
            this.m_constants.remove(name);
            return this;
        }

        public EnumType build()
        {
            return new EnumType(this.integralType, List.copyOf(this.constants()), false);
        }

        public Decl build(JavaPath path)
        {
            return new Decl(path, this.integralType, List.copyOf(this.constants()), false);
        }
    }
}
