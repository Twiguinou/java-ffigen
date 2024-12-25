package fr.kenlek.jpgen.util;

import fr.kenlek.jpgen.ClangUtils;
import fr.kenlek.jpgen.LanguageUtils;
import fr.kenlek.jpgen.NameResolver;
import fr.kenlek.jpgen.ParseOptions;
import fr.kenlek.jpgen.PreTypeResolver;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.FunctionType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXTypeKind.*;

public class CallbackResolver implements PreTypeResolver
{
    private final JavaPath m_path;
    public final List<CallbackDeclaration> callbacks = new ArrayList<>();
    public final String descriptorName, stubName;

    public CallbackResolver(JavaPath path, String descriptorName, String stubName)
    {
        LanguageUtils.requireJavaIdentifier(descriptorName);
        LanguageUtils.requireJavaIdentifier(stubName);

        this.m_path = path;
        this.descriptorName = descriptorName;
        this.stubName = stubName;
    }

    public CallbackResolver(JavaPath path)
    {
        this(path, CallbackDeclaration.DEFAULT_DESCRIPTOR_NAME, CallbackDeclaration.DEFAULT_STUB_NAME);
    }

    private void resolveCallback(CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve)
    {
        if (clangType.kind() != CXType_Typedef) return;

        try (Arena arena = Arena.ofConfined())
        {
            CXType canonicalType = clang_getCanonicalType(arena, clangType);
            if (canonicalType.kind() != CXType_Pointer) return;

            CXType pointeeType = clang_getPointeeType(arena, canonicalType);
            int kind = pointeeType.kind();
            if (kind != CXType_FunctionProto && kind != CXType_FunctionNoProto) return;

            if (nativeResolve.apply(pointeeType) instanceof FunctionType functionType)
            {
                CXCursor declarationCursor = clang_getTypeDeclaration(arena, clangType);
                JavaPath path = options.pathProvider().getPath(declarationCursor)
                        .child(ClangUtils.retrieveString(clang_getTypeSpelling(arena, clangType)).orElseThrow());
                if (!this.m_path.contains(path)) return;

                NameResolver nameResolver = options.nameResolvers().get();

                String[] parametersNames = new String[functionType.parametersTypes().size()];
                clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, pIndex) ->
                {
                    if (clang_getCursorKind(cursor) == CXCursor_ParmDecl)
                    {
                        int index = pIndex.getAtIndex(ValueLayout.JAVA_INT, 0);
                        String protoName = ClangUtils.getCursorSpelling(arena, cursor).orElse("$arg%d".concat(Integer.toString(index + 1)));
                        parametersNames[index] = nameResolver.resolve(protoName);
                        pIndex.set(ValueLayout.JAVA_INT, 0, index + 1);
                    }

                    return CXChildVisit_Continue;
                }).makeHandle(arena), arena.allocateFrom(ValueLayout.JAVA_INT, 0));

                this.callbacks.add(new CallbackDeclaration(path, functionType, List.of(parametersNames), this.descriptorName, this.stubName));
            }
            else
            {
                throw new IllegalStateException("Expected function type.");
            }
        }
    }

    @Override
    public Optional<Type> resolveType(CXType clangType, ParseOptions options, Function<CXType, Type> nativeResolve)
    {
        this.resolveCallback(clangType, options, nativeResolve);
        return Optional.empty();
    }
}
