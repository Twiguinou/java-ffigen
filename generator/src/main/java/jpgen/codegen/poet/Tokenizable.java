package jpgen.codegen.poet;

public interface Tokenizable
{
    String name();

    default String keyword()
    {
        return this.name().toLowerCase();
    }
}
