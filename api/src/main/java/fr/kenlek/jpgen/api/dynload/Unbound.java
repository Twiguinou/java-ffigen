package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Marking an abstract method as unbound means the produced method handle is not bound
/// to a function symbol and must instead be provided on a per call basis.
@Target(METHOD)
@Retention(RUNTIME)
public @interface Unbound {}
