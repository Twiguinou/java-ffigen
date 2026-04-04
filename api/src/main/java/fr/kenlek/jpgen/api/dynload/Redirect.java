package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// [Redirect] and derived annotations are ways to express various possibilities when
/// looking for function pointers.
/// @see LinkingDowncallDispatcher#findSymbolAddress(Method)
@Target(METHOD)
@Retention(RUNTIME)
public @interface Redirect
{
    /// Classes annotated with [Redirect.Generic] offer default symbol names for every
    /// matching method name. They can also apply regular expression transformations on
    /// matches.
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        /// All cases that we wish to match against.
        Case[] value();

        /// If `true`, stops at the first matching expression.
        boolean greedy() default true;

        /// Whether to resort to using the method's name if no case matched.
        boolean fallback() default false;
    }

    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        /// A regular expression tester.
        String matching() default ".*";

        /// Selects parts of the matched expression to substitute with [#value]
        String regex() default "(.*)";

        /// [String] to replace sequences where [#regex] matches.
        String value();

        /// Choose any of [String#replaceAll] and [String#replaceFirst].
        boolean replaceAll() default false;
    }

    /// All values that can potentially lead to a successful symbol lookup.
    String[] value();

    /// Whether to resort to using [Redirect.Generic] if the annotation is present
    /// or to use the method's name otherwise.
    boolean fallback() default false;
}
