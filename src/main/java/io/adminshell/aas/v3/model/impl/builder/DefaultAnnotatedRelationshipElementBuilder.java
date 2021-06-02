package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultAnnotatedRelationshipElementBuilder extends AbstractBuilder<DefaultAnnotatedRelationshipElement> {

    public DefaultAnnotatedRelationshipElementBuilder() {
        super();
    }

    public DefaultAnnotatedRelationshipElementBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for annotations
     * 
     * @param annotations desired value to be set
     * @return Builder object with new value for annotations
     */
    public DefaultAnnotatedRelationshipElementBuilder annotations(List<Reference> annotations) {
        this.map.put("annotations", annotations);
        return this;
    }

    /**
     * This function allows setting a value for first
     * 
     * @param first desired value to be set
     * @return Builder object with new value for first
     */
    public DefaultAnnotatedRelationshipElementBuilder first(Reference first) {
        this.map.put("first", first);
        return this;
    }

    /**
     * This function allows setting a value for second
     * 
     * @param second desired value to be set
     * @return Builder object with new value for second
     */
    public DefaultAnnotatedRelationshipElementBuilder second(Reference second) {
        this.map.put("second", second);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultAnnotatedRelationshipElementBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultAnnotatedRelationshipElementBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultAnnotatedRelationshipElementBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultAnnotatedRelationshipElementBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public DefaultAnnotatedRelationshipElementBuilder qualifiers(List<Constraint> qualifiers) {
        this.map.put("qualifiers", qualifiers);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultAnnotatedRelationshipElementBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public DefaultAnnotatedRelationshipElementBuilder kind(ModelingKind kind) {
        this.map.put("kind", kind);
        return this;
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public DefaultAnnotatedRelationshipElementBuilder semanticId(Reference semanticId) {
        this.map.put("semanticId", semanticId);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAnnotatedRelationshipElement build() {
        DefaultAnnotatedRelationshipElement defaultAnnotatedRelationshipElement =
            Util.fillInstanceFromMap(new DefaultAnnotatedRelationshipElement(), this.map);
        return defaultAnnotatedRelationshipElement;
    }
}
