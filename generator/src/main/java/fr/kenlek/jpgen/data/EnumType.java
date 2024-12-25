package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.features.GetEnumConstant;
import fr.kenlek.jpgen.data.features.GetTypeReference;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Delegated for now, because we can't provide type safety without adding overhead.
public class EnumType implements Type.Delegated
{
    public record Constant(String name, long value)
    {
        public Constant
        {
            LanguageUtils.requireJavaIdentifier(name);
        }
    }

    protected final Type m_integralType;
    public final List<Constant> constants;

    public EnumType(Type integralType, List<Constant> constants)
    {
        if (constants.stream().map(Constant::name).distinct().count() != constants.size())
        {
            throw new IllegalArgumentException("Enum constants must have distinct names.");
        }

        this.m_integralType = integralType;
        this.constants = constants;
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

    public static class Decl extends EnumType implements Declaration.CodeGenerator
    {
        private final JavaPath m_path;

        public Decl(JavaPath path, Type integralType, List<Constant> constants)
        {
            super(integralType, constants);
            Declaration.checkPath(path);
            this.m_path = path;
        }

        public Decl(JavaPath path, EnumType enumType)
        {
            this(path, enumType.m_integralType, enumType.constants);
        }

        @Override
        public JavaPath path()
        {
            return this.m_path;
        }

        @Override
        public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
        {
            String typeString = this.process(GetTypeReference.ENUM_CONSTANT);
            this.emitClassPrefix(context);

            context.breakLine("public final class %s", this.path().tail());
            context.breakLine("{private %s() {}", this.path().tail()).pushControlFlow();

            context.breakLine();
            for (EnumType.Constant constant : this.constants)
            {
                String enumConstant = this.process(new GetEnumConstant(constant.value));
                context.breakLine("public static final %s %s = %s;", typeString, constant.name(), enumConstant);
            }

            context.popControlFlow().breakLine('}');
        }

        @Override
        public boolean printable()
        {
            return true;
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
            return this.m_constants.values();
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
            return new EnumType(this.integralType, List.copyOf(this.constants()));
        }

        public EnumType.Decl build(JavaPath path)
        {
            return new EnumType.Decl(path, this.integralType, List.copyOf(this.constants()));
        }
    }
}
