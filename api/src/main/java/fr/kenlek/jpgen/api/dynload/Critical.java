package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Methods marked with this annotation are linked with the [critical][java.lang.foreign.Linker.Option#critical(boolean)] option.
/// @see java.lang.foreign.Linker.Option
@Target(METHOD)
@Retention(RUNTIME)
public @interface Critical
{
    /// Get the availability of heap memory for downcalls.
    /// @return `true` if this method can access Java heap allocated memory, `false` otherwise.
    boolean value() default false;
}
