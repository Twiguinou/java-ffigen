package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// This annotation can be used to explicitly give the native descriptor of a downcall.
/// To define a descriptor without a return type, use [Void].
@Target(METHOD)
@Retention(RUNTIME)
public @interface Descriptor
{
    /// A convenience annotation for native descriptors with no return type.
    @Target(METHOD)
    @Retention(RUNTIME)
    @interface Void
    {
        /// @see Descriptor#parameters()
        Layout[] value();
    }

    /// The layout to use as the return type.
    Layout result();

    /// The sequence of parameter layouts to use inside the native descriptor.
    Layout[] parameters();
}
