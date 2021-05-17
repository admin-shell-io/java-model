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
* "Annotated Relationship Element"
* "An annotated relationship element is an relationship element that can be annotated with additional data elements."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAnnotatedRelationshipElement.class)
})
public interface AnnotatedRelationshipElement extends ModelClass, RelationshipElement {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Annotations that hold for the relationships between the two elements."@en
	* @return Returns the List of DataElements for the property annotations.
	* More information under https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	public List<DataElement> getAnnotations();

}
