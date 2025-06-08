package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.clang.LibClang;
import fr.kenlek.jpgen.generator.data.Declaration;
import fr.kenlek.jpgen.generator.data.FunctionDeclaration;
import fr.kenlek.jpgen.generator.data.FunctionType;
import fr.kenlek.jpgen.generator.data.HeaderDeclaration;
import fr.kenlek.jpgen.generator.data.JavaPath;
import fr.kenlek.jpgen.generator.data.Linkage;
import fr.kenlek.jpgen.generator.data.Type;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

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
            return obj instanceof TypeKey typeKey && ParseResults.this.m_libClang.equalTypes(this.internal, typeKey.internal);
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

    private final LibClang m_libClang;
    private final Arena m_allocations = Arena.ofShared();
    final MemorySegment translationUnit;
    final Map<TypeKey, Type> typeTable = new HashMap<>();
    public final List<FunctionDeclaration> functions = new ArrayList<>();
    public final List<HeaderDeclaration.Constant> constants = new ArrayList<>();

    public ParseResults(LibClang libClang, MemorySegment translationUnit)
    {
        this.m_libClang = libClang;
        this.translationUnit = translationUnit;
    }

    public Collection<Type> types()
    {
        return this.typeTable.values();
    }

    public List<? extends Declaration.Writable> gatherWritableDeclarations(JavaPath path)
    {
        return this.types()
            .stream()
            .filter(type -> type instanceof Declaration.Writable declaration && declaration.writable() && path.contains(declaration.path()))
            .map(type -> (Declaration.Writable) type)
            .toList();
    }

    public List<HeaderDeclaration.Binding> gatherBindings(JavaPath path, Function<String, String> nameProcessor)
    {
        return this.functions.stream()
            .filter(function -> function.linkage == Linkage.EXTERNAL && path.contains(function.path()))
            .map(function -> new HeaderDeclaration.Binding(nameProcessor.apply(function.path().tail()), function.descriptorType, function.parameters.stream()
                .map(FunctionType.Parameter::name)
                .toList()))
            .toList();
    }

    public List<HeaderDeclaration.Binding> gatherBindings(JavaPath path)
    {
        return this.gatherBindings(path, Function.identity());
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
        this.m_libClang.disposeTranslationUnit(this.translationUnit);
    }
}
