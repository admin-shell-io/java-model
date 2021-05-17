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
* "Access Permission Rule"
* "Table that defines access permissions per authenticated subject for a set of objects (referable elements)."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAccessPermissionRule.class)
})
public interface AccessPermissionRule extends ModelClass, Referable, Qualifiable {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	* @return Returns the List of PermissionsPerObjects for the property permissionsPerObjects.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
	public List<PermissionsPerObject> getPermissionsPerObjects();

	/**
	* "Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	* @return Returns the SubjectAttributes for the property targetSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
	public SubjectAttributes getTargetSubjectAttributes();

}
