package fr.kenlek.jpgen.generator.util;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.NameResolver;
import fr.kenlek.jpgen.generator.ParseOptions;
import fr.kenlek.jpgen.generator.PreTypeResolver;
import fr.kenlek.jpgen.generator.data.CallbackDeclaration;
import fr.kenlek.jpgen.generator.data.FunctionType;
import fr.kenlek.jpgen.generator.data.JavaPath;
import fr.kenlek.jpgen.generator.data.Type;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static fr.kenlek.jpgen.clang.CXChildVisitResult.CXChildVisit_Continue;
import static fr.kenlek.jpgen.clang.CXCursorKind.CXCursor_ParmDecl;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;

public class CallbackResolver implements PreTypeResolver
{
    private final JavaPath m_path;
    public final List<CallbackDeclaration> callbacks = new ArrayList<>();

    public CallbackResolver(JavaPath path)
    {
        this.m_path = path;
    }

    private void resolveCallback(LibClang libClang, CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve)
    {
        if (clangType.kind() != CXType_Typedef)
        {
            return;
        }

        try (Arena arena = Arena.ofConfined())
        {
            CXType canonicalType = libClang.getCanonicalType(arena, clangType);
            if (canonicalType.kind() != CXType_Pointer)
            {
                return;
            }

            CXType pointeeType = libClang.getPointeeType(arena, canonicalType);
            int kind = pointeeType.kind();
            if (kind != CXType_FunctionProto && kind != CXType_FunctionNoProto)
            {
                return;
            }

            if (nativeResolve.apply(pointeeType) instanceof FunctionType functionType)
            {
                CXCursor declarationCursor = libClang.getTypeDeclaration(arena, clangType);
                JavaPath path = options.pathProvider().getPath(libClang, declarationCursor)
                    .child(libClang.retrieveString(libClang.getTypeSpelling(arena, clangType)).orElseThrow());
                if (!this.m_path.contains(path))
                {
                    return;
                }

                NameResolver nameResolver = options.nameResolvers().get();

                String[] parametersNames = new String[functionType.parameterTypes().size()];
                libClang.visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, pIndex) ->
                {
                    if (libClang.getCursorKind(cursor) == CXCursor_ParmDecl)
                    {
                        int index = pIndex.getAtIndex(ValueLayout.JAVA_INT, 0);
                        String protoName = libClang.getCursorSpelling(cursor).orElse("$arg" + (index + 1));
                        parametersNames[index] = nameResolver.resolve(protoName);
                        pIndex.set(ValueLayout.JAVA_INT, 0, index + 1);
                    }

                    return CXChildVisit_Continue;
                }).makeHandle(arena), arena.allocateFrom(ValueLayout.JAVA_INT, 0));

                this.callbacks.add(new CallbackDeclaration(path, functionType, List.of(parametersNames)));
            }
            else
            {
                throw new IllegalStateException("Expected function type.");
            }
        }
    }

    @Override
    public Optional<Type> resolveType(LibClang libClang, CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve)
    {
        this.resolveCallback(libClang, clangType, options, nativeResolve);
        return Optional.empty();
    }
}
