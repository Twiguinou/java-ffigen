package jpgen.data;

import jpgen.TypeKey;

public interface TypeManifold
{
    TypeManifold VOID = new TypeManifold() {};
    TypeManifold BOOLEAN = new TypeManifold() {};
    TypeManifold CHARACTER = new TypeManifold() {};
    TypeManifold SHORT = new TypeManifold() {};
    TypeManifold INTEGER = new TypeManifold() {};
    TypeManifold FLOAT = new TypeManifold() {};
    TypeManifold LONG = new TypeManifold() {};
    TypeManifold DOUBLE = new TypeManifold() {};

    record Pointer(TypeManifold pointee) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return "Pointer";
        }
    }

    record Prototype(TypeKey identifier) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return STR."Proto[\{this.identifier}]";
        }
    }

    record Array(long length, TypeManifold elementType) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return STR."Array[length=\{this.length}]";
        }
    }
}
