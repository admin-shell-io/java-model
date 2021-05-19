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
* "Level Type"
* "Enumeration of different level types within a DataSpecificationIEC61360. Contains Min, Max, Nom, and Typ."@en 
*/
public enum LevelType {

	/** 
	* "MAX"
	* "MAX according to IEC 61360 as an Identifier scheme for maximal levels."@en
	*/
	MAX,

	/** 
	* "MIN"
	* "MIN according to IEC 61360 as an Identifier scheme for minimal levels."@en
	*/
	MIN,

	/** 
	* "NOM"
	* "NOM according to IEC 61360 as an Identifier scheme for nominal levels."@en
	*/
	NOM;

}
