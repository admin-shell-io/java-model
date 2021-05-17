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
* "HasExtensions"
* "Element that can be extended by proprietary extensions."@en
*/
@KnownSubtypes({
})
public interface HasExtensions extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "An extension of the element."@en
	* @return Returns the List of Extensions for the property extensions.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasExtensions/extension")
	public List<Extension> getExtensions();

}
