package de.fraunhofer.iais.eis;

import org.junit.*;

import java.io.IOException;
import java.net.URISyntaxException;

public class AasTest {

    @Test
    public void motorDemoWithBuilders() throws URISyntaxException, IOException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .submodel(new DefaultSubmodel.Builder()
                        .submodelElement(new DefaultProperty.Builder()
                                .value("5000")
                                .valueId(new DefaultReference.Builder()
                                        .key(new DefaultKey.Builder()
                                                .value("http://www.w3.org/2001/XMLSchema#int")
                                                .build()
                                        )
                                        .build())
                                .build())
                        .build())
                .build();
        //        Serializer serializer = new Serializer();
//        System.out.println(serializer.serialize(aas));
    }

    @Test
    public void customSubmodelHierarchy() throws URISyntaxException, IOException {

        AssetAdministrationShell aas = new DefaultAssetAdministrationShell.Builder()
                .submodel(new MySubmodel.Builder()
                        .additionalProperty("additional property of MySubmodel class")
                        .submodelElement(new DefaultProperty.Builder()
                                .value("5000")
                                .valueId(new DefaultReference.Builder()
                                        .key(new DefaultKey.Builder()
                                                .value("http://www.w3.org/2001/XMLSchema#int")
                                                .build()
                                        )
                                        .build())
                                .build())
                        .build())
                .submodel(new MySubSubmodel.Builder()
                        .additionalProperty("additional property of MySubmodel class")
                        .additionalProperty2("additional property of MySubSubmodel class")
                        .submodelElement(new DefaultProperty.Builder()
                                .value("5000")
                                .valueId(new DefaultReference.Builder()
                                        .key(new DefaultKey.Builder()
                                                .value("http://www.w3.org/2001/XMLSchema#int")
                                                .build()
                                        )
                                        .build())
                                .build())
                        .build())
                .build();
    }
}
