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
* "Lang String Set"
* "A set of strings, each annotated by the language of the string. The meaning of the string in each language shall be the same."@en 
*/

public class DefaultLangStringSet implements LangStringSet {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "Lang String"
	* "A string in a specified language."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
	protected List<TypedLiteral> langStrings;


	// no manual construction
	protected DefaultLangStringSet() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.langStrings});
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
			DefaultLangStringSet other = (DefaultLangStringSet) obj;
			return Objects.equals(this.langStrings, other.langStrings);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultLangStringSet other = new DefaultLangStringSet();
		other.langStrings = (List<TypedLiteral>) Util.clone(this.langStrings);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
	final public List<TypedLiteral> getLangStrings() {
		return langStrings;
	}
	
	final public void setLangStrings (List<TypedLiteral> langStrings) {
		this.langStrings = langStrings;
	}
}
