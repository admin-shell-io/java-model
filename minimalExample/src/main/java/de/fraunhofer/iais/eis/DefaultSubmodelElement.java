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
* "Submodel Element"
* "A submodel element is an element suitable for the description and differentiation of assets."@en
* "The concept of type and instance applies to submodel elements. Properties are special submodel elements. The property types are defined in dictionaries (like the IEC Common Data Dictionary or eCl@ss), they do not have a value. The property type (kind=Type) is also called data element type in some standards. The property instances (kind=Instance) typically have a value. A property instance is also called property-value pair in certain standards."@en 
*/

public class DefaultSubmodelElement implements SubmodelElement {

	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Submodel Element", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A submodel element is an element suitable for the description and differentiation of assets.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology


	// no manual construction
	protected DefaultSubmodelElement() {
		id = VocabUtil.getInstance().createRandomUrl("submodelElement");
	}

	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode()});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		}
		return true;
	}

}
