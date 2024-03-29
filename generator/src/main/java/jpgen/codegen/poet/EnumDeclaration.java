package jpgen.codegen.poet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

public final class EnumDeclaration extends TypeDeclaration
{
    private EnumDeclaration(Declaration.Visibility visibility, Declaration.Scope scope, Declaration.Mutability mutability, ClassLocation location, Iterable<Declaration> declarations)
    {
        super(visibility, scope, mutability, location, declarations);
    }

    @Override
    public void print(OutputContext context) throws IOException
    {
        List<EnumField> values = StreamSupport.stream(this.declarations.spliterator(), false)
                .filter(declaration -> declaration instanceof EnumField)
                .map(declaration -> (EnumField)declaration)
                .toList();

        List<Declaration> nonValues = StreamSupport.stream(this.declarations.spliterator(), false)
                .filter(declaration -> !(declaration instanceof EnumField))
                .toList();

        context.append("enum ").breakLine(this.name());
        context.breakLine('{');
        context.pushControlFlow();

        Iterator<EnumField> valueIterator = values.iterator();
        if (valueIterator.hasNext())
        {
            while (true)
            {
                EnumField field = valueIterator.next();
                field.print(context);

                if (valueIterator.hasNext())
                {
                    context.breakLine(',');
                }
                else
                {
                    context.breakLine(';');
                    break;
                }
            }
        }
        else
        {
            context.breakLine(';');
        }

        for (Declaration declaration : nonValues)
        {
            context.breakLine();

            if (declaration.visibility() != Declaration.Visibility.PACKAGE)
            {
                context.append(declaration.visibility().keyword()).append(' ');
            }

            declaration.print(context);
            context.breakLine();
        }

        context.popControlFlow();
        context.breakLine('}');
    }

    public static final class Builder extends TypeDeclaration.Builder
    {
        public Builder(Visibility visibility, ClassLocation location)
        {
            super(visibility, Scope.STATIC, Mutability.FINAL, location);
        }

        @Override
        protected boolean isValidDeclaration(Declaration declaration)
        {
            return true;
        }

        @Override
        public TypeDeclaration build()
        {
            return new EnumDeclaration(this.visibility, this.scope, this.mutability, this.location, this.declarations());
        }
    }
}
