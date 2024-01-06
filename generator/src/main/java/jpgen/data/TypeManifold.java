package jpgen.data;

import jpgen.TypeKey;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

public interface TypeManifold
{
    Optional<MemoryLayout> getLayout();

    record Primitive(String name, @Nullable ValueLayout layout, @Nullable Class<? extends ValueLayout> layoutInterface, @Nullable String layoutFieldName) implements TypeManifold
    {
        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return Optional.ofNullable(this.layout);
        }
    }

    Primitive BOOLEAN = new Primitive("boolean", ValueLayout.JAVA_BOOLEAN, ValueLayout.OfBoolean.class, "JAVA_BOOLEAN");
    Primitive CHARACTER = new Primitive("char", ValueLayout.JAVA_BYTE, ValueLayout.OfByte.class, "JAVA_BYTE");
    Primitive CHARACTER_16 = new Primitive("char", ValueLayout.JAVA_CHAR, ValueLayout.OfChar.class, "JAVA_CHAR");
    Primitive SHORT = new Primitive("short", ValueLayout.JAVA_SHORT, ValueLayout.OfShort.class, "JAVA_SHORT");
    Primitive INTEGER = new Primitive("int", ValueLayout.JAVA_INT, ValueLayout.OfInt.class, "JAVA_INT");
    Primitive LONG = new Primitive("long", ValueLayout.JAVA_LONG, ValueLayout.OfLong.class, "JAVA_LONG");
    Primitive FLOAT = new Primitive("float", ValueLayout.JAVA_FLOAT, ValueLayout.OfFloat.class, "JAVA_FLOAT");
    Primitive DOUBLE = new Primitive("double", ValueLayout.JAVA_DOUBLE, ValueLayout.OfDouble.class, "JAVA_DOUBLE");
    Primitive VOID = new Primitive("void", null, null, null);

    record Pointer(TypeManifold pointee) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return "Pointer";
        }

        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return Optional.of(ValueLayout.ADDRESS);
        }
    }

    record Prototype(TypeKey identifier) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return STR."Proto[\{this.identifier}]";
        }

        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return Optional.empty();
        }
    }

    record Array(long length, TypeManifold elementType) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return STR."Array[length=\{this.length}]";
        }

        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return this.elementType.getLayout().map(memoryLayout -> this.length > 0 ? MemoryLayout.sequenceLayout(this.length, memoryLayout) : MemoryLayout.sequenceLayout(memoryLayout));
        }
    }

    record Typedef(String alias, TypeManifold underlying) implements TypeManifold
    {
        @Override
        public String toString()
        {
            return STR."Typedef[\{this.alias} -> \{this.underlying}]";
        }

        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return this.underlying.getLayout();
        }
    }
}
