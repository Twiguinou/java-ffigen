package jpgen.codegen.poet;

import java.io.IOException;

public sealed interface Declaration permits FieldDeclaration, TypeDeclaration, MethodDeclaration
{
    enum Visibility implements Tokenizable
    {
        PRIVATE,
        PUBLIC,
        PROTECTED,
        PACKAGE
        {
            @Override
            public String keyword()
            {
                throw new UnsupportedOperationException();
            }
        }
    }

    enum Scope implements Tokenizable
    {
        STATIC,
        TRANSIENT,
        INSTANCE
        {
            @Override
            public String keyword()
            {
                throw new UnsupportedOperationException();
            }
        }
    }

    enum Mutability implements Tokenizable
    {
        FINAL,
        VOLATILE,
        MUTABLE
        {
            @Override
            public String keyword()
            {
                throw new UnsupportedOperationException();
            }
        }
    }

    static void printSourceFile(TypeDeclaration declaration, OutputContext context) throws IOException
    {
        boolean declarePublic = switch (declaration.visibility())
        {
            case PACKAGE -> false;
            case PUBLIC -> true;
            default -> throw new IllegalArgumentException("A source scope declaration may only be public or package private.");
        };

        context.append("package ").append(declaration.location.canonicalPackage()).breakLine(';');
        context.breakLine();

        if (declarePublic) context.append("public ");
        declaration.print(context);
    }

    String name();

    Visibility visibility();

    Scope scope();

    Mutability mutability();

    void print(OutputContext context) throws IOException;
}
