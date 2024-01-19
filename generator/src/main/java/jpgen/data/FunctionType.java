package jpgen.data;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

public record FunctionType(boolean variadic, TypeManifold resultType, TypeManifold[] argTypes) implements TypeManifold
{
    @Override
    public Optional<MemoryLayout> getLayout()
    {
        return Optional.empty();
    }

    public record Declaration(String fname, String commentBlock, FunctionType innerType, String[] argNames) implements jpgen.data.Declaration<Declaration>
    {
        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return this.innerType.getLayout();
        }

        @Override
        public Optional<String> name()
        {
            return Optional.of(this.fname);
        }

        @Override
        public Declaration withName(String name)
        {
            return new Declaration(name, this.commentBlock, this.innerType, this.argNames);
        }

        @Override
        public String toString()
        {
            if (this.argNames.length == 0)
            {
                return STR."Function[\{this.fname}, return=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}]";
            }

            StringBuilder builder = new StringBuilder();
            builder.append(STR."\{this.argNames[0]}:\{this.innerType.argTypes()[0]}");
            for (int i = 1; i < this.argNames.length; i++)
            {
                builder.append(STR.",\{this.argNames[i]}:\{this.innerType.argTypes()[i]}");
            }

            return STR."Function[\{this.fname}, returnType=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}, args={\{builder.toString()}}]";
        }
    }

    public record Callback(Optional<String> name, FunctionType innerType, String[] argNames) implements jpgen.data.Declaration<Callback>
    {
        @Override
        public Optional<MemoryLayout> getLayout()
        {
            return Optional.of(ValueLayout.ADDRESS);
        }

        @Override
        public Callback withName(String name)
        {
            return new Callback(Optional.of(name), this.innerType, this.argNames);
        }

        @Override
        public String toString()
        {
            String prefix = this.name.map(name -> STR."\{name}, ").orElse("");
            if (this.innerType.argTypes.length == 0)
            {
                return STR."Callback[\{prefix}return=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}]";
            }

            StringBuilder builder = new StringBuilder();
            builder.append(STR."\{this.argNames[0]}:\{this.innerType.argTypes()[0]}");
            for (int i = 1; i < this.innerType.argTypes.length; i++)
            {
                builder.append(STR.",\{this.argNames[i]}:\{this.innerType.argTypes()[i]}");
            }

            return STR."Callback[\{prefix}returnType=\{this.innerType.resultType()}, variadic=\{this.innerType.variadic()}, args={\{builder.toString()}}]";
        }
    }
}
