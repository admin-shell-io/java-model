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
	@KnownSubtypes.Type(value = DefaultDataElement.class),
	@KnownSubtypes.Type(value = Blob.class),
	@KnownSubtypes.Type(value = MultiLanguageProperty.class),
	@KnownSubtypes.Type(value = Property.class),
	@KnownSubtypes.Type(value = Range.class),
	@KnownSubtypes.Type(value = ReferenceElement.class)
})
public interface DataElement extends SubmodelElement {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();


}
