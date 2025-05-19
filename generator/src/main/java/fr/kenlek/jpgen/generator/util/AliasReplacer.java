package fr.kenlek.jpgen.generator.util;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.ParseOptions;
import fr.kenlek.jpgen.generator.PreTypeResolver;
import fr.kenlek.jpgen.generator.data.Type;
import fr.kenlek.jpgen.generator.data.JavaPath;

import java.lang.foreign.Arena;
import java.util.Optional;
import java.util.function.Function;

import static fr.kenlek.jpgen.clang.CXTypeKind.CXType_Typedef;

public record AliasReplacer(JavaPath path, Type substitute) implements PreTypeResolver
{
    @Override
    public Optional<Type> resolveType(LibClang libClang, CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve)
    {
        if (clangType.kind() == CXType_Typedef)
        {
            try (Arena arena = Arena.ofConfined())
            {
                JavaPath aliasPath = options.pathProvider()
                    .getPath(libClang, libClang.getTypeDeclaration(arena, clangType))
                    .child(libClang.retrieveString(libClang.getTypeSpelling(arena, clangType)).orElseThrow());
                if (this.path().equals(aliasPath))
                {
                    return Optional.of(this.substitute());
                }
            }
        }

        return Optional.empty();
    }
}
