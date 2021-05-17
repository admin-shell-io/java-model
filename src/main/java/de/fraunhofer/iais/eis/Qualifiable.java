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
* "Qualifiable"
* "Additional qualification of a qualifiable element."@en
* "Constraint AASd-021: Every qualifiable can only have one qualifier with the same Qualifier/type."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = AccessPermissionRule.class),
	@KnownSubtypes.Type(value = Submodel.class),
	@KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Qualifiable extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Additional qualification of a qualifiable element."@en
	* @return Returns the List of Constraints for the property qualifiers.
	* More information under https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	public List<Constraint> getQualifiers();

}
