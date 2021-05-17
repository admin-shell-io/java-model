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
* "Blob Certificate"
* "Certificate provided as BLOB."@en
*/
@KnownSubtypes({
	@KnownSubtypes.Type(value = DefaultBlobCertificate.class)
})
public interface BlobCertificate extends ModelClass, Certificate {

	// standard methods

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Certificate as BLOB."@en
	* @return Returns the Blob for the property blobCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
	public Blob getBlobCertificate();

	/**
	* "Extensions contained in the certificate."@en
	* @return Returns the List of References for the property containedExtensions.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
	public List<Reference> getContainedExtensions();

	/**
	* "Denotes whether this certificate is the certificated that fast added last."@en
	* @return Returns the boolean for the property lastCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
	public boolean getLastCertificate();

}
