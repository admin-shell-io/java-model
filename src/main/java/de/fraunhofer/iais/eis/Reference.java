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
* "Reference"
* "Reference to either a model element of the same or another AAs or to an external entity. A reference is an ordered list of keys, each key referencing an element. The complete list of keys may for example be concatenated to a path that then gives unique access to an element or entity."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultReference.class)
})
public interface Reference extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Unique reference in its name space."@en
	* @return Returns the List of Keys for the property keys.
	* More information under https://admin-shell.io/aas/3/0/RC01/Reference/key
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Reference/key")
	public List<Key> getKeys();

}
