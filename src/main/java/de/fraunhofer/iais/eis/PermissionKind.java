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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
* "Permission Kind"
* "Enumeration of the kind of permissions that is given to the assignment of a permission to a subject."@en 
*/
public enum PermissionKind {

	/** 
	* "allow"
	* "Allow the permission given to the subject."@en
	*/
	ALLOW("https://admin-shell.io/aas/3/0/RC01/PermissionKind/ALLOW", Arrays.asList(new TypedLiteral("allow", "")), Arrays.asList(new TypedLiteral("Allow the permission given to the subject.", "en"))),

	/** 
	* "deny"
	* "Explicitly deny the permission given to the subject."@en
	*/
	DENY("https://admin-shell.io/aas/3/0/RC01/PermissionKind/DENY", Arrays.asList(new TypedLiteral("deny", "")), Arrays.asList(new TypedLiteral("Explicitly deny the permission given to the subject.", "en"))),

	/** 
	* "not applicable"
	* "The permission is not applicable to the subject."@en
	*/
	NOT_APPLICABLE("https://admin-shell.io/aas/3/0/RC01/PermissionKind/NOT_APPLICABLE", Arrays.asList(new TypedLiteral("not applicable", "")), Arrays.asList(new TypedLiteral("The permission is not applicable to the subject.", "en"))),

	/** 
	* "undefined"
	* "It is undefined whether the permission is allowed, not applicable or denied to the subject."@en
	*/
	UNDEFINED("https://admin-shell.io/aas/3/0/RC01/PermissionKind/UNDEFINED", Arrays.asList(new TypedLiteral("undefined", "")), Arrays.asList(new TypedLiteral("It is undefined whether the permission is allowed, not applicable or denied to the subject.", "en")));

	PermissionKind(String id, List<TypedLiteral> labels, List<TypedLiteral> comments) {
	}

}
