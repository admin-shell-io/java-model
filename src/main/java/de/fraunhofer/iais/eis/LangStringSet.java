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
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultLangStringSet.class)
})
public interface LangStringSet extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "A string in a specified language."@en
	* @return Returns the List of TypedLiterals for the property langStrings.
	* More information under https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/LangStringSet/langString")
	public List<TypedLiteral> getLangStrings();

}
