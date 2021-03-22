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

public class PermissionBuilder {

	private PermissionImpl permissionImpl;

	public PermissionBuilder() {
		permissionImpl = new PermissionImpl();
	}

	public PermissionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		permissionImpl.id = id;
	}

	final public PermissionBuilder _permissionKindOfPermission_(PermissionKind _permissionKindOfPermission_) {
		this.permissionImpl._permissionKindOfPermission = _permissionKindOfPermission_;
		return this;
	}


	final public PermissionBuilder _permissionPermission_(Property _permissionPermission_) {
		this.permissionImpl._permissionPermission = _permissionPermission_;
		return this;
	}

	public final Permission build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(permissionImpl);
		return permissionImpl;
	}
}
