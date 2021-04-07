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

public class PermissionsPerObjectBuilder {

	private PermissionsPerObjectImpl permissionsPerObjectImpl;

	public PermissionsPerObjectBuilder() {
		permissionsPerObjectImpl = new PermissionsPerObjectImpl();
	}

	public PermissionsPerObjectBuilder(URI id) {
		this();
		permissionsPerObjectImpl.id = id;
	}

	final public PermissionsPerObjectBuilder _permissionsPerObjectObject_(IReferable _permissionsPerObjectObject_) {
		this.permissionsPerObjectImpl._permissionsPerObjectObject = _permissionsPerObjectObject_;
		return this;
	}


	final public PermissionsPerObjectBuilder _permissionsPerObjectPermission_(ArrayList<? extends IPermission> _permissionsPerObjectPermission_) {
		this.permissionsPerObjectImpl._permissionsPerObjectPermission = _permissionsPerObjectPermission_;
		return this;
	}


	final public PermissionsPerObjectBuilder _permissionsPerObjectTargetObjectAttributes_(IObjectAttributes _permissionsPerObjectTargetObjectAttributes_) {
		this.permissionsPerObjectImpl._permissionsPerObjectTargetObjectAttributes = _permissionsPerObjectTargetObjectAttributes_;
		return this;
	}

	final public IPermissionsPerObject build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(permissionsPerObjectImpl);
		return permissionsPerObjectImpl;
	}
}
