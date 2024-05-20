package jpgen.data;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

import static java.lang.foreign.ValueLayout.*;

public sealed interface Type permits Type.Void, Type.ValueType, Type.Array, Type.Pointer, Type.Alias, EnumType, FunctionType, RecordType, TypeKey
{
    Optional<? extends MemoryLayout> layout();

    Type VOID = new Void();
    final class Void implements Type
    {
        private Void() {}

        @Override
        public Optional<MemoryLayout> layout()
        {
            return Optional.empty();
        }

        @Override
        public String toString()
        {
            return "Void";
        }
    }

    final class ValueType implements Type
    {
        private final ValueLayout m_valueLayout;
        public final boolean isIntegral;
        public final String javaType;
        public final Class<? extends ValueLayout> layoutClass;

        private ValueType(ValueLayout valueLayout, boolean isIntegral, String javaType, Class<? extends ValueLayout> layoutClass)
        {
            this.m_valueLayout = valueLayout;
            this.isIntegral = isIntegral;
            this.javaType = javaType;
            this.layoutClass = layoutClass;
        }

        @Override
        public Optional<ValueLayout> layout()
        {
            return Optional.of(this.m_valueLayout);
        }

        @Override
        public String toString()
        {
            return String.format("ValueType[layout=%s, integral=%b]", this.m_valueLayout, this.isIntegral);
        }
    }

    ValueType BOOLEAN = new ValueType(JAVA_BOOLEAN, true, "boolean", OfBoolean.class);
    ValueType BYTE = new ValueType(JAVA_BYTE, true, "byte", OfByte.class);
    ValueType CHARACTER = new ValueType(JAVA_CHAR, true, "char", OfChar.class);
    ValueType SHORT = new ValueType(JAVA_SHORT, true, "short", OfShort.class);
    ValueType INTEGER = new ValueType(JAVA_INT, true, "int", OfInt.class);
    ValueType LONG = new ValueType(JAVA_LONG, true, "long", OfLong.class);
    ValueType FLOAT = new ValueType(JAVA_FLOAT, false, "float", OfFloat.class);
    ValueType DOUBLE = new ValueType(JAVA_DOUBLE, false, "double", OfDouble.class);

    record Array(Type elementType, long length) implements Type
    {
        @Override
        public Optional<SequenceLayout> layout()
        {
            return Optional.of(MemoryLayout.sequenceLayout(this.length, this.elementType.layout().orElseThrow()));
        }
    }

    record Pointer(Type referencedType) implements Type
    {
        @Override
        public Optional<AddressLayout> layout()
        {
            return Optional.of(ADDRESS);
        }

        @Override
        public String toString()
        {
            // Infinite recursion workaround
            return "Pointer";
        }
    }

    record Alias(Type underlyingType, String identifier) implements Type
    {
        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return this.underlyingType.layout().map(layout -> layout.withName(this.identifier));
        }

        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.identifier, this.underlyingType);
        }
    }
}
