package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// An abstract method marked with this annotation will return the dispatcher used to implement
/// its containing class. This annotation may only be applied to a void method whose return type
/// is assignable from the dispatcher class used when implementing the containing class.
/// @see DowncallDispatcher
@Target(METHOD)
@Retention(RUNTIME)
public @interface Dispatcher {}
