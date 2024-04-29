package jpgen.data2;

public interface Type
{
    Type VOID = new Type() {};

    record Integral(String javaType) implements Type {}

    Integral BOOLEAN = new Integral("boolean");
    Integral BYTE = new Integral("byte");
    Integral CHARACTER = new Integral("char");
    Integral SHORT = new Integral("short");
    Integral INTEGER = new Integral("int");
    Integral LONG = new Integral("long");

    record FloatingPoint() implements Type {}

    FloatingPoint FLOAT = new FloatingPoint();
    FloatingPoint DOUBLE = new FloatingPoint();

    record Array(Type elementType, int size) implements Type {}

    record Pointer(Type referencedType) implements Type
    {
        @Override
        public String toString()
        {
            // Infinite recursion workaround
            return "Pointer";
        }
    }

    record Alias(Type underlyingType, String identifier) implements Type {}
}
