package jpgen;

import jpgen.data.EnumDeclaration;

public class JavaSourceGenerator
{
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void appendWithIndent(StringBuilder builder, int indentCount, String string)
    {
        for (int i = 0; i < indentCount; i++)
        {
            builder.append('\t');
        }
        builder.append(string);
    }

    public static String makeEnum(EnumDeclaration declaration, String javaPackage)
    {
        StringBuilder source = new StringBuilder();

        // class header
        source.append(STR."package \{javaPackage};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{declaration.name()}\{LINE_SEPARATOR}");
        source.append(STR."{private \{declaration.name()}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // variables
        final String typeSpelling = declaration.constantType().spelling();
        for (EnumDeclaration.Constant constant : declaration.constants())
        {
            final String fmtValue = declaration.constantType().format(constant.value());
            appendWithIndent(source, 1, STR."public static final \{typeSpelling} \{constant.name()} = \{fmtValue};\{LINE_SEPARATOR}");
        }
        source.append(STR."}\{LINE_SEPARATOR}");

        return source.toString();
    }
}
