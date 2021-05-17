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
* "Relationship Element"
* "Constraint AASd-055: The semanticId of a RelationshipElement or a AnnotatedRelationshipElement shall only reference a ConceptDescription with the category RELATIONSHIP."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultRelationshipElement.class),
	@KnownSubtypes.Type(value = AnnotatedRelationshipElement.class)
})
public interface RelationshipElement extends ModelClass, SubmodelElement {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "First element in the relationship taking the role of the subject."@en
	* @return Returns the Reference for the property first.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	public Reference getFirst();

	/**
	* "Second element in the relationship taking the role of the object."@en
	* @return Returns the Reference for the property second.
	* More information under https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	public Reference getSecond();

}
