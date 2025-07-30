package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Specifies call state captures to apply to a function downcall.
/// @see java.lang.foreign.Linker.Option#captureCallState(String...)
@Target(METHOD)
@Retention(RUNTIME)
public @interface StateAware
{
    /// Get the call state set to capture.
    /// @return The call state array.
    String[] value();
}
