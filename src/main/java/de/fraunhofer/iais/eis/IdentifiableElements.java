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
	ASSET,

	/** 
	* "Asset Administration Shell"
	*/
	ASSET_ADMINISTRATION_SHELL,

	/** 
	* "Concept Description"
	*/
	CONCEPT_DESCRIPTION,

	/** 
	* "Submodel"
	*/
	SUBMODEL;



}
