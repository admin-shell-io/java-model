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
* "Kind"
* "Enumeration for denoting whether an element is a type or an instance."@en 
*/
public enum ModelingKind {

	/** 
	* "Instance"
	* "Concrete, clearly identifiable component of a certain template."@en
	* "It becomes an individual entity of a template, for example a device model, by defining specific property values."@en
	* "In an object oriented view, an instance denotes an object (of a template) (class)."@en
	*/
	INSTANCE("https://admin-shell.io/aas/3/0/RC01/ModelingKind/INSTANCE", Arrays.asList(new TypedLiteral("Instance", "")), Arrays.asList(new TypedLiteral("Concrete, clearly identifiable component of a certain template.", "en"))),

	/** 
	* "Template"
	* "Software element which specifies the common attributes shared by all instances of the template."@en
	*/
	TEMPLATE("https://admin-shell.io/aas/3/0/RC01/ModelingKind/TEMPLATE", Arrays.asList(new TypedLiteral("Template", "")), Arrays.asList(new TypedLiteral("Software element which specifies the common attributes shared by all instances of the template.", "en")));

	ModelingKind(String id, List<TypedLiteral> labels, List<TypedLiteral> comments) {
	}

}
