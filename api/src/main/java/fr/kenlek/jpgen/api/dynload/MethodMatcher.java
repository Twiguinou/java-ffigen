package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.methodDescriptor;

@FunctionalInterface
public interface MethodMatcher
{
    MethodMatcher ANY = _ -> true;
    MethodMatcher NONE = _ -> false;

    static MethodMatcher named(String name)
    {
        return method -> method.getName().equals(name);
    }

    static MethodMatcher named(String name, MethodType methodType)
    {
        return named(name).and(method -> methodType.equals(methodDescriptor(method)));
    }

    static MethodMatcher not(MethodMatcher matcher)
    {
        return method -> !matcher.matches(method);
    }

    boolean matches(Method method);

    default MethodMatcher negate()
    {
        return not(this);
    }

    default MethodMatcher or(MethodMatcher matcher)
    {
        return method -> this.matches(method) || matcher.matches(method);
    }

    default MethodMatcher and(MethodMatcher matcher)
    {
        return method -> this.matches(method) && matcher.matches(method);
    }
}
