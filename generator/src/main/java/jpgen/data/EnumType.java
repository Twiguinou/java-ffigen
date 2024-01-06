package jpgen.data;

import java.lang.foreign.MemoryLayout;
import java.util.Optional;

public record EnumType(String name, TypeManifold integerType, Constant[] constants) implements Declaration
{
    public record Constant(String name, long value)
    {
        @Override
        public String toString()
        {
            return STR."EnumConstant[\{this.name}->\{this.value}]";
        }
    }

    @Override
    public Optional<MemoryLayout> getLayout()
    {
        return this.integerType.getLayout();
    }

    @Override
    public String toString()
    {
//        if (this.constants.length == 0)
//        {
//            return STR."Enum[\{this.name}, type=\{this.integerType}]";
//        }

        StringBuilder builder = new StringBuilder();
        builder.append(this.constants[0]);
        for (int i = 1; i < this.constants.length; i++)
        {
            builder.append(STR.", \{this.constants[i]}");
        }

        return STR."Enum[\{this.name}, type=\{this.integerType}, constants={\{builder.toString()}}]";
    }
}
