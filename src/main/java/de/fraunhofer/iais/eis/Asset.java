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
* "Asset"
* "An Asset describes meta data of an asset that is represented by an AAS. The asset may either represent an asset type or an asset instance. The asset has a globally unique identifier plus - if needed - additional domain specific (proprietary) identifiers."@en
* "Objects may be known in the form of a type or of an instance. An object in the planning phase is known as a type"@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAsset.class)
})
public interface Asset extends ModelClass, HasDataSpecification, Identifiable {

	// standard methods


}
