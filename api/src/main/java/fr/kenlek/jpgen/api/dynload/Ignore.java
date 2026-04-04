package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/// A parameter or method annotated with [Ignore] skips any computation of the
/// corresponding layout. This annotation is most often used on leading [SegmentAllocator]
/// parameters, as they do not contribute to the native function descriptor.
@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Ignore {}
