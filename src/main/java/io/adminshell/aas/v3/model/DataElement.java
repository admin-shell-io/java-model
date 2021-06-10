package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Data Element" "A data element is a submodel element that is not further composed out of other
 * submodel elements. A data element is a submodel element that has a value. The type of value
 * differs for different subtypes of data elements."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = Blob.class),
    @KnownSubtypes.Type(value = MultiLanguageProperty.class),
    @KnownSubtypes.Type(value = Property.class),
    @KnownSubtypes.Type(value = Range.class),
    @KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement extends SubmodelElement {

    // standard methods

}
