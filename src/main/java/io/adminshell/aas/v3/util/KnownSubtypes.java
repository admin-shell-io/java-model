package io.adminshell.aas.v3.util;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Retention policy runtime required for reflective access
@Retention(RetentionPolicy.RUNTIME)
public @interface KnownSubtypes {
    /**
     * This element stores the known sub-types, e.g. implementing classes of an interface, or extending classes of a class.
     * Note that this list can never be expected to be complete, as custom implementations will not be included
     * @return List of known implementing subtypes
     */
    public KnownSubtypes.Type[] value();

    public @interface Type {
        Class<?> value();

        String name() default "";
    }

}
