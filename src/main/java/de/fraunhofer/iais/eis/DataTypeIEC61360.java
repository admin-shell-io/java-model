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
* "Data Type IEC61360"
* "Enumeration of all IEC 61360 defined data types."@en 
*/
public enum DataTypeIEC61360 {

	/** 
	* "boolean according to IEC61360"
	*/
	BOOLEAN,

	/** 
	* "date according to IEC61360"
	*/
	DATE,

	/** 
	* "integer count according to IEC61360"
	*/
	INTEGER_COUNT,

	/** 
	* "integer currency according to IEC61360"
	* "real currency according to IEC61360"
	*/
	INTEGER_CURRENCY,

	/** 
	* "integer measure according to IEC61360"
	*/
	INTEGER_MEASURE,

	/** 
	* "retional according to IEC61360"
	*/
	RATIONAL,

	/** 
	* "retional measure according to IEC61360"
	*/
	RATIONAL_MEASURE,

	/** 
	* "real count according to IEC61360"
	*/
	REAL_COUNT,

	/** 
	* "real measure according to IEC61360"
	*/
	REAL_MEASURE,

	/** 
	* "string according to IEC61360"
	*/
	STRING,

	/** 
	* "translatable string according to IEC61360"
	*/
	STRING_TRANSLATABLE,

	/** 
	* "time according to IEC61360"
	*/
	TIME,

	/** 
	* "time stamp according to IEC61360"
	*/
	TIMESTAMP,

	/** 
	* "url according to IEC61360"
	*/
	URL;

}
