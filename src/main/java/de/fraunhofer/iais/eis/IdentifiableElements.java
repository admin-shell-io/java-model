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
* "Identifiable Element"
* "Enumeration of all identifiable elements within an asset administration shell that are not identifiable"@en 
*/
public enum IdentifiableElements {

	/** 
	* "Asset"
	*/
	ASSET("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET", Arrays.asList(new TypedLiteral("Asset", "")), Collections.emptyList()),

	/** 
	* "Asset Administration Shell"
	*/
	ASSET_ADMINISTRATION_SHELL("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET_ADMINISTRATION_SHELL", Arrays.asList(new TypedLiteral("Asset Administration Shell", "")), Collections.emptyList()),

	/** 
	* "Concept Description"
	*/
	CONCEPT_DESCRIPTION("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/CONCEPT_DESCRIPTION", Arrays.asList(new TypedLiteral("Concept Description", "")), Collections.emptyList()),

	/** 
	* "Submodel"
	*/
	SUBMODEL("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/SUBMODEL", Arrays.asList(new TypedLiteral("Submodel", "")), Collections.emptyList());

	IdentifiableElements(String id, List<TypedLiteral> labels, List<TypedLiteral> comments) {
	}



}
