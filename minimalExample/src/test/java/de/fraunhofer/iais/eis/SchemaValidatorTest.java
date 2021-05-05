package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.utils.JsonSchemaValidator;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SchemaValidatorTest {
    @Test
    public void validateJsonSchema() throws IOException {
        String jsonFile = "src/test/resources/MotorAAS.json";
        //String jsonFile = "src/test/resources/MotorAAS_reduced_FAST.json";
        //String jsonFile = "src/test/resources/MotorAAS_reduced.json";
        JsonSchemaValidator.validate(new String(Files.readAllBytes(Paths.get(jsonFile))));
    }
}
