package io.adminshell.aas.v3.model;

import static org.junit.Assert.*;
import static io.adminshell.aas.v3.model.AASFullFactory.*;

import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import io.adminshell.aas.v3.model.impl.DefaultAssetAdministrationShellEnvironment;
import io.adminshell.aas.v3.model.impl.DefaultBlob;
import io.adminshell.aas.v3.model.impl.DefaultFile;
import io.adminshell.aas.v3.model.impl.DefaultKey;
import io.adminshell.aas.v3.model.impl.DefaultMultiLanguageProperty;
import io.adminshell.aas.v3.model.impl.DefaultProperty;
import io.adminshell.aas.v3.model.impl.DefaultReference;
import io.adminshell.aas.v3.model.impl.DefaultSubmodel;
import io.adminshell.aas.v3.model.impl.DefaultSubmodelElementCollection;

/**
 * equals consistency: objects that are equal to each other must return the same
 * hashCode
 * 
 * @author br
 *
 */
public class EqualsHashcodeTest {

	@Test
	public void testSimple() {
		DefaultAssetAdministrationShellEnvironment env1 = new DefaultAssetAdministrationShellEnvironment();
		DefaultAssetAdministrationShellEnvironment env2 = new DefaultAssetAdministrationShellEnvironment();

		assertEquals(env1, env2);
		assertEquals(env1.hashCode(), env2.hashCode());
	}

	@Test
	public void testFullSameOrder() {
		DefaultAssetAdministrationShellEnvironment env1 = new DefaultAssetAdministrationShellEnvironment.Builder()
				.assetAdministrationShells(List.of(AAS_1(), AAS_2(), AAS_3(), AAS_4()))
				.submodels(List.of(SUBMODEL_1(), SUBMODEL_2(), SUBMODEL_3(), SUBMODEL_4(), SUBMODEL_5(), SUBMODEL_6(),
						SUBMODEL_7()))
				.conceptDescriptions(List.of(CONCEPT_DESCRIPTION_1(), CONCEPT_DESCRIPTION_2(), CONCEPT_DESCRIPTION_3(),
						CONCEPT_DESCRIPTION_4()))
				.build();

		DefaultAssetAdministrationShellEnvironment env2 = new DefaultAssetAdministrationShellEnvironment.Builder()
				.assetAdministrationShells(List.of(AAS_1(), AAS_2(), AAS_3(), AAS_4()))
				.submodels(List.of(SUBMODEL_1(), SUBMODEL_2(), SUBMODEL_3(), SUBMODEL_4(), SUBMODEL_5(), SUBMODEL_6(),
						SUBMODEL_7()))
				.conceptDescriptions(List.of(CONCEPT_DESCRIPTION_1(), CONCEPT_DESCRIPTION_2(), CONCEPT_DESCRIPTION_3(),
						CONCEPT_DESCRIPTION_4()))
				.build();

		assertEquals(env1, env2);
		assertEquals(env1.hashCode(), env2.hashCode());
	}

	@Test
	public void testSubmodel() {
		Object A = SUBMODEL_1();
		Object B = SUBMODEL_1();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_2();
		B = SUBMODEL_2();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_3();
		B = SUBMODEL_3();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_4();
		B = SUBMODEL_4();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_5();
		B = SUBMODEL_5();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_6();
		B = SUBMODEL_6();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = SUBMODEL_7();
		B = SUBMODEL_7();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());
	}

	@Test
	public void testInspectSubmodel3() {
		Submodel A = SUBMODEL_3();
		Submodel B = SUBMODEL_3();

		assertEquals(A.getAdministration(), B.getAdministration());
		assertEquals(A.getAdministration().hashCode(), B.getAdministration().hashCode());

		assertEquals(A.getDescriptions(), B.getDescriptions());
		assertEquals(A.getDescriptions().hashCode(), B.getDescriptions().hashCode());

		assertEquals(A.getDisplayNames(), B.getDisplayNames());
		assertEquals(A.getDisplayNames().hashCode(), B.getDisplayNames().hashCode());

		assertEquals(A.getEmbeddedDataSpecifications(), B.getEmbeddedDataSpecifications());
		assertEquals(A.getEmbeddedDataSpecifications().hashCode(), B.getEmbeddedDataSpecifications().hashCode());

		assertEquals(A.getExtensions(), B.getExtensions());
		assertEquals(A.getExtensions().hashCode(), B.getExtensions().hashCode());

		assertEquals(A.getIdentification(), B.getIdentification());
		assertEquals(A.getIdentification().hashCode(), B.getIdentification().hashCode());

		assertEquals(A.getIdShort(), B.getIdShort());
		assertEquals(A.getIdShort().hashCode(), B.getIdShort().hashCode());

		assertEquals(A.getQualifiers(), B.getQualifiers());
		assertEquals(A.getQualifiers().hashCode(), B.getQualifiers().hashCode());

		assertEquals(A.getSemanticId(), B.getSemanticId());
		assertEquals(A.getSemanticId().hashCode(), B.getSemanticId().hashCode());

		for (int i = 0; i < A.getSubmodelElements().size(); i++) {
			SubmodelElement submodelElementA = A.getSubmodelElements().get(i);
			SubmodelElement submodelElementB = B.getSubmodelElements().get(i);

			System.out.println(
					String.format("SubmodelElement Index=%d Class=%s", i, submodelElementA.getClass().getName()));
			assertEquals(submodelElementA, submodelElementB);
			assertEquals(submodelElementA.hashCode(), submodelElementB.hashCode());
		}

		assertEquals(A.getSubmodelElements(), B.getSubmodelElements());
		assertEquals(A.getSubmodelElements().hashCode(), B.getSubmodelElements().hashCode());
	}

	@Test
	public void testInspectSubmodel3SMC() {
		Submodel A = SUBMODEL_3();
		Submodel B = SUBMODEL_3();

		for (int i = 0; i < A.getSubmodelElements().size(); i++) {

			if (A.getSubmodelElements().get(i) instanceof DefaultSubmodelElementCollection) {
				DefaultSubmodelElementCollection SMC_A = (DefaultSubmodelElementCollection) A.getSubmodelElements()
						.get(i);
				DefaultSubmodelElementCollection SMC_B = (DefaultSubmodelElementCollection) B.getSubmodelElements()
						.get(i);

				Collection<SubmodelElement> collection_A = SMC_A.getValues();
				Collection<SubmodelElement> collection_B = SMC_B.getValues();

				assertEquals(collection_A, collection_B);
				if (collection_A.hashCode() != collection_B.hashCode()) {
					System.err.println(String.format("SMC IdShort=%s Class=%s", SMC_A.getIdShort(),
							collection_A.getClass().getName()));
					Iterator<SubmodelElement> iterator_A = collection_A.iterator();
					Iterator<SubmodelElement> iterator_B = collection_B.iterator();
					if (iterator_A.hasNext() && iterator_B.hasNext()) {
						SubmodelElement next_A = iterator_A.next();
						SubmodelElement next_B = iterator_B.next();
						assertEquals(next_A, next_B);
						if (next_A.hashCode() != next_B.hashCode()) {
							System.err.println(String.format("SME IdShort=%s Class=%s", next_A.getIdShort(),
									next_A.getClass().getName()));
						}
					}

				} else {
					System.out.println(String.format("SMC IdShort=%s Class=%s", SMC_A.getIdShort(),
							collection_A.getClass().getName()));
				}
			}
		}
	}

	@Test
	public void testBlob() {
		DefaultBlob Blob_A = new DefaultBlob.Builder().idShort("ExampleBlob").category("Parameter")
				.description(new LangString("Example Blob object", "en-us"))
				.description(new LangString("Beispiel Blob Element", "de"))
				.semanticId(
						new DefaultReference.Builder()
								.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
										.value("http://acplt.org/Blobs/ExampleBlob").idType(KeyType.IRI).build())
								.build())
				.mimeType("application/pdf").value(Base64.getDecoder().decode("AQIDBAU=")).build();

		DefaultBlob Blob_B = new DefaultBlob.Builder().idShort("ExampleBlob").category("Parameter")
				.description(new LangString("Example Blob object", "en-us"))
				.description(new LangString("Beispiel Blob Element", "de"))
				.semanticId(
						new DefaultReference.Builder()
								.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
										.value("http://acplt.org/Blobs/ExampleBlob").idType(KeyType.IRI).build())
								.build())
				.mimeType("application/pdf").value(Base64.getDecoder().decode("AQIDBAU=")).build();

		assertEquals(Blob_A.getMimeType(), Blob_B.getMimeType());
		assertEquals(Blob_A.getMimeType().hashCode(), Blob_B.getMimeType().hashCode());

		assertEquals(Blob_A, Blob_B);
		assertEquals(Blob_A.hashCode(), Blob_B.hashCode());
	}

	@Test
	public void testArrayEqualsHashcode() {
		byte[] a = new byte[] { 1, 2, 3 };
		byte[] b = new byte[] { 1, 2, 3 };
		assertNotEquals(a, b);
		assertNotEquals(a.hashCode(), b.hashCode());

		assertTrue(Arrays.equals(a, b));
		assertEquals(Arrays.hashCode(a), Arrays.hashCode(b));
	}

	@Test
	public void testAAS() {
		Object A = AAS_1();
		Object B = AAS_1();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = AAS_2();
		B = AAS_2();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = AAS_3();
		B = AAS_3();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = AAS_4();
		B = AAS_4();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());
	}

	@Test
	public void testConceptDescription() {
		Object A = CONCEPT_DESCRIPTION_1();
		Object B = CONCEPT_DESCRIPTION_1();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = CONCEPT_DESCRIPTION_2();
		B = CONCEPT_DESCRIPTION_2();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = CONCEPT_DESCRIPTION_3();
		B = CONCEPT_DESCRIPTION_3();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());

		A = CONCEPT_DESCRIPTION_4();
		B = CONCEPT_DESCRIPTION_4();

		assertEquals(A, B);
		assertEquals(A.hashCode(), B.hashCode());
	}

	@Test
	public void testFullDifferentOrder() {
		DefaultAssetAdministrationShellEnvironment env1 = new DefaultAssetAdministrationShellEnvironment.Builder()
				.assetAdministrationShells(List.of(AAS_1(), AAS_2(), AAS_3(), AAS_4()))
				.submodels(List.of(SUBMODEL_1(), SUBMODEL_2(), SUBMODEL_3(), SUBMODEL_4(), SUBMODEL_5(), SUBMODEL_6(),
						SUBMODEL_7()))
				.conceptDescriptions(List.of(CONCEPT_DESCRIPTION_1(), CONCEPT_DESCRIPTION_2(), CONCEPT_DESCRIPTION_3(),
						CONCEPT_DESCRIPTION_4()))
				.build();

		DefaultAssetAdministrationShellEnvironment env2 = new DefaultAssetAdministrationShellEnvironment.Builder()
				.assetAdministrationShells(List.of(AAS_2(), AAS_1(), AAS_3(), AAS_4()))
				.submodels(List.of(SUBMODEL_2(), SUBMODEL_1(), SUBMODEL_3(), SUBMODEL_4(), SUBMODEL_5(), SUBMODEL_6(),
						SUBMODEL_7()))
				.conceptDescriptions(List.of(CONCEPT_DESCRIPTION_2(), CONCEPT_DESCRIPTION_1(), CONCEPT_DESCRIPTION_3(),
						CONCEPT_DESCRIPTION_4()))
				.build();

		assertEquals(env1, env2);
		assertEquals(env1.hashCode(), env2.hashCode());
	}

	@Test
	public void testSubmodelDifferentOrder() {
		Submodel submodel_A = SUBMODEL_3();
		Submodel submodel_B = SUBMODEL_3();

		assertEquals(submodel_A, submodel_B);
		assertEquals(submodel_A.hashCode(), submodel_B.hashCode());

		SubmodelElement remove = submodel_B.getSubmodelElements().remove(0);
		submodel_B.getSubmodelElements().add(remove);

		assertEquals(submodel_A, submodel_B);
		assertEquals(submodel_A.hashCode(), submodel_B.hashCode());
	}

	@Test
	public void testSubmodelElementOrderedCollectionDifferentOrder() {
		Submodel submodel_A = new DefaultSubmodel.Builder().idShort("TestSubmodel")
				.submodelElement(new DefaultSubmodelElementCollection.Builder()
						.idShort("ExampleSubmodelCollectionOrdered").category("Parameter")
						.description(new LangString("Example SubmodelElementCollectionOrdered object", "en-us"))
						.description(new LangString("Beispiel SubmodelElementCollectionOrdered Element", "de"))
						.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
								.type(KeyElements.GLOBAL_REFERENCE)
								.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionOrdered")
								.idType(KeyType.IRI).build()).build())
						.value(new DefaultProperty.Builder().idShort("ExampleProperty").category("Constant")
								.description(new LangString("Example Property object", "en-us"))
								.description(new LangString("Beispiel Property Element", "de"))
								.semanticId(new DefaultReference.Builder()
										.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
												.value("http://acplt.org/Properties/ExampleProperty")
												.idType(KeyType.IRI).build())
										.build())
								.value("exampleValue")
								.valueId(
										new DefaultReference.Builder()
												.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
														.idType(KeyType.IRI)
														.value("http://acplt.org/ValueId/ExampleValueId").build())
												.build())
								.valueType("string").build())
						.value(new DefaultMultiLanguageProperty.Builder().idShort("ExampleMultiLanguageProperty")
								.category("Constant")
								.description(new LangString("Example MultiLanguageProperty object", "en-us"))
								.description(new LangString("Beispiel MulitLanguageProperty Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE)
										.value("http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
										.idType(KeyType.IRI).build()).build())
								.value(new LangString("Example value of a MultiLanguageProperty element", "en-us"))
								.value(new LangString("Beispielswert für ein MulitLanguageProperty-Element", "de"))
								.valueId(new DefaultReference.Builder()
										.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
												.idType(KeyType.IRI)
												.value("http://acplt.org/ValueId/ExampleMultiLanguageValueId").build())
										.build())
								.build())
						.ordered(true).build())
				.build();

		Submodel submodel_B = new DefaultSubmodel.Builder().idShort("TestSubmodel")
				.submodelElement(new DefaultSubmodelElementCollection.Builder()
						.idShort("ExampleSubmodelCollectionOrdered").category("Parameter")
						.description(new LangString("Example SubmodelElementCollectionOrdered object", "en-us"))
						.description(new LangString("Beispiel SubmodelElementCollectionOrdered Element", "de"))
						.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
								.type(KeyElements.GLOBAL_REFERENCE)
								.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionOrdered")
								.idType(KeyType.IRI).build()).build())
						.value(new DefaultMultiLanguageProperty.Builder().idShort("ExampleMultiLanguageProperty")
								.category("Constant")
								.description(new LangString("Example MultiLanguageProperty object", "en-us"))
								.description(new LangString("Beispiel MulitLanguageProperty Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE)
										.value("http://acplt.org/MultiLanguageProperties/ExampleMultiLanguageProperty")
										.idType(KeyType.IRI).build()).build())
								.value(new LangString("Example value of a MultiLanguageProperty element", "en-us"))
								.value(new LangString("Beispielswert für ein MulitLanguageProperty-Element", "de"))
								.valueId(new DefaultReference.Builder()
										.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
												.idType(KeyType.IRI)
												.value("http://acplt.org/ValueId/ExampleMultiLanguageValueId").build())
										.build())
								.build())
						.value(new DefaultProperty.Builder().idShort("ExampleProperty").category("Constant")
								.description(new LangString("Example Property object", "en-us"))
								.description(new LangString("Beispiel Property Element", "de"))
								.semanticId(new DefaultReference.Builder()
										.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
												.value("http://acplt.org/Properties/ExampleProperty")
												.idType(KeyType.IRI).build())
										.build())
								.value("exampleValue")
								.valueId(
										new DefaultReference.Builder()
												.key(new DefaultKey.Builder().type(KeyElements.GLOBAL_REFERENCE)
														.idType(KeyType.IRI)
														.value("http://acplt.org/ValueId/ExampleValueId").build())
												.build())
								.valueType("string").build())
						.ordered(true).build())
				.build();

		SubmodelElementCollection orderedSMC_A = (SubmodelElementCollection) submodel_A.getSubmodelElements().get(0);
		SubmodelElementCollection orderedSMC_B = (SubmodelElementCollection) submodel_B.getSubmodelElements().get(0);

		assertNotEquals(orderedSMC_A, orderedSMC_B);
		assertNotEquals(orderedSMC_A.hashCode(), orderedSMC_B.hashCode());

	}

	@Test
	public void testSubmodelElementUnorderedCollectionDifferentOrder() {
		Submodel submodel_A = new DefaultSubmodel.Builder().idShort("TestSubmodel")
				.submodelElement(new DefaultSubmodelElementCollection.Builder()
						.idShort("ExampleSubmodelCollectionUnordered").category("Parameter")
						.description(new LangString("Example SubmodelElementCollectionUnordered object", "en-us"))
						.description(new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de"))
						.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
								.type(KeyElements.GLOBAL_REFERENCE)
								.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
								.idType(KeyType.IRI).build()).build())
						.value(new DefaultBlob.Builder().idShort("ExampleBlob").category("Parameter")
								.description(new LangString("Example Blob object", "en-us"))
								.description(new LangString("Beispiel Blob Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE).value("http://acplt.org/Blobs/ExampleBlob")
										.idType(KeyType.IRI).build()).build())
								.mimeType("application/pdf").value(Base64.getDecoder().decode("AQIDBAU=")).build())
						.value(new DefaultFile.Builder().idShort("ExampleFile").category("Parameter")
								.description(new LangString("Example File object", "en-us"))
								.description(new LangString("Beispiel File Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE).value("http://acplt.org/Files/ExampleFile")
										.idType(KeyType.IRI).build()).build())
								.value("/TestFile.pdf").mimeType("application/pdf").build())
						.ordered(false).build())
				.build();

		Submodel submodel_B = new DefaultSubmodel.Builder().idShort("TestSubmodel")
				.submodelElement(new DefaultSubmodelElementCollection.Builder()
						.idShort("ExampleSubmodelCollectionUnordered").category("Parameter")
						.description(new LangString("Example SubmodelElementCollectionUnordered object", "en-us"))
						.description(new LangString("Beispiel SubmodelElementCollectionUnordered Element", "de"))
						.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
								.type(KeyElements.GLOBAL_REFERENCE)
								.value("http://acplt.org/SubmodelElementCollections/ExampleSubmodelElementCollectionUnordered")
								.idType(KeyType.IRI).build()).build())
						.value(new DefaultFile.Builder().idShort("ExampleFile").category("Parameter")
								.description(new LangString("Example File object", "en-us"))
								.description(new LangString("Beispiel File Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE).value("http://acplt.org/Files/ExampleFile")
										.idType(KeyType.IRI).build()).build())
								.value("/TestFile.pdf").mimeType("application/pdf").build())
						.value(new DefaultBlob.Builder().idShort("ExampleBlob").category("Parameter")
								.description(new LangString("Example Blob object", "en-us"))
								.description(new LangString("Beispiel Blob Element", "de"))
								.semanticId(new DefaultReference.Builder().key(new DefaultKey.Builder()
										.type(KeyElements.GLOBAL_REFERENCE).value("http://acplt.org/Blobs/ExampleBlob")
										.idType(KeyType.IRI).build()).build())
								.mimeType("application/pdf").value(Base64.getDecoder().decode("AQIDBAU=")).build())
						.ordered(false).build())
				.build();

		SubmodelElementCollection unorderedSMC_A = (SubmodelElementCollection) submodel_A.getSubmodelElements().get(0);
		SubmodelElementCollection unorderedSMC_B = (SubmodelElementCollection) submodel_B.getSubmodelElements().get(0);

		assertEquals(unorderedSMC_A, unorderedSMC_B);
		assertEquals(unorderedSMC_A.hashCode(), unorderedSMC_B.hashCode());

	}

	@Test
	public void testHashSetHashCodeAndEquals() {
		Set<StaticHashCodeTestObject> hashSet_A = new HashSet<>();
		Set<StaticHashCodeTestObject> hashSet_B = new HashSet<>();
		
		hashSet_A.add(new StaticHashCodeTestObject(1));
		hashSet_A.add(new StaticHashCodeTestObject(1));
		hashSet_A.add(new StaticHashCodeTestObject(2));
		hashSet_A.add(new StaticHashCodeTestObject(3));

		hashSet_B.add(new StaticHashCodeTestObject(3));
		hashSet_B.add(new StaticHashCodeTestObject(2));
		hashSet_B.add(new StaticHashCodeTestObject(1));
		hashSet_B.add(new StaticHashCodeTestObject(1));
		
		assertEquals(3, hashSet_A.size());
		assertEquals(3, hashSet_B.size());

		assertEquals(hashSet_A, hashSet_B);
		assertEquals(hashSet_A.hashCode(), hashSet_B.hashCode());
	}

	private class StaticHashCodeTestObject {
		
		private int parameter;

		public StaticHashCodeTestObject(int parameter) {
			this.parameter = parameter;
		}

		@Override
		public int hashCode() {
			return 0;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StaticHashCodeTestObject other = (StaticHashCodeTestObject) obj;
			return parameter == other.parameter;
		}
		
	}

}
