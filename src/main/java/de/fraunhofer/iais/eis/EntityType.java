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
* "Entity Type"
* "Enumeration for denoting whether an entity is a self-managed entity or a co-managed entity."@en 
*/
public enum EntityType {

	/** 
	* "Co-managed Entity"
	* "For co-managed entities there is no separate AAS. Co-managed entities need to be part of a self-managed entity."@en
	*/
	CO_MANAGED_ENTITY,

	/** 
	* "Self-managed Entity"
	* "Self-Managed Entities have their own AAS but can be part of the bill of material of a composite self-managed entity. The asset of an I4.0 Component is a self-managed entity per definition."@en
	*/
	SELF_MANAGED_ENTITY;

}
