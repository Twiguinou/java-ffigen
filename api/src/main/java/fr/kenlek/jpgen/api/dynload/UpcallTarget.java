package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Marks the function to upcall to when using the [NativeProxies] class' upcall helper methods.
/// @see NativeProxies#upcall(java.lang.invoke.MethodHandles.Lookup, java.lang.Class, java.lang.foreign.Linker, java.lang.Object, java.lang.foreign.Arena, java.lang.foreign.Linker.Option...)
@Target(METHOD)
@Retention(RUNTIME)
public @interface UpcallTarget {}
