package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.Type;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
public interface TypeProcessor
{
    TypeProcessor IDENTITY = (_, _, _, resolvedType, _) -> resolvedType;

    static TypeProcessor consumer(Consumer<? super Type> consumer)
    {
        return (_, _, _, resolvedType, _) ->
        {
            consumer.accept(resolvedType);
            return resolvedType;
        };
    }

    Type process(LibClang clang, ParseOptions options, CXType type, Type resolvedType, Function<CXType, Type> nativeResolver);

    default TypeProcessor andThen(TypeProcessor resolver)
    {
        return (clang, options, type, resolvedType, nativeResolver) ->
            resolver.process(clang, options, type, this.process(clang, options, type, resolvedType, nativeResolver), nativeResolver);
    }
}
