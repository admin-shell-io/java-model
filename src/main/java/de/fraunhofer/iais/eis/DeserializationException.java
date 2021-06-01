package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class DeserializationException extends Exception {

    public DeserializationException(String msg) {
        super(msg);
    }

    public DeserializationException(String msg, Throwable err) {
        super(msg, err);
    }

}
