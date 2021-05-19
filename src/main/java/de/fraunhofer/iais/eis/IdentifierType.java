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
* "Identifier Type"
* "Enumeration of different types of Identifiers for global identification"@en 
*/
public enum IdentifierType {

	/** 
	* "Custom"
	* "Custom identifiers like GUIDs (globally unique Identifiers)"@en
	*/
	CUSTOM,

	/** 
	* "IRDI"
	* "IRDI according to ISO29002-5 as an Identifier scheme for properties and classifications."@en
	*/
	IRDI,

	/** 
	* "IRI"
	* "IRI. Should only be used if unicode symbols are used that are not allowed in URI."@en
	*/
	IRI;


}
