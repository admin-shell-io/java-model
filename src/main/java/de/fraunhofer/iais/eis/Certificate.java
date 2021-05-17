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
* "Certificate"
* "A technical certificate proofing the identity through cryptographic measures."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = BlobCertificate.class)
})
public interface Certificate extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "The access control administration policy point of the AAS."@en
	* @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
	public PolicyAdministrationPoint getPolicyAdministrationPoint();

}
