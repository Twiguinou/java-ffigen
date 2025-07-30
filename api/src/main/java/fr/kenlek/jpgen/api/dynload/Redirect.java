package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// By default, when searching for a function pointer, [LinkingDowncallDispatcher] uses the method's name.
/// This annotation can be used to redirect the search to other symbols.
///
/// This annotation, or any of its subclasses, is not used on a method annotated with [Unbound].
@Target(METHOD)
@Retention(RUNTIME)
public @interface Redirect
{
    /// This annotation can be used at the class level to specify generic symbol patterns.
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        Case[] value();

        /// When greedy, all remaining generic test cases are applied even if one has already passed.
        /// @return `true` if the search step must be greedy, `false` otherwise.
        boolean greedy() default true;

        /// Setting this value to `true` lets it be used as a fallback when a [Redirect] annotation
        /// is present on the method already.
        /// @return `true` if this annotation must be used as a fallback, `false` otherwise.
        boolean fallback() default false;
    }

    /// A case regex string processor for [Generic] annotations. Works exactly like
    /// [String#replaceAll(String, String)] or [String#replaceFirst(String, String)].
    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        /// This regex matcher is first used to filter method names.
        /// @return The regular expression against which the method name is to be tested.
        String matching() default ".*";

        /// This regex matcher is then used to capture values inside the method name.
        /// @return The regular expression against which the method name is evaluated.
        String regex() default "(.*)";

        /// The replacement string used when a method name has matched.
        /// @return The replacement regex string, which capturing groups.
        String value();

        /// Whether or not to process all occurrences of the regex string.
        /// @return `true` if all occurrences of this case must be replaced, `false` if only the first
        /// must be processed.
        boolean replaceAll() default false;
    }

    /// The symbols to use, in encounter order, to find the function pointer.
    /// @return The function symbol array.
    String[] value();

    /// This value is used to fallback to the method's name when none of the provided values worked.
    /// @return `true` if the dispatcher should use the method's name when no value worked previously.
    boolean fallback() default false;
}
