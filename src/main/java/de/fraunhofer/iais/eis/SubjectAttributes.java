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
* "Subject Attributes"
* "A set of data elements that further classifies a specific subject."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultSubjectAttributes.class)
})
public interface SubjectAttributes extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "A data element that further classifies a specific subject. "@en
	* "Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced within the \'selectableSubjectAttributes\' attribute of \'AccessControl\'."@en
	* @return Returns the List of DataElements for the property subjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
	public List<DataElement> getSubjectAttributes();

}
