package jpgen.data2;

import java.lang.foreign.MemoryLayout;
import java.util.Optional;

public interface Type
{
    Optional<? extends MemoryLayout> computeLayout();

    Type VOID = new Type()
    {
        @Override
        public Optional<MemoryLayout> computeLayout()
        {
            return Optional.empty();
        }
    };

    record Array(Type elementType, long length) implements Type
    {
        @Override
        public Optional<? extends MemoryLayout> computeLayout()
        {
            return Optional.of(MemoryLayout.sequenceLayout(this.length, this.elementType.computeLayout().orElseThrow()));
        }
    }

    record Alias(Type underlyingType, String identifier) implements Type
    {
        @Override
        public Optional<? extends MemoryLayout> computeLayout()
        {
            return this.underlyingType.computeLayout().map(layout -> layout.withName(this.identifier));
        }

        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.identifier, this.underlyingType);
        }
    }
}
