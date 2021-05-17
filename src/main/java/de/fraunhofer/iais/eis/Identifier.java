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
* "Identifier"
* "Used to uniquely identify an entity by using an identifier."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultIdentifier.class)
})
public interface Identifier extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	* @return Returns the String for the property identifier.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
	public String getIdentifier();

	/**
	* "Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	* @return Returns the IdentifierType for the property idType.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
	public IdentifierType getIdType();

}
