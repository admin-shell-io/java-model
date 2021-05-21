package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class AdministrativeInformationBuilder {

    private Map<String, Object> map;

    public AdministrativeInformationBuilder() {
        this.map = new HashMap<>();
    }

    public AdministrativeInformationBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for versions
     * 
     * @param versions desired value to be set
     * @return Builder object with new value for versions
     */
    public AdministrativeInformationBuilder versions(List<String> versions) {
        this.map.put("versions", versions);
        return this;
    }

    /**
     * This function allows setting a value for revisions
     * 
     * @param revisions desired value to be set
     * @return Builder object with new value for revisions
     */
    public AdministrativeInformationBuilder revisions(List<String> revisions) {
        this.map.put("revisions", revisions);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public AdministrativeInformation build() throws ConstraintViolationException {
        DefaultAdministrativeInformation defaultAdministrativeInformation =
            Util.fillInstanceFromMap(new DefaultAdministrativeInformation(), this.map);
        return defaultAdministrativeInformation;
    }
}
