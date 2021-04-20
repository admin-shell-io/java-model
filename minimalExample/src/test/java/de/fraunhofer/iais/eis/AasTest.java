package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.TypedLiteral;
import org.junit.*;

import java.util.ArrayList;

public class AasTest {

    @Test
    public void motorDemoWithBuilders() {

        AssetAdministrationShell aas = new AssetAdministrationShellBuilder()
                .idShort("ExampleMotor")
                .identification(new IdentifierBuilder()
                        .identifier( new ArrayList<TypedLiteral>() {{ new TypedLiteral("http://customer.com/aas/9175_7013_7091_9168"); }} )
                        .idType(IdentifierType.IRI)
                        .build()
                )
                .submodel(
                        new SubmodelBuilder()
                            .identification(new IdentifierBuilder()
                                    .identifier( new ArrayList<TypedLiteral>() {{ new TypedLiteral("http.//i40.customer.com/type/1/1/7A7104BDAB57E184"); }} )
                                    .idType(IdentifierType.IRI)
                                    .build()
                            )
                            .submodelElement()

                )
                .submodel(
                        new SubmodelBuilder()
                                .identification(new IdentifierBuilder()
                                        .identifier(new ArrayList<TypedLiteral>() {{ new TypedLiteral("http://i40.customer.com/instance/1/1/AC69B1CB44F07935"); }})
                                        .idType(IdentifierType.IRI)
                                        .build()
                                )
                                .submodelElement()

                )
                .assetInformation(
                        new AssetInformationBuilder()
                                .globalAssetId(new ReferenceBuilder()
                                        .key(new ArrayList<Key>() {{ new KeyBuilder()
                                                .idType(KeyType.IRI)
                                                .value("http://customer.com/assets/KHBVZJSQKIY")
                                                .build();
                                        }})
                                        .build())
                                .build()
                        )
                .build();


            "submodels": [
            {
                "modelType": {
                "name": "Submodel"
            },
                "semanticId": {
                "keys": [
                {
                    "type": "GlobalReference",
                        "value": "0173-1#01-AFZ615#016",
                        "idType": "IRDI"
                }
        ]
            },
                "kind": "Instance",
                    "idShort": "TechnicalData",
                    "identification": {
                "idType": "IRI",
                        "id": "http://i40.customer.com/type/1/1/7A7104BDAB57E184"
            },
                "submodelElements": [
                {
                    "modelType": {
                    "name": "Property"
                },
                    "kind": "Instance",
                        "semanticId": {
                    "keys": [
                    {
                        "type": "ConceptDescription",
                            "value": "0173-1#02-BAA120#008",
                            "idType": "IRDI"
                    }
            ]
                },
                    "idShort": "MaxRotationSpeed",
                        "category": "PARAMETER",
                        "value": "5000",
                        "valueType": "integer"
                }
      ]
            },
            {
                "modelType": {
                "name": "Submodel"
            },
                "kind": "Instance",
                    "idShort": "OperationalData",
                    "identification": {
                "idType": "IRI",
                        "id": "http://i40.customer.com/instance/1/1/AC69B1CB44F07935"
            },
                "submodelElements": [
                {
                    "modelType": {
                    "name": "Property"
                },
                    "kind": "Instance",
                        "semanticId": {
                    "keys": [
                    {
                        "type": "ConceptDescription",
                            "value": "http://customer.com/cd/1/1/18EBD56F6B43D895",
                            "idType": "IRI"
                    }
            ]
                },
                    "idShort": "RotationSpeed",
                        "category": "VARIABLE",
                        "value": "4370",
                        "valueType": "integer"
                }
      ]
            }
  ]
        }
                .build();

    }
}
