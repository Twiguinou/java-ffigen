package jpgen.data;

public record CallbackDeclaration(boolean variadic, TypeDeclaration returnType, TypeDeclaration[] arguments)
{
}
