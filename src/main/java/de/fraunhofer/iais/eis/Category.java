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
* "Category"
* "A enumeration for data elements except for files and blobs."@en 
*/
public enum Category {

	/** 
	* "Constant"
	* "A constant property is a property with a value that does not change over time. In eCl@ss this kind of category has the category \'Coded Value\'."@en
	*/
	CONSTANT,

	/** 
	* "Parameter"
	* "A parameter property is a property that is once set and then typically does not change over time. This is for example the case for configuration parameters."@en
	*/
	PARAMETER,

	/** 
	* "Variable"
	* "A variable property is a property that is calculated during runtime, i.e. its value is a runtime value."@en
	*/
	VARIABLE;

}
