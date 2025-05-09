package fr.kenlek.jpgen.api.dynload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface Layout
{
    @Target({FIELD, METHOD})
    @Retention(RUNTIME)
    @interface Value
    {
        String value();
    }

    String value();

    Class<?> container() default void.class;

    boolean referenced() default false;
}
