package de.fraunhofer.iais.eis.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class JsonSchemaValidator {
    private static final String SCHEMA = "src/test/resources/aas.json";

    public static void validate(String content) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode schemaNode = mapper.readTree(new String(Files.readAllBytes(Paths.get(SCHEMA))));
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersionDetector.detect(schemaNode));
        // used for a specific schema version
        //JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V201909);
        JsonSchema schema = factory.getSchema(schemaNode);
        JsonNode node = mapper.readTree(content);
        Set<ValidationMessage> errors = schema.validate(node);

        System.out.println(errors.size() == 0 ?
                "--test result -> errors: keine-none-nada" : "--test result -> errors: " + errors);

        assertThat(errors.size(), is(0));
    }
}
