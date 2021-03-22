package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class PermissionsPerObjectBuilder {

	private PermissionsPerObjectImpl permissionsPerObjectImpl;

	public PermissionsPerObjectBuilder() {
		permissionsPerObjectImpl = new PermissionsPerObjectImpl();
	}

	public PermissionsPerObjectBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		permissionsPerObjectImpl.id = id;
	}

	final public PermissionsPerObjectBuilder _permissionsPerObjectObject_(Referable _permissionsPerObjectObject_) {
		this.permissionsPerObjectImpl._permissionsPerObjectObject = _permissionsPerObjectObject_;
		return this;
	}


	final public PermissionsPerObjectBuilder _permissionsPerObjectPermission_(java.util.ArrayList<? extends Permission> _permissionsPerObjectPermission_) {
		this.permissionsPerObjectImpl._permissionsPerObjectPermission = _permissionsPerObjectPermission_;
		return this;
	}


	final public PermissionsPerObjectBuilder _permissionsPerObjectTargetObjectAttributes_(ObjectAttributes _permissionsPerObjectTargetObjectAttributes_) {
		this.permissionsPerObjectImpl._permissionsPerObjectTargetObjectAttributes = _permissionsPerObjectTargetObjectAttributes_;
		return this;
	}

	public final PermissionsPerObject build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(permissionsPerObjectImpl);
		return permissionsPerObjectImpl;
	}
}
