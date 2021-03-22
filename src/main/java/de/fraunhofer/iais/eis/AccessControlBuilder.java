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

public class AccessControlBuilder {

	private AccessControlImpl accessControlImpl;

	public AccessControlBuilder() {
		accessControlImpl = new AccessControlImpl();
	}

	public AccessControlBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		accessControlImpl.id = id;
	}

	final public AccessControlBuilder _accessControlAccessPermissionRule_(java.util.ArrayList<? extends AccessPermissionRule> _accessControlAccessPermissionRule_) {
		this.accessControlImpl._accessControlAccessPermissionRule = _accessControlAccessPermissionRule_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectableSubjectAttributes_(Submodel _accessControlSelectableSubjectAttributes_) {
		this.accessControlImpl._accessControlSelectableSubjectAttributes = _accessControlSelectableSubjectAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultSubjectAttributes_(Submodel _accessControlDefaultSubjectAttributes_) {
		this.accessControlImpl._accessControlDefaultSubjectAttributes = _accessControlDefaultSubjectAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectablePermissions_(Submodel _accessControlSelectablePermissions_) {
		this.accessControlImpl._accessControlSelectablePermissions = _accessControlSelectablePermissions_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultPermissions_(Submodel _accessControlDefaultPermissions_) {
		this.accessControlImpl._accessControlDefaultPermissions = _accessControlDefaultPermissions_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectableEnvironmentAttributes_(Submodel _accessControlSelectableEnvironmentAttributes_) {
		this.accessControlImpl._accessControlSelectableEnvironmentAttributes = _accessControlSelectableEnvironmentAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultEnvironmentAttributes_(Submodel _accessControlDefaultEnvironmentAttributes_) {
		this.accessControlImpl._accessControlDefaultEnvironmentAttributes = _accessControlDefaultEnvironmentAttributes_;
		return this;
	}

	public final AccessControl build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessControlImpl);
		return accessControlImpl;
	}
}
