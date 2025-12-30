package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(METHOD)
@Retention(RUNTIME)
public @interface Descriptor
{
    @Target(METHOD)
    @Retention(RUNTIME)
    @interface Void
    {
        Layout[] value();
    }

    Layout result();

    Layout[] parameters();
}
