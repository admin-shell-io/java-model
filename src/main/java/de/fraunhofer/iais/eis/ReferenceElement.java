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
* "Reference Element"
* "A reference element is a data element that defines a logical reference to another element within the same or another AAS or a reference to an external object or entity."@en
* "Constraint AASd-054: The semanticId of a ReferenceElement shall only reference a ConceptDescription with the category REFERENCE."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultReferenceElement.class)
})
public interface ReferenceElement extends ModelClass, DataElement {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Reference to any other referable element of the same of any other AAS or a reference to an external object or entity."@en
	* @return Returns the Reference for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value")
	public Reference getValue();

}
