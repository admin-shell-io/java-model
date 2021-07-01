/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
*/

package io.adminshell.aas.v3.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.net.URI;

//Prevent empty values from being printed - @language AND @type in combination is forbidden
//Note that the Serializer uses this class by name. If this class is renamed, make sure to adapt the MessageParser class accordingly!
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypedLiteral extends RdfResource implements Serializable {

	@JsonProperty("@language")
	private String language = null;

	public TypedLiteral() {
		super();
	}


	public TypedLiteral(String valueAndTypeOrLanguage) {
		if(valueAndTypeOrLanguage.contains("@"))
		{
			String[] splitString = valueAndTypeOrLanguage.split("@");
			this.value = splitString[0];
			this.language = splitString[1];
		}
		//.contains expects character sequence. Passing "^^"
		else if(valueAndTypeOrLanguage.contains("^^"))
		{
			//.split expects regex. "^" is meta character for "start of line", so it needs to be escaped
			String[] splitString = valueAndTypeOrLanguage.split("\\^\\^");
			this.value = splitString[0].replace("\"", "");
			this.type = splitString[1];
		}
		else
		{
			this.value = valueAndTypeOrLanguage;
			this.type = "http://www.w3.org/2001/XMLSchema#string";
		}
	}

	public TypedLiteral(String value, URI type) { super(value, type); }

	public TypedLiteral(String value, String language) {
		this.value = value;
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	//This override doesn't seem to do much...
	@Override
	public String toString() {
		String result = this.value;
		if (this.language != null && !this.language.isEmpty())
		{
			return "\"" + result + "\"@" + this.language;
		}
		if (this.type != null && !this.type.isEmpty()) return "\"" + result + "\"^^" + this.type;
		return result;
	}
}
