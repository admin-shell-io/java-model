package de.fraunhofer.iais.eis;

import java.util.Map;

public interface Builder<T> {

    T build();

    Map<String, Object> getValueMap();

}
