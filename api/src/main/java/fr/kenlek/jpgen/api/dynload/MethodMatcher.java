package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public interface MethodMatcher
{
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

    static MethodMatcher of(String name)
    {
        return method -> method.getName().equals(name);
    }

    static MethodMatcher not(MethodMatcher matcher)
    {
        return method -> !matcher.matches(method);
    }

    boolean matches(Method method);
}
