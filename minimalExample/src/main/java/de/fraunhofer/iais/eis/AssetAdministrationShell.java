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
* "Asset Administration Shell"
* "Describes the Administration Shell for Assets, Products, Components, e.g. Machines"@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultAssetAdministrationShell.class)
})
public interface AssetAdministrationShell extends ModelClass {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	* @return Returns the List of Submodels for the property submodels.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	public List<Submodel> getSubmodels();

}
