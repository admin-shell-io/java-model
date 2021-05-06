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
* "Qualifiable"
* "Additional qualification of a qualifiable element."@en
* "Constraint AASd-021: Every qualifiable can only have one qualifier with the same Qualifier/type."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Qualifiable")
public class DefaultQualifiable implements Qualifiable {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Qualifiable", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Additional qualification of a qualifiable element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifier"})
	protected List<Constraint> qualifiers;


	// no manual construction
	protected DefaultQualifiable() {
		id = VocabUtil.getInstance().createRandomUrl("qualifiable");
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

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.qualifiers});
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
			DefaultQualifiable other = (DefaultQualifiable) obj;
			return Objects.equals(this.qualifiers, other.qualifiers);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	final public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}
}
