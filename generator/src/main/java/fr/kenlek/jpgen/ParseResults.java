package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.EnumType;
import fr.kenlek.jpgen.data.FunctionDeclaration;
import fr.kenlek.jpgen.data.HeaderDeclaration;
import fr.kenlek.jpgen.data.Linkage;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.ClangUtils.*;

public class ParseResults implements AutoCloseable
{
    public class TypeKey implements Type.Delegated
    {
        public final CXType internal;

        private TypeKey(CXType internal)
        {
            this.internal = internal;
        }

        @Override
        public Type underlying()
        {
            return ParseResults.this.typeTable.get(this);
        }

        public Type discover()
        {
            Type underlying = this.underlying();
            return underlying instanceof TypeKey typeKey ? typeKey.discover() : underlying;
        }

        @Override
        public boolean equals(Object obj)
        {
            return obj instanceof TypeKey key && getBoolean(clang_equalTypes(key.internal, this.internal));
        }

        @Override
        public int hashCode()
        {
            return Arrays.hashCode(new long[] {
                    this.internal.data(0).address(),
                    this.internal.data(1).address()
            });
        }

        @Override
        public String toString()
        {
            return Objects.toString(this.underlying());
        }
    }

    final MemorySegment translationUnit;
    final Arena allocations = Arena.ofShared();
    public final List<FunctionDeclaration> functions = new ArrayList<>();
    public final Map<TypeKey, Type> typeTable = new HashMap<>();
    public final List<HeaderDeclaration.Constant> constants = new ArrayList<>();
    final Map<TypeKey, TypeKey> globalKeys = new HashMap<>();

    public ParseResults(MemorySegment translationUnit)
    {
        this.translationUnit = translationUnit;
    }

    public List<TypeKey> gatherDeclarations(Predicate<Declaration<?>> predicate)
    {
        return this.typeTable.entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Declaration<?> declaration && predicate.test(declaration))
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<RecordType.Decl> gatherRecordDeclarations(JavaPath path)
    {
        return this.gatherDeclarations(declaration ->
                        declaration instanceof RecordType.Decl record && path.contains(record.path())).stream()
                .map(typeKey -> (RecordType.Decl) typeKey.discover())
                .toList();
    }

    public List<EnumType.Decl> gatherEnumDeclarations(JavaPath path)
    {
        return this.gatherDeclarations(declaration ->
                        declaration instanceof EnumType.Decl enumDecl && path.contains(enumDecl.path())).stream()
                .map(typeKey -> (EnumType.Decl) typeKey.discover())
                .toList();
    }

    public List<? extends Declaration.CodeGenerator<?>> gatherGeneratorDeclarations(JavaPath path)
    {
        return this.gatherDeclarations(declaration ->
                        declaration instanceof Declaration.CodeGenerator<?> generator && generator.printable() && path.contains(declaration.path())).stream()
                .map(typeKey -> (Declaration.CodeGenerator<?>) typeKey.discover())
                .toList();
    }

    public List<HeaderDeclaration.Binding> gatherBindings(JavaPath path)
    {
        return this.functions.stream()
                .filter(function -> function.linkage == Linkage.EXTERNAL && !function.descriptorType().variadic() && path.contains(function.path()))
                .map(HeaderDeclaration.Binding::new)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(JavaPath path, String descriptorName, String stubName)
    {
        return this.gatherDeclarations(declaration ->
                        declaration instanceof Type.Alias alias && path.contains(alias.path())).stream()
                .map(typeKey ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, typeKey.internal);
                        return ((Type.Alias)typeKey.discover()).toCallback(declarationCursor, descriptorName, stubName);
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(JavaPath path)
    {
        return this.makeCallbacks(path, CallbackDeclaration.DEFAULT_DESCRIPTOR_NAME, CallbackDeclaration.DEFAULT_STUB_NAME);
    }

    TypeKey createTypeKey(CXType internal)
    {
        return new TypeKey(internal);
    }

    TypeKey createPersistentTypeKey(CXType internal)
    {
        TypeKey typeKey = new TypeKey(new CXType(this.allocations));
        typeKey.internal.copyFrom(internal);
        return typeKey;
    }

    @Override
    public void close()
    {
        this.allocations.close();
        clang_disposeTranslationUnit(this.translationUnit);
    }
}
