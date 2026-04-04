package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.dynload.NativeProxies.methodDescriptor;

/// A [predicate][Predicate]-derived interface for Java method matching.
@FunctionalInterface
public interface MethodMatcher
{
    /// All methods are matched.
    MethodMatcher ANY = _ -> true;
    /// All methods are filtered.
    MethodMatcher NONE = _ -> false;

    /// Matches methods with the given name.
    static MethodMatcher named(String name)
    {
        return method -> method.getName().equals(name);
    }

    /// Matches methods with the given name and type.
    static MethodMatcher named(String name, MethodType methodType)
    {
        return named(name).and(method -> methodType.equals(methodDescriptor(method)));
    }

    /// Inverts the results of a matcher.
    static MethodMatcher not(MethodMatcher matcher)
    {
        return method -> !matcher.matches(method);
    }

    /// Matches a method if and only if at least one of the given predicate matches.
    static MethodMatcher or(MethodMatcher first, MethodMatcher second)
    {
        return method -> first.matches(method) || second.matches(method);
    }

    /// Matches a method if and only if both predicates match.
    static MethodMatcher and(MethodMatcher first, MethodMatcher second)
    {
        return method -> first.matches(method) && second.matches(method);
    }

    boolean matches(Method method);

    /// @see #not
    default MethodMatcher negate()
    {
        return not(this);
    }

    /// @see #or
    default MethodMatcher or(MethodMatcher matcher)
    {
        return or(this, matcher);
    }

    /// @see #and
    default MethodMatcher and(MethodMatcher matcher)
    {
        return and(this, matcher);
    }
}
