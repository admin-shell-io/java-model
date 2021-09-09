package io.adminshell.aas.v3.model;

import com.google.common.base.Objects;

import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.impl.DefaultIdentifier;
import io.adminshell.aas.v3.model.impl.DefaultSubmodel;

public class SetEqualsExample {
	
	public static void main(String[] args) {
		DefaultSubmodel sm_1 = new DefaultSubmodel();
		sm_1.setIdentification(new DefaultIdentifier.Builder().identifier("sm_1").build());
		DefaultSubmodel sm_2 = new DefaultSubmodel();
		sm_2.setIdentification(new DefaultIdentifier.Builder().identifier("sm_2").build());
		
		DefaultAssetAdministrationShellEnvironment env1 = new DefaultAssetAdministrationShellEnvironment();
		DefaultAssetAdministrationShellEnvironment env2 = new DefaultAssetAdministrationShellEnvironment();
		env1.getSubmodels().add(sm_1);
		env1.getSubmodels().add(sm_2);
		env2.getSubmodels().add(sm_1);
		env2.getSubmodels().add(sm_2);
		System.out.println("Environment are equal:" +  Objects.equal(env1, env2));
		System.out.println("Hashcode 1:" +  env1.hashCode());
		System.out.println("Hashcode 2:" +  env2.hashCode());
		
		DefaultAssetAdministrationShellEnvironment env3 = new DefaultAssetAdministrationShellEnvironment();
		DefaultAssetAdministrationShellEnvironment env4 = new DefaultAssetAdministrationShellEnvironment();
		env3.getSubmodels().add(sm_1);
		env3.getSubmodels().add(sm_2);
		env4.getSubmodels().add(sm_2);
		env4.getSubmodels().add(sm_1);
		System.out.println("Environment are equal:" +  Objects.equal(env3, env4));
		System.out.println("Hashcode 3:" +  env3.hashCode());
		System.out.println("Hashcode 4:" +  env4.hashCode());

	}

}
