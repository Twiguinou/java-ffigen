package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// Specifier annotation to resolve [MemoryLayout]s at runtime.
///
/// For any given element that we wish to find the layout of, the order of precedence is given by:
/// - A direct [Layout] annotation that this element possesses.
/// - A matching [Case] from a [Generic] annotation on the level above.
/// - If the element's type is annotated with [Container], the search is performed inside.
/// - Ultimately, we attempt to find the layout given by its class only, given it is a
/// [basic type][Dispatcher#resolveBaseLayout].
@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Layout
{
    /// Classes annotated with [Generic] offer default layout specifiers for every
    /// matching type.
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Generic
    {
        /// All cases to search into. If a target is specified twice inside the array,
        /// the first appearance of it is always considered the only once. Every latter occurrence
        /// is ignored.
        Case[] value();
    }

    /// Matches a certain type with the given layout specifier.
    @Target({})
    @Retention(RUNTIME)
    @interface Case
    {
        /// The type class to match.
        Class<?> target();

        /// When a matching type is found, this layout specifier is used.
        Layout layout();
    }

    /// This annotation helps to define container classes. Container classes are classes
    /// that provide a default layout, when no other is specified. Container classes may
    /// point to one and only one field or method that it contains. The element it points
    /// to must be marked with public static. If the said element is a method, it must
    /// return a subtype of [MemoryLayout] and take no parameter.
    @Target(TYPE)
    @Retention(RUNTIME)
    @interface Container
    {
        enum Kind
        {
            FIELD,
            METHOD
        }

        /// The name of the field or method.
        String value();

        /// The kind of element pointed to. By default, we expect a field.
        Kind kind() default Kind.FIELD;
    }

    /// This attribute may have one of two meanings.
    /// - If [#container] is `void.class`, it specifies a canonical layout, provided by
    /// the associated [Linker].
    /// - If [#container] is any class other than `void.class`, it follows the specification
    /// of [Container].
    String value();

    /// `void.class` for canonical layouts or the class to find the layout in.
    Class<?> container() default void.class;

    /// Ignored if [#container] is `void.class`.
    Container.Kind containerKind() default Container.Kind.FIELD;

    /// If true, the resolved [MemoryLayout] will instead be wrapped as the target layout of
    /// [ValueLayout#ADDRESS].
    boolean referenced() default false;
}
