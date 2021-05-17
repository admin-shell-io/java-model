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
* "Capability"
* "A capability is the implementation-independent description of the potential of an asset to achieve a certain effect in the physical or virtual world."@en
* "Constraint AASd-058: If the semanticId of a Capability submodel element references a ConceptDescription then the ConceptDescription/category shall be CAPABILITY."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultCapability.class)
})
public interface Capability extends ModelClass, SubmodelElement {

	// standard methods


}
