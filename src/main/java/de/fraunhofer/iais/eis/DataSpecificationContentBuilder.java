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

public class DataSpecificationContentBuilder {

	private DataSpecificationContentImpl dataSpecificationContentImpl;

	public DataSpecificationContentBuilder() {
		dataSpecificationContentImpl = new DataSpecificationContentImpl();
	}

	public DataSpecificationContentBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dataSpecificationContentImpl.id = id;
	}

	public final DataSpecificationContent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataSpecificationContentImpl);
		return dataSpecificationContentImpl;
	}
}
