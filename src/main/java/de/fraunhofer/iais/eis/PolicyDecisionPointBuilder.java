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

public class PolicyDecisionPointBuilder {

	private PolicyDecisionPointImpl policyDecisionPointImpl;

	public PolicyDecisionPointBuilder() {
		policyDecisionPointImpl = new PolicyDecisionPointImpl();
	}

	public PolicyDecisionPointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		policyDecisionPointImpl.id = id;
	}

	final public PolicyDecisionPointBuilder _policyDecisionPointExternalPolicyDecisionPoints_(boolean _policyDecisionPointExternalPolicyDecisionPoints_) {
		this.policyDecisionPointImpl._policyDecisionPointExternalPolicyDecisionPoints = _policyDecisionPointExternalPolicyDecisionPoints_;
		return this;
	}

	public final PolicyDecisionPoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(policyDecisionPointImpl);
		return policyDecisionPointImpl;
	}
}
