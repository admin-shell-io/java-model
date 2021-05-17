package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* "Data Element"
* "A data element is a submodel element that is not further composed out of other submodel elements. A data element is a submodel element that has a value. The type of value differs for different subtypes of data elements."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = Blob.class),
	@KnownSubtypes.Type(value = MultiLanguageProperty.class),
	@KnownSubtypes.Type(value = Property.class),
	@KnownSubtypes.Type(value = Range.class),
	@KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement extends ModelClass, SubmodelElement {

	// standard methods


}
