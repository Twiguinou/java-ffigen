package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/// A simplified predicate for selecting methods inside native interfaces.
@FunctionalInterface
public interface MethodMatcher
{
    /// Produces a matcher based on both a name and method type.
    /// @param name The name to match methods against.
    /// @param type The type to match methods against.
    /// @return A descriptor equal method matcher.
    static MethodMatcher of(String name, MethodType type)
    {
        return method ->
        {
            if (method.getName().equals(name) && type.returnType().equals(method.getReturnType()) &&
                type.parameterCount() == method.getParameterCount())
            {
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (int i = 0; i < type.parameterCount(); i++)
                {
                    if (!type.parameterType(i).equals(parameterTypes[i]))
                    {
                        return false;
                    }
                }
            }
            else
            {
                return false;
            }

            return true;
        };
    }

    /// Produces a matcher based on method names.
    /// @param name The name to match methods against.
    /// @return A method matcher which returns `true` for methods of the same name only.
    static MethodMatcher of(String name)
    {
        return method -> method.getName().equals(name);
    }

    /// Inverts a method matcher.
    /// @param matcher The method matcher to invert.
    /// @return The same method matcher, inverted.
    static MethodMatcher not(MethodMatcher matcher)
    {
        return method -> !matcher.matches(method);
    }

    /// This method can be used to filter out methods.
    /// @param method The input method to test.
    /// @return `true` if the given method matches, `false` otherwise.
    boolean matches(Method method);
}
