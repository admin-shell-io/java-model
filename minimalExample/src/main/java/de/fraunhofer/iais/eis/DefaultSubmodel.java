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
* "Submodel"
* "A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles."@en
* "Describe the different types of Data related to the I4.0 Asset"@en
* "Constraint AASd-062: The semanticId of a Submodel shall only reference a ConceptDescription with the category APPLICATION_CLASS."@en 
*/

public class DefaultSubmodel implements Submodel {

	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Submodel", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles.", "en"), new TypedLiteral("Describe the different types of Data related to the I4.0 Asset", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Submodel Element"
	* "A submodel consists of zero or more submodel elements."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
	protected List<SubmodelElement> submodelElements;


	// no manual construction
	protected DefaultSubmodel() {
		id = VocabUtil.getInstance().createRandomUrl("submodel");
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
		return Objects.hash(new Object[]{this.submodelElements});
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
			DefaultSubmodel other = (DefaultSubmodel) obj;
			return Objects.equals(this.submodelElements, other.submodelElements);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
	final public List<SubmodelElement> getSubmodelElements() {
		return submodelElements;
	}
	
	final public void setSubmodelElements (List<SubmodelElement> submodelElements) {
		this.submodelElements = submodelElements;
	}
}
