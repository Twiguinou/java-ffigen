package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// When placed on a method or a parameter, this annotation is used to override the process by which the
/// final memory layout is found.
/// In the scope of this API, this annotation is only useful when using the [LinkingDowncallDispatcher]
/// and when doing upcalls with [NativeProxies#upcall(java.lang.invoke.MethodHandles.Lookup, java.lang.Class, java.lang.foreign.Linker, java.lang.Object, java.lang.foreign.Arena, java.lang.foreign.Linker.Option...)].
///
/// Layouts are found by searching for fields inside container classes.
/// A special search is instead used when the container class is `void.class`, using canonical layouts instead.
///
/// This annotation supersedes the [Generic] annotation when the latter matches the same type.
@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Layout
{
    /// This annotation can be used at the class level to specify generic layout cases.
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        /// Get the array of all available cases.
        /// @return The array of all available cases.
        Case[] value();
    }

    /// A case matches a class type and maps it to a given layout.
    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        /// Get the type to match against.
        /// @return The target class to match.
        Class<?> target();

        /// Get the layout to use when a match occurs.
        /// @return The layout to use when a match occurs.
        Layout layout();
    }

    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Container
    {
        String value();
    }

    /// Get the identifier to use when searching for compatible fields inside the container class.
    ///
    /// If the container class is `void.class`, the search is applied inside the linker's canonical layouts.
    /// @return The search identifier.
    String value();

    /// Get the container class to search layouts in. If the return value is `void.class`, then the identifier
    /// is instead used to search inside the linker's canonical layouts list.
    /// @return The container class.
    Class<?> container() default void.class;

    /// When `true`, the resolved layout is instead used as the pointed layout of an [address layout][java.lang.foreign.AddressLayout].
    /// @return `true` if the layout is then referenced, `false` otherwise.
    boolean referenced() default false;
}
