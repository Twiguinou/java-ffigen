package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// A method marked with this annotation will be linked with the [Linker.Option#critical] option on.
/// At least for HotSpot, this option skips safe point installations by the JVM around a downcall
/// to gain speed. Outside critical downcalls, the method prologue normally contains a thread
/// state transition to indicate where segmentation faults occur. Optionally, you may allow
/// heap-allocated [MemorySegment]s.
///
/// This annotation must only be used for functions that return fast.
/// @see Linker.Option#critical
@Target(METHOD)
@Retention(RUNTIME)
public @interface Critical
{
    /// Whether to allow the use of heap-allocated segments as parameters.
    boolean value() default false;
}
