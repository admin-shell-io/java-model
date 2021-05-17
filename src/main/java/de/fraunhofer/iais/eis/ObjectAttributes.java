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
* "Object Attributes"
* "A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultObjectAttributes.class)
})
public interface ObjectAttributes extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "A data elements that further classifies an object."@en
	* @return Returns the List of References for the property objectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
	public List<Reference> getObjectAttributes();

}
