package fr.kenlek.jpgen.generator;

import module fr.kenlek.jpgen.clang;
import module java.base;

import fr.kenlek.jpgen.generator.data.Type;

public final class TypeCache implements AutoCloseable
{
    private final class TypeKey
    {
        private final CXType m_type;

        private TypeKey(CXType type)
        {
            this.m_type = type;
        }

        @Override
        public boolean equals(Object obj)
        {
            return obj instanceof TypeKey typeKey && TypeCache.this.m_clang.equalTypes(this.m_type, typeKey.m_type);
        }

        @Override
        public int hashCode()
        {
            return this.m_type.kind();
        }
    }

    private final LibClang m_clang;
    private final Map<TypeKey, Type> m_types = new HashMap<>();
    private final Arena m_arena = Arena.ofConfined();

    public TypeCache(LibClang clang)
    {
        this.m_clang = clang;
    }

    public Type getOrCompute(CXType type, Supplier<Type> factory)
    {
        Type computedType = this.m_types.get(new TypeKey(type));
        if (computedType == null)
        {
            computedType = factory.get();
            CXType persistentType = new CXType(this.m_arena);
            persistentType.copyFrom(type);
            this.m_types.put(new TypeKey(persistentType), computedType);
        }

        return computedType;
    }

    @Override
    public void close()
    {
        this.m_arena.close();
        this.m_types.clear();
    }
}
