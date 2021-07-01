package io.adminshell.aas.v3.spi;

import io.adminshell.aas.v3.util.ConstraintViolationException;

public interface BeanValidator {

    <T> void validate(T objToValidate) throws ConstraintViolationException;

}
