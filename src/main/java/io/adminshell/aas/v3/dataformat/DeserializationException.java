package io.adminshell.aas.v3.dataformat;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

public class DeserializationException extends Exception {

    public DeserializationException(String msg) {
        super(msg);
    }

    public DeserializationException(String msg, Throwable err) {
        super(msg, err);
    }

}
