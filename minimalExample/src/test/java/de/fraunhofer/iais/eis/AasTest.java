package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.ids.jsonld.Serializer;
import de.fraunhofer.iais.eis.util.TypedLiteral;
import org.junit.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class AasTest {

    @Test
    public void motorDemoWithBuilders() throws URISyntaxException, IOException {

        AssetAdministrationShell aas = new AssetAdministrationShellBuilder() /*
                .idShort("ExampleMotor")
                .identification(new IdentifierBuilder()
                        .identifier( new ArrayList<TypedLiteral>() {{ new TypedLiteral("http://customer.com/aas/9175_7013_7091_9168"); }} )
                        .idType(IdentifierType.IRI)
                        .build()
                )*/
                .submodel(
                        new ArrayList<Submodel>() {
                            {

                                new SubmodelBuilder() /*
                                        .identification(new IdentifierBuilder()
                                                .identifier(new ArrayList<TypedLiteral>() {{
                                                    new TypedLiteral("http.//i40.customer.com/type/1/1/7A7104BDAB57E184");
                                                }})
                                                .idType(IdentifierType.IRI)
                                                .build()
                                        )
                                        .semanticId(
                                                new ReferenceBuilder()
                                                        .key(new ArrayList<Key>() {{
                                                            new KeyBuilder()
                                                                    .idType(KeyType.IRDI)
                                                                    .value("0173-1#01-AFZ615#016")
                                                                    .build();
                                                        }})
                                                        .build()
                                        )
                                        .idShort("TechnicalData")*/
                                        .submodelElement(
                                                new ArrayList<SubmodelElement>() {{
                                                    new PropertyBuilder()
                                                            .semanticId(
                                                                    new ReferenceBuilder()
                                                                            .key(new ArrayList<Key>() {{
                                                                                new KeyBuilder()
                                                                                        .idType(KeyType.IRDI)
                                                                                        .value("0173-1#02-BAA120#008")
                                                                                        .build();
                                                                            }})
                                                                            .build()
                                                            )
                                                            .idShort("MaxRotationSpeed")
                                                            .value(new TypedLiteral("5000", new URI("http://www.w3.org/2001/XMLSchema#int")))
                                                            .build();
                                                }}
                                        )
                                        .build();

                                new SubmodelBuilder()
 /*                                       .identification(new IdentifierBuilder()
                                                .identifier(new ArrayList<TypedLiteral>() {{
                                                    new TypedLiteral("http://i40.customer.com/instance/1/1/AC69B1CB44F07935", new URI("http://www.w3.org/2001/XMLSchema#anyURI"));
                                                }})
                                                .idType(IdentifierType.IRI)
                                                .build()
                                       )
                                        .kind(ModelingKind.INSTANCE)
                                         .idShort("OperationalData")*/
                                        .submodelElement(new ArrayList<SubmodelElement>() {{
                                            new PropertyBuilder()
                                                    .semanticId(
                                                            new ReferenceBuilder()
                                                                    .key(new ArrayList<Key>() {{
                                                                        new KeyBuilder()
                                                                                .idType(KeyType.IRI)
                                                                                .value("http://customer.com/cd/1/1/18EBD56F6B43D895")
                                                                                .build();
                                                                    }})
                                                                    .build()
                                                    )
                                                    .kind(ModelingKind.INSTANCE)
                                                    .idShort("RotationSpeed")
                                                    .value(new TypedLiteral("4370", new URI("http://www.w3.org/2001/XMLSchema#int")))
                                                    .build();
                                        }})
                                        .build();
                            }}
                ) /*
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
                        )*/
                .build();

        Serializer serializer = new Serializer();
        System.out.println(serializer.serialize(aas));


    }
}
