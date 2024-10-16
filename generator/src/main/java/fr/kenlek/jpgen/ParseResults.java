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

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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

    public List<RecordType.Decl> gatherRecordDeclarations(Declaration.JavaPath path)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof RecordType.Decl record && !record.isIncomplete() && path.contains(record.path()))
                .map(type -> (RecordType.Decl) type)
                .toList();
    }

    public List<EnumType.Decl> gatherEnumDeclarations(Declaration.JavaPath path)
    {
        return this.typeTable.values().stream()
                .filter(type -> type instanceof EnumType.Decl enumDecl && path.contains(enumDecl.path()))
                .map(type -> (EnumType.Decl) type)
                .toList();
    }

    public List<HeaderDeclaration.Binding> gatherBindings(Declaration.JavaPath path)
    {
        return this.functions.stream()
                .filter(function -> function.descriptorType().isPresent())
                .filter(function -> function.linkage == Linkage.EXTERNAL &&
                                    !function.descriptorType().orElseThrow().variadic() && path.contains(function.path()))
                .map(HeaderDeclaration.Binding::new)
                .toList();
    }

    public List<CallbackDeclaration> makeCallbacks(Declaration.JavaPath path, String descriptorName, String stubName)
    {
        return this.typeTable.entrySet().stream()
                .filter(entry -> entry.getValue() instanceof Type.Alias alias && path.contains(alias.path()))
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

    public List<CallbackDeclaration> makeCallbacks(Declaration.JavaPath path)
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
