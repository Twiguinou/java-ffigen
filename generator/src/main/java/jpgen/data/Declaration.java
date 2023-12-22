package jpgen.data;

public interface Declaration
{
    record Variable(String name, TypeManifold type) implements Declaration
    {
        @Override
        public String toString()
        {
            return STR."Variable[\{this.name}, type=\{this.type}]";
        }
    }
}
