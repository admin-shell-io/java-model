package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.Map;

import de.fraunhofer.iais.eis.util.*;

public abstract class AbstractBuilder<T> implements Builder<T> {

    protected final Map<String, Object> map;

    protected AbstractBuilder() {
        this.map = new HashMap<>();
    }

    public AbstractBuilder(Builder<? extends ModelClass> builder) {
        this();
        for (Map.Entry<String, Object> entry : builder.getValueMap().entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    public Map<String, Object> getValueMap() {
        return map;
    }

    public abstract T build();

}
