package jpgen.data2;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

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

        private ValueType(ValueLayout valueLayout, boolean isIntegral)
        {
            this.m_valueLayout = valueLayout;
            this.isIntegral = isIntegral;
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

    ValueType BOOLEAN = new ValueType(ValueLayout.JAVA_BOOLEAN, true);
    ValueType BYTE = new ValueType(ValueLayout.JAVA_BYTE, true);
    ValueType CHARACTER = new ValueType(ValueLayout.JAVA_CHAR, true);
    ValueType SHORT = new ValueType(ValueLayout.JAVA_SHORT, true);
    ValueType INTEGER = new ValueType(ValueLayout.JAVA_INT, true);
    ValueType LONG = new ValueType(ValueLayout.JAVA_LONG, true);
    ValueType FLOAT = new ValueType(ValueLayout.JAVA_FLOAT, false);
    ValueType DOUBLE = new ValueType(ValueLayout.JAVA_DOUBLE, false);

    record Array(Type elementType, long length) implements Type
    {
        @Override
        public Optional<SequenceLayout> layout()
        {
            return Optional.of(MemoryLayout.sequenceLayout(length, this.elementType.layout().orElseThrow()));
        }
    }

    record Pointer(Type referencedType) implements Type
    {
        @Override
        public Optional<AddressLayout> layout()
        {
            return Optional.of(ValueLayout.ADDRESS);
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
