package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 
* "Formula" 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Formula")
public class DefaultFormula implements Serializable, Formula {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Formula", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Collections.emptyList();

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "depends on"
	* "A formula may depend on referable or even external global elements - assumed that can be referenced and their value may be evaluated - that are used in the logical expression."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn", "formulaDependsOn"})
	protected List<Reference> formulaDependsOns;


	// no manual construction
	protected DefaultFormula() {
		id = VocabUtil.getInstance().createRandomUrl("formula");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.formulaDependsOns});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultFormula other = (DefaultFormula) obj;
			return Objects.equals(this.formulaDependsOns, other.formulaDependsOns);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
	final public List<Reference> getFormulaDependsOns() {
		return formulaDependsOns;
	}
	
	final public void setFormulaDependsOns (List<Reference> formulaDependsOns) {
		this.formulaDependsOns = formulaDependsOns;
	}

}
