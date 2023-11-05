package jpgen.data;

import java.util.Map;

public interface TypeReference
{
    TypeDeclaration get();

    static TypeReference fromPrimitive(TypeDeclaration.Primitive<?> type)
    {
        return new TypeReference()
        {
            @Override public TypeDeclaration get()
            {
                return type;
            }

            @Override public String toString()
            {
                return type.spelling();
            }
        };
    }

    static TypeReference withLookup(String identifier, Map<String, TypeDeclaration> lookup)
    {
        return new TypeReference()
        {
            @Override public TypeDeclaration get()
            {
                return lookup.getOrDefault(identifier, TypeDeclaration.UNKNOWN);
            }

            @Override
            public String toString()
            {
                final TypeDeclaration resolved = get();
                return resolved == TypeDeclaration.UNKNOWN ? identifier : resolved.spelling();
            }
        };
    }
}
