package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// @see Linker.Option#captureCallState
@Target(METHOD)
@Retention(RUNTIME)
public @interface StateAware
{
    String[] value();
}
