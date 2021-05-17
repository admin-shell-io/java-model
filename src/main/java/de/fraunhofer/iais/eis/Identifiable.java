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
* "Identifiable"
* "An element that has a globally unique identifier."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = Submodel.class),
	@KnownSubtypes.Type(value = Asset.class),
	@KnownSubtypes.Type(value = AssetAdministrationShell.class),
	@KnownSubtypes.Type(value = ConceptDescription.class)
})
public interface Identifiable extends ModelClass, Referable {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	* @return Returns the AdministrativeInformation for the property administration.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	public AdministrativeInformation getAdministration();

	/**
	* "The globally unique identification of the element."@en
	* @return Returns the Identifier for the property identification.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	public Identifier getIdentification();

}
