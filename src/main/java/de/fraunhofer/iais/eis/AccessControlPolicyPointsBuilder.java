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

public class AccessControlPolicyPointsBuilder {

	private AccessControlPolicyPointsImpl accessControlPolicyPointsImpl;

	public AccessControlPolicyPointsBuilder() {
		accessControlPolicyPointsImpl = new AccessControlPolicyPointsImpl();
	}

	public AccessControlPolicyPointsBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		accessControlPolicyPointsImpl.id = id;
	}

	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyAdministrationPoint_(PolicyAdministrationPoint _accessControlPolicyPointsPolicyAdministrationPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyAdministrationPoint = _accessControlPolicyPointsPolicyAdministrationPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyDecisionPoint_(PolicyDecisionPoint _accessControlPolicyPointsPolicyDecisionPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyDecisionPoint = _accessControlPolicyPointsPolicyDecisionPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyEnforcementPoint_(PolicyEnforcementPoints _accessControlPolicyPointsPolicyEnforcementPoint_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyEnforcementPoint = _accessControlPolicyPointsPolicyEnforcementPoint_;
		return this;
	}


	final public AccessControlPolicyPointsBuilder _accessControlPolicyPointsPolicyInformationPoints_(PolicyInformationPoints _accessControlPolicyPointsPolicyInformationPoints_) {
		this.accessControlPolicyPointsImpl._accessControlPolicyPointsPolicyInformationPoints = _accessControlPolicyPointsPolicyInformationPoints_;
		return this;
	}

	public final AccessControlPolicyPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessControlPolicyPointsImpl);
		return accessControlPolicyPointsImpl;
	}
}
