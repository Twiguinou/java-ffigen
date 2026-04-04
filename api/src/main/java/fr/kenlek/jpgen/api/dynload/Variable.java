package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// A method annotated with this annotation does not produce a downcall but
/// rather indicates that the resolved symbol points to a variable in shared memory.
/// @see LinkingDowncallDispatcher#dispatch
@Target(METHOD)
@Retention(RUNTIME)
public @interface Variable {}
