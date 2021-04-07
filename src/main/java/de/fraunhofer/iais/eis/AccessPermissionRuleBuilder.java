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

public class AccessPermissionRuleBuilder {

	private AccessPermissionRuleImpl accessPermissionRuleImpl;

	public AccessPermissionRuleBuilder() {
		accessPermissionRuleImpl = new AccessPermissionRuleImpl();
	}

	public AccessPermissionRuleBuilder(URI id) {
		this();
		accessPermissionRuleImpl.id = id;
	}

	final public AccessPermissionRuleBuilder _accessPermissionRulePermissionsPerObject_(ArrayList<? extends IPermissionsPerObject> _accessPermissionRulePermissionsPerObject_) {
		this.accessPermissionRuleImpl._accessPermissionRulePermissionsPerObject = _accessPermissionRulePermissionsPerObject_;
		return this;
	}


	final public AccessPermissionRuleBuilder _accessPermissionRuleTargetSubjectAttributes_(ISubjectAttributes _accessPermissionRuleTargetSubjectAttributes_) {
		this.accessPermissionRuleImpl._accessPermissionRuleTargetSubjectAttributes = _accessPermissionRuleTargetSubjectAttributes_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.accessPermissionRuleImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.accessPermissionRuleImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.accessPermissionRuleImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableIdShort_(String _referableIdShort_) {
		this.accessPermissionRuleImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableParent_(URI _referableParent_) {
		this.accessPermissionRuleImpl._referableParent = _referableParent_;
		return this;
	}


	final public AccessPermissionRuleBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.accessPermissionRuleImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}

	final public IAccessPermissionRule build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessPermissionRuleImpl);
		return accessPermissionRuleImpl;
	}
}
