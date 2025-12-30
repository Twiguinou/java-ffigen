package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(METHOD)
@Retention(RUNTIME)
public @interface Redirect
{
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        Case[] value();

        boolean greedy() default true;

        boolean fallback() default false;
    }

    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        String matching() default ".*";

        String regex() default "(.*)";

        String value();

        boolean replaceAll() default false;
    }

    String[] value();

    boolean fallback() default false;
}
