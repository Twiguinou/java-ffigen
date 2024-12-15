package fr.kenlek.jpgen.util;

import fr.kenlek.jpgen.ClangUtils;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.PreTypeResolver;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.lang.foreign.Arena;
import java.util.Optional;
import java.util.function.Function;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;

public record AliasReplacer(JavaPath path, Type substitute) implements PreTypeResolver
{
    @Override
    public Optional<Type> resolveType(CXType clangType, ParseOptions.Hints hints, Function<CXType, Type> nativeResolve)
    {
        if (clangType.kind() == CXType_Typedef)
        {
            try (Arena arena = Arena.ofConfined())
            {
                JavaPath aliasPath = hints.pathProvider().getPath(clang_getTypeDeclaration(arena, clangType))
                        .child(ClangUtils.retrieveString(clang_getTypeSpelling(arena, clangType)).orElseThrow());
                if (this.path().equals(aliasPath))
                {
                    return Optional.of(this.substitute());
                }
            }
        }

        return Optional.empty();
    }
}