package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Any class or interface used inside [LinkingUpcallDispatcher] must have one and only
/// one candidate method annotated with [UpcallTarget].
/// @see LinkingUpcallDispatcher#resolveUpcallMaker
@Target(METHOD)
@Retention(RUNTIME)
public @interface UpcallTarget {}
