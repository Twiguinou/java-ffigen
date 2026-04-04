package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Indicates that a method expects the function pointer as a leading parameter
/// inside the native function descriptor.
@Target(METHOD)
@Retention(RUNTIME)
public @interface Unbound {}
