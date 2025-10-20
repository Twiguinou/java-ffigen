package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Layout
{
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        Case[] value();
    }

    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        Class<?> target();

        Layout layout();
    }

    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Container
    {
        enum Kind
        {
            FIELD,
            METHOD
        }

        String value();

        Kind kind() default Kind.FIELD;
    }

    String value();

    Class<?> container() default void.class;

    Container.Kind containerKind() default Container.Kind.FIELD;

    boolean referenced() default false;
}
