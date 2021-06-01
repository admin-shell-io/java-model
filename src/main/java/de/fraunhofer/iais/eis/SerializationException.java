package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

public class SerializationException extends Exception {

    public SerializationException(String msg) {
        super(msg);
    }

    public SerializationException(String msg, Throwable err) {
        super(msg, err);
    }

}
