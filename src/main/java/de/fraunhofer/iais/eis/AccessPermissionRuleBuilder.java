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

public class AccessPermissionRuleBuilder {

	private AccessPermissionRuleImpl accessPermissionRuleImpl;

	public AccessPermissionRuleBuilder() {
		accessPermissionRuleImpl = new AccessPermissionRuleImpl();
	}

	public AccessPermissionRuleBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		accessPermissionRuleImpl.id = id;
	}

	final public AccessPermissionRuleBuilder _accessPermissionRulePermissionsPerObject_(java.util.ArrayList<? extends PermissionsPerObject> _accessPermissionRulePermissionsPerObject_) {
		this.accessPermissionRuleImpl._accessPermissionRulePermissionsPerObject = _accessPermissionRulePermissionsPerObject_;
		return this;
	}


	final public AccessPermissionRuleBuilder _accessPermissionRuleTargetSubjectAttributes_(SubjectAttributes _accessPermissionRuleTargetSubjectAttributes_) {
		this.accessPermissionRuleImpl._accessPermissionRuleTargetSubjectAttributes = _accessPermissionRuleTargetSubjectAttributes_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.accessPermissionRuleImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.accessPermissionRuleImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AccessPermissionRuleBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public AccessPermissionRuleBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.accessPermissionRuleImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}

	public final AccessPermissionRule build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessPermissionRuleImpl);
		return accessPermissionRuleImpl;
	}
}
