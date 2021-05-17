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
* "Local Key Type"
* "Enumeration of different key value types within a key."@en 
*/
public enum LocalKeyType {

	/** 
	* "FragementId"
	* "Identifier of a fragment within a file"@en
	*/
	FRAGMENT_ID("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/FRAGMENT_ID", Arrays.asList(new TypedLiteral("FragementId", "")), Arrays.asList(new TypedLiteral("Identifier of a fragment within a file", "en"))),

	/** 
	* "IdShort"
	* "idShort of a referable element"@en
	*/
	IDSHORT("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/IDSHORT", Arrays.asList(new TypedLiteral("IdShort", "")), Arrays.asList(new TypedLiteral("idShort of a referable element", "en")));

	LocalKeyType(String id, List<TypedLiteral> labels, List<TypedLiteral> comments) {
	}


}
