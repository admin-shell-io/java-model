package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.utils.JsonSchemaValidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RunWith(JUnitParamsRunner.class)
public class SchemaValidatorTest {
    @Test
    @Parameters({"src/test/resources/MotorAAS.json", "src/test/resources/MotorAAS_reduced_FAST.json", "src/test/resources/MotorAAS_reduced.json"})
    public void validateJson(String file) throws IOException {
        String[] parts = file.split("/");
        String fileName = parts[parts.length - 1];
        System.out.print("\n" + fileName + " ");
        JsonSchemaValidator.validate(new String(Files.readAllBytes(Paths.get(file))));
    }
}
