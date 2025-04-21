package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.Index_h;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.HeaderDeclaration;
import fr.kenlek.jpgen.generator.data.Linkage;
import fr.kenlek.jpgen.generator.data.Type;
import fr.kenlek.jpgen.generator.data.path.JavaPath;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import static fr.kenlek.jpgen.clang.ClangUtils.getBoolean;

public class ParseResults implements AutoCloseable
{
    final class TypeKey
    {
        final CXType internal;

        private TypeKey(CXType type)
        {
            this.internal = type;
        }

        @Override
        public boolean equals(Object obj)
        {
            return obj instanceof TypeKey typeKey &&
                   getBoolean(ParseResults.this.m_indexH.clang_equalTypes(this.internal, typeKey.internal));
        }

        @Override
        public int hashCode()
        {
            return Arrays.hashCode(new long[] {
                this.internal.data(0).address(),
                this.internal.data(1).address()
            });
        }
    }

    private final Index_h m_indexH;
    private final Arena m_allocations = Arena.ofShared();
    final MemorySegment translationUnit;
    final Map<TypeKey, Type> typeTable = new HashMap<>();
    public final List<FunctionDeclaration> functions = new ArrayList<>();
    public final List<HeaderDeclaration.Constant> constants = new ArrayList<>();

    public ParseResults(Index_h indexH, MemorySegment translationUnit)
    {
        this.m_indexH = indexH;
        this.translationUnit = translationUnit;
    }

    public Collection<Type> types()
    {
        return this.typeTable.values();
    }

    public Optional<Type> findType(Predicate<Type> predicate)
    {
        return this.types().stream().filter(predicate).findAny();
    }

    public Optional<Type> findTypeDeclaration(Predicate<Declaration> predicate)
    {
        return this.findType(type -> type instanceof Declaration declaration && predicate.test(declaration));
    }

    public List<? extends Declaration.CodeGenerator> gatherGeneratorDeclarations(JavaPath path)
    {
        return this.types()
            .stream()
            .filter(type -> type instanceof Declaration.CodeGenerator declaration && declaration.printable() && path.contains(declaration.path()))
            .map(type -> (Declaration.CodeGenerator) type)
            .toList();
    }

    public List<HeaderDeclaration.Binding> gatherBindings(JavaPath path)
    {
        return this.functions.stream()
            .filter(function -> function.linkage == Linkage.EXTERNAL && path.contains(function.path()))
            .map(HeaderDeclaration.Binding::new)
            .toList();
    }

    TypeKey createTypeKey(CXType internal)
    {
        return new TypeKey(internal);
    }

    TypeKey createPersistentTypeKey(CXType internal)
    {
        TypeKey typeKey = new TypeKey(new CXType(this.m_allocations));
        typeKey.internal.copyFrom(internal);
        return typeKey;
    }

    @Override
    public void close()
    {
        this.m_allocations.close();
        this.m_indexH.clang_disposeTranslationUnit(this.translationUnit);
    }
}
