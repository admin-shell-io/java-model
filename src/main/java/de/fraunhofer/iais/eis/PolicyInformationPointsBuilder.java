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

public class PolicyInformationPointsBuilder {

	private PolicyInformationPointsImpl policyInformationPointsImpl;

	public PolicyInformationPointsBuilder() {
		policyInformationPointsImpl = new PolicyInformationPointsImpl();
	}

	public PolicyInformationPointsBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		policyInformationPointsImpl.id = id;
	}

	final public PolicyInformationPointsBuilder _policyInformationPointsExternalInformationPoints_(boolean _policyInformationPointsExternalInformationPoints_) {
		this.policyInformationPointsImpl._policyInformationPointsExternalInformationPoints = _policyInformationPointsExternalInformationPoints_;
		return this;
	}


	final public PolicyInformationPointsBuilder _policyInformationPointsInternalInformationPoint_(java.util.ArrayList<? extends Submodel> _policyInformationPointsInternalInformationPoint_) {
		this.policyInformationPointsImpl._policyInformationPointsInternalInformationPoint = _policyInformationPointsInternalInformationPoint_;
		return this;
	}

	public final PolicyInformationPoints build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(policyInformationPointsImpl);
		return policyInformationPointsImpl;
	}
}
