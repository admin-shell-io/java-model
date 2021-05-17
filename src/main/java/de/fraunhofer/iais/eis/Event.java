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
* "Event"
* "An event."@en
* "Constraint AASd-061: The semanticId of a Event submodel element shall only reference a ConceptDescription with the category EVENT."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = BasicEvent.class)
})
public interface Event extends ModelClass, SubmodelElement {

	// standard methods


}
