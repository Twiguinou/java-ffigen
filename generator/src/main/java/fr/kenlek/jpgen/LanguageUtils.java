package fr.kenlek.jpgen;

import javax.lang.model.SourceVersion;
import java.util.function.Function;

public final class LanguageUtils
{private LanguageUtils() {}

    public static String requireJavaIdentifier(String identifier, Function<String, String> msg)
    {
        if (!isJavaIdentifier(identifier))
        {
            throw new IllegalArgumentException(msg.apply(identifier));
        }

        return identifier;
    }

    public static String requireJavaIdentifier(String identifier)
    {
        return requireJavaIdentifier(identifier, _ -> identifier.concat(" is not a Java identifier."));
    }

    public static boolean isJavaIdentifier(String identifier)
    {
        return SourceVersion.isIdentifier(identifier) && !SourceVersion.isKeyword(identifier);
    }
}
