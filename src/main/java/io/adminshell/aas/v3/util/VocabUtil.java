package io.adminshell.aas.v3.util;

import io.adminshell.aas.v3.spi.BeanSerializer;
import io.adminshell.aas.v3.spi.BeanValidator;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.UUID;


public class VocabUtil {

    private final ServiceLoader<BeanSerializer> serializerLoader;
    private final ServiceLoader<BeanValidator> validatorLoader;

    private final static String PROTOCOL = "https";
    private final static String HOST = "w3id.org";

    public static String randomUrlBase;

    public VocabUtil() {
        serializerLoader = ServiceLoader.load(BeanSerializer.class);
        validatorLoader = ServiceLoader.load(BeanValidator.class);
    }

    /**
     * This function used to be the sole access point to the private constructor in a singleton class
     * Seeing the issues regarding thread safety, this approach was abandoned, making this function unnecessary
     * @return new VocabUtil instance
     * @deprecated use constructor directly instead
     */
    @Deprecated
    public static VocabUtil getInstance() {
        return new VocabUtil();
    }

    /**
     * Generates a random URL starting with https://w3id.org/idsa/autogen/{path}/RANDOM-STRING
     * This behaviour can be altered by setting the static variable randomUrlBase. Then, the URL will be randomUrlBase/{path}/RANDOM-STRING
     * @param path Path to be appended to base URL
     * @return randomized URL according to predefined schema
     */
    public URI createRandomUrl(String path) {
        try {
            if(randomUrlBase != null)
            {
                if(!randomUrlBase.endsWith("/"))
                {
                    randomUrlBase += "/";
                }
                return new URL(randomUrlBase + path + "/" + UUID.randomUUID()).toURI();
            }
            return new URL(PROTOCOL, HOST, "/idsa/autogen/" + path + "/" + UUID.randomUUID()).toURI();
        }
        catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> void validate(T objToValidate) throws ConstraintViolationException {
        for (BeanValidator beanValidator : validatorLoader) {
            beanValidator.validate(objToValidate);
        }
    }

    public String toRdf(Object obj) {
        Iterator<BeanSerializer> iterator = serializerLoader.iterator();
        return iterator.hasNext() ? iterator.next().toRdf(obj) : "";
    }

    public <T> T fromRdf(String rdf, Class<T> valueType) {
        Iterator<BeanSerializer> iterator = serializerLoader.iterator();
        return iterator.hasNext() ? iterator.next().fromRdf(rdf, valueType) : null;
    }

    public <T> T getByString(T[] values, String label) {
        for (T value : values) {
            if (value.toString().equals(label)) return value;
        }
        return null;
    }

}
