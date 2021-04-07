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

public class AccessControlPolicyPointsBuilder {

	private AccessControlPolicyPointsImpl accessControlPolicyPointsImpl;

	public AccessControlPolicyPointsBuilder() {
		accessControlPolicyPointsImpl = new AccessControlPolicyPointsImpl();
	}

	public AccessControlPolicyPointsBuilder(URI id) {
		this();
		accessControlPolicyPointsImpl.id = id;
	}

	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyAdministrationPoint_(IPolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyAdministrationPoint = _accessControlPolicyPointsPolicyAdministrationPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyDecisionPoint_(IPolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyDecisionPoint = _accessControlPolicyPointsPolicyDecisionPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyEnforcementPoint_(IPolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyEnforcementPoint = _accessControlPolicyPointsPolicyEnforcementPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyInformationPoints_(IPolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyInformationPoints = _accessControlPolicyPointsPolicyInformationPoints_;
		return this;
	}

	final public IAccessControlPolicyPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessControlPolicyPointsImpl);
		return accessControlPolicyPointsImpl;
	}
}
