package io.adminshell.aas.v3.dataformat;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

public class SerializationException extends Exception {

    public SerializationException(String msg) {
        super(msg);
    }

    public SerializationException(String msg, Throwable err) {
        super(msg, err);
    }

}
