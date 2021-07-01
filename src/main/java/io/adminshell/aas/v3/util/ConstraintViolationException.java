package io.adminshell.aas.v3.util;

import java.util.Collection;


public class ConstraintViolationException extends RuntimeException {

    private Collection<String> messages;

    public ConstraintViolationException(Collection<String> messages) {
        this.messages = messages;
    }

    public Collection<String> getMessages() {
        return messages;
    }

    @Override
    public String toString() {
        return "ConstraintViolationException{" +
                "messages=" + messages +
                '}';
    }
}
