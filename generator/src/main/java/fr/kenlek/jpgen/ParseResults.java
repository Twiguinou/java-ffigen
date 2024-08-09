package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXType;
import fr.kenlek.jpgen.data.Binding;
import fr.kenlek.jpgen.data.CallbackDeclaration;
import fr.kenlek.jpgen.data.CanonicalPackage;
import fr.kenlek.jpgen.data.Constant;
import fr.kenlek.jpgen.data.EnumType;
import fr.kenlek.jpgen.data.FunctionDeclaration;
import fr.kenlek.jpgen.data.Linkage;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
        public Type underlyingType()
        {
            return ParseResults.this.typeTable.get(this);
        }

        @Override
        public Type discover()
        {
            return this.underlyingType().discover();
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
            return this.discover().toString();
        }
    }

    final MemorySegment translationUnit;
    final Arena allocations = Arena.ofShared();
    public final List<FunctionDeclaration> functions = new ArrayList<>();
    public final Map<TypeKey, Type> typeTable = new HashMap<>();
    public final List<Constant> constants = new ArrayList<>();
    final Map<TypeKey, TypeKey> globalKeys = new HashMap<>();

    public ParseResults(MemorySegment translationUnit)
    {
        this.translationUnit = translationUnit;
    }

    public List<RecordType.Decl> gatherRecordDeclarations(CanonicalPackage location)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof RecordType.Decl record && !record.isIncomplete() && location.isPrefix(record.location()))
                .map(type -> (RecordType.Decl) type)
                .toList();
    }

    public List<EnumType.Decl> gatherEnumDeclarations(CanonicalPackage location)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof EnumType.Decl enumDecl && location.isPrefix(enumDecl.location()))
                .map(type -> (EnumType.Decl) type)
                .toList();
    }

    public List<Binding> gatherBindings(CanonicalPackage location)
    {
        return this.functions.stream()
                .filter(function -> function.linkage == Linkage.EXTERNAL && !function.descriptorType.variadic() && location.isPrefix(function.location()))
                .map(Binding::new)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(CanonicalPackage location, String descriptorName, String stubName)
    {
        return this.typeTable.entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Type.Alias(_, CanonicalPackage aliasLocation, _) && location.isPrefix(aliasLocation))
                .map(entry ->
                {
                    try (Arena arena = Arena.ofConfined())
                    {
                        CXCursor declarationCursor = clang_getTypeDeclaration(arena, entry.getKey().internal);
                        return ((Type.Alias)entry.getValue()).toCallback(declarationCursor, descriptorName, stubName);
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(CanonicalPackage location)
    {
        return this.makeCallbacks(location, CallbackDeclaration.DEFAULT_DESCRIPTOR_NAME, CallbackDeclaration.DEFAULT_STUB_NAME);
    }

    TypeKey createTypeKey(CXType internal)
    {
        return new TypeKey(internal);
    }

    TypeKey createPersistentTypeKey(CXType internal)
    {
        return new TypeKey(new CXType(this.allocations.allocate(CXType.gRecordLayout).copyFrom(internal.ptr())));
    }

    @Override
    public void close()
    {
        this.allocations.close();
        clang_disposeTranslationUnit(this.translationUnit);
    }
}
