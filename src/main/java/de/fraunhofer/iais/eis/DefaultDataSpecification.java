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
* "is case of"
* "Reference to an external definition the concept is compatible to or was derived from."@en 
*/

public class DefaultDataSpecification implements DataSpecification {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "is case of"
	* "Reference to an external definition the concept is compatible to or was derived from."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
	protected List<DataSpecificationContent> dataSpecificationContents;


	// no manual construction
	protected DefaultDataSpecification() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.dataSpecificationContents});
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
			DefaultDataSpecification other = (DefaultDataSpecification) obj;
			return Objects.equals(this.dataSpecificationContents, other.dataSpecificationContents);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultDataSpecification other = new DefaultDataSpecification();
		other.dataSpecificationContents = (List<DataSpecificationContent>) Util.clone(this.dataSpecificationContents);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/DataSpecification/dataSpecificationContent")
	final public List<DataSpecificationContent> getDataSpecificationContents() {
		return dataSpecificationContents;
	}
	
	final public void setDataSpecificationContents (List<DataSpecificationContent> dataSpecificationContents) {
		this.dataSpecificationContents = dataSpecificationContents;
	}
}
