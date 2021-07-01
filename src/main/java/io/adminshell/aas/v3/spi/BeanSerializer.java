package io.adminshell.aas.v3.spi;

public interface BeanSerializer {

    String toRdf(Object obj);
    <T> T fromRdf(String rdf, Class<T> valueType);

}
