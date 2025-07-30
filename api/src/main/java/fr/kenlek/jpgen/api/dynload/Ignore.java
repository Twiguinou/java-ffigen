package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Placing this annotation on a method or a parameter makes the corresponding type (if placed on a method,
/// this means the return type) to be ignored when determining the function descriptor.
@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Ignore {}
