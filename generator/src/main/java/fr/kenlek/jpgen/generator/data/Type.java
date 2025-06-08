package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.GetLayout;
import fr.kenlek.jpgen.generator.data.features.HeaderFlag;
import fr.kenlek.jpgen.generator.data.features.HintWriteFeature;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data.features.PrintMember;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

public interface Type extends DependencyProvider
{
    static Type resolve(Type type)
    {
        return type instanceof Delegated delegated ? delegated.resolve() : type;
    }

    /// Construct and return the symbolic name representing this very type.
    /// The returned [String] must be a valid and unique Java identifier.
    String symbolicName();

    default void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
    {
        throw new TypeFeature.UnsupportedException();
    }

    default <T> T apply(TypeFeature<? extends T> feature)
    {
        throw new TypeFeature.UnsupportedException();
    }

    /// A type that lacks memory representation, this includes size and alignment.
    interface Virtual extends Type
    {
        @Override
        default String symbolicName()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default List<? extends DependencyProvider> dependencies()
        {
            return List.of();
        }
    }

    Type VOID = new Virtual()
    {
        @Override
        public <T> T apply(TypeFeature<? extends T> feature)
        {
            if (feature == HeaderFlag.APPEND_ALLOCATOR)
            {
                return feature.result(false);
            }

            return feature.result(switch (feature)
            {
                case JavaTypeString(JavaTypeString.Target target, _, _)
                    when target == JavaTypeString.Target.HEADER_RETURN || target == JavaTypeString.Target.CALLBACK_RETURN -> "void";
                default -> throw new TypeFeature.UnsupportedException();
            });
        }

        @Override
        public String toString()
        {
            return "Void";
        }
    };

    record Array(Type element, long length) implements Type
    {
        public Array
        {
            if (length <= 0)
            {
                throw new IllegalArgumentException("Array length must be strictly greater than zero.");
            }
        }

        @Override
        public String symbolicName()
        {
            return "ARRAY_%d__%s".formatted(this.length(), this.element().symbolicName());
        }

        @Override
        public void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
        {
            switch (feature)
            {
                case HintWriteFeature.PRINT_LAYOUT -> context.breakLine("public static final %s %s = %s.sequenceLayout(%dl, %s);",
                    SEQUENCE_LAYOUT, this.symbolicName(), MEMORY_LAYOUT, this.length(),
                    this.element().apply(new GetLayout(JavaPath.EMPTY))
                );
                case PrintMember _ ->
                {
                    if (feature instanceof PrintMember.Plain plain && plain.member.name != null)
                    {
                        String name = plain.member.name;

                        context.breakLine();
                        context.breakLine("public static final long MEMBER_OFFSET__%s = %s;", name, plain.member.containerByteOffset(plain.layoutsClass));
                        context.breakLine("public %s %s()", MEMORY_SEGMENT, name);
                        context.breakLine('{').pushControlFlow();
                        context.breakLine("return this.pointer().asSlice(MEMBER_OFFSET__%s, %s);", name, plain.layoutsClass.child(this.symbolicName()));
                        context.popControlFlow().breakLine('}');

                        this.element().apply(new PrintMember.Array(plain.layoutsClass, name), context);
                    }
                }
                default -> throw new TypeFeature.UnsupportedException();
            }
        }

        @Override
        public <T> T apply(TypeFeature<? extends T> feature)
        {
            if (feature == HeaderFlag.APPEND_ALLOCATOR)
            {
                return feature.result(false);
            }

            return feature.result(switch (feature)
            {
                case JavaTypeString _ -> MEMORY_SEGMENT;
                case GetLayout(JavaPath layoutsClass) -> layoutsClass.child(this.symbolicName()).toString();
                default -> throw new TypeFeature.UnsupportedException();
            });
        }

        @Override
        public List<? extends DependencyProvider> dependencies()
        {
            return Stream.concat(
                this.element().dependencies().stream(),
                Stream.of(this)
            ).toList();
        }
    }

    /// This interface provides an easy way to decorate another type.
    interface Delegated extends Type
    {
        Type underlying();

        @Override
        default String symbolicName()
        {
            return this.underlying().symbolicName();
        }

        @Override
        default void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
        {
            this.underlying().apply(feature, context);
        }

        @Override
        default <T> T apply(TypeFeature<? extends T> feature)
        {
            return this.underlying().apply(feature);
        }

        @Override
        default List<? extends DependencyProvider> dependencies()
        {
            return this.underlying().dependencies();
        }

        default Type resolve()
        {
            Type underlying = this.underlying();
            return underlying instanceof Delegated delegated ? delegated.resolve() : underlying;
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated, Declaration
    {
        public Alias
        {
            Declaration.checkPath(path);
        }
    }

    record OpaqueReference(Type underlying) implements Delegated {}
}
