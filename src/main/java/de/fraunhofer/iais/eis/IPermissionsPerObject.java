package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
	"Permission Per Object"

	"Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PermissionsPerObjectImpl.class),})
public interface IPermissionsPerObject {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Element to which permission shall be assigned."@en
	@return the IReferable of permissionsPerObjectObject
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
	public IReferable getPermissionsPerObjectObject();

	/**
	"Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	@return the List of permissionsPerObjectPermission
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
	public List<? extends IPermission> getPermissionsPerObjectPermission();

	/**
	"Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	@return the IObjectAttributes of permissionsPerObjectTargetObjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
	public IObjectAttributes getPermissionsPerObjectTargetObjectAttributes();
}
