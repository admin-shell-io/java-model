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
* "Event Message"
* "Defines the necessary information of an event instance sent out or received."@en
* "non-normative, just only for discussion (as of November 2019)."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultEventMessage.class)
})
public interface EventMessage extends ModelClass, SubmodelElement {

	// standard methods


}
