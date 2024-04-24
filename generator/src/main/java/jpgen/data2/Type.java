package jpgen.data2;

public interface Type
{
    Type VOID = new Type() {};

    record Integral() implements Type {}

    Integral BOOLEAN = new Integral();
    Integral BYTE = new Integral();
    Integral CHARACTER = new Integral();
    Integral SHORT = new Integral();
    Integral INTEGER = new Integral();
    Integral LONG = new Integral();

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
