package de.fraunhofer.iais.eis;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.fraunhofer.iosb.ilt.aas.service.core.AssetAdministrationShellEnvironment;
import de.fraunhofer.iosb.ilt.aas.service.serialization.json.JsonFileReader;
import de.fraunhofer.iosb.ilt.aas.service.serialization.json.JsonFileWriter;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Michael Jacoby
 */
public class FASTTest {

    private static final String JSON_FILE = "src/test/resources/MotorAAS_reduced_FAST.json";

    @Test
    public void testDeserialize() throws JsonProcessingException, IOException {
        AssetAdministrationShellEnvironment aas = new JsonFileReader().readFile(JSON_FILE);
        System.out.println(aas.getAssetAdministrationShells().iterator().next().getIdShort());
    }

    @Test
    public void testSerialize() throws JsonProcessingException, IOException {
        AssetAdministrationShellEnvironment aas = new JsonFileReader().readFile(JSON_FILE);
        String json = new JsonFileWriter().write(aas);
        System.out.println(json);
    }
}
