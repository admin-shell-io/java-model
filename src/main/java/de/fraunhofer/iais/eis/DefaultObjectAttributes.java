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

/** 
* "Object Attributes"
* "A set of data elements that describe object attributes. These attributes need to refer to a data element within an existing submodel."@en 
*/

public class DefaultObjectAttributes implements ObjectAttributes {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has object attribute"
	* "A data elements that further classifies an object."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
	protected List<Reference> objectAttributes;


	// no manual construction
	protected DefaultObjectAttributes() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.objectAttributes});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultObjectAttributes other = (DefaultObjectAttributes) obj;
			return Objects.equals(this.objectAttributes, other.objectAttributes);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultObjectAttributes other = new DefaultObjectAttributes();
		other.objectAttributes = (List<Reference>) Util.clone(this.objectAttributes);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/ObjectAttributes/objectAttribute")
	final public List<Reference> getObjectAttributes() {
		return objectAttributes;
	}
	
	final public void setObjectAttributes (List<Reference> objectAttributes) {
		this.objectAttributes = objectAttributes;
	}
}
