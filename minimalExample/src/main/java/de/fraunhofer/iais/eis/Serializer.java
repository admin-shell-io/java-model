package de.fraunhofer.iais.eis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;



import de.fraunhofer.iais.eis.util.*;

public interface Serializer {

    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public String write(AssetAdministrationShellEnvironment aasEnvironment) throws IOException;

    public default void write(OutputStream out, AssetAdministrationShellEnvironment aasEnvironment) throws IOException {
        write(out, DEFAULT_CHARSET, aasEnvironment);
    }

    public default void write(OutputStream out, Charset charset, AssetAdministrationShellEnvironment aasEnvironment) throws IOException {
        try (OutputStreamWriter writer = new OutputStreamWriter(out, charset)) {
            writer.write(write(aasEnvironment));
        }
    }

    // Note that the AAS also defines a file class

    public default void write(java.io.File file, Charset charset, AssetAdministrationShellEnvironment aasEnvironment)
        throws FileNotFoundException, IOException {
        try (OutputStream out = new FileOutputStream(file)) {
            write(out, charset, aasEnvironment);
        }
    }

    public default void write(java.io.File file, AssetAdministrationShellEnvironment aasEnvironment)
        throws FileNotFoundException, IOException {
        write(file, DEFAULT_CHARSET, aasEnvironment);
    }

}
