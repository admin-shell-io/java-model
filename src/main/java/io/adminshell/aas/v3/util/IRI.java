package io.adminshell.aas.v3.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Retention policy runtime required for reflective access
@Retention(RetentionPolicy.RUNTIME)
public @interface IRI {
    /**
     * This annotation stores the IRI under which a certain element of a model is defined.
     * Expected behaviour when de-referencing the value of this annotation is a definition and further information about this element.
     * @return IRI defining an element
     */
    public String[] value() default {};
}
