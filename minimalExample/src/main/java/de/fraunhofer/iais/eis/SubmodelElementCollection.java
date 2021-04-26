package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;
import java.util.List;

/**
 * A submodel element collection is a set or list of submodel elements.
 *
 * Constraint AASd-059: If the semanticId of a SubmodelElementCollection
 * references a ConceptDescription then the category of the ConceptDescription
 * shall be COLLECTION or ENTITY.
 *
 * Constraint AASd-092: If the semanticId of a SubmodelElementCollection with
 * SubmodelElementCollection/allowDuplicates == false references a
 * ConceptDescription then the ConceptDescription/category shall be ENTITY.
 *
 * Constraint AASd-093: If the semanticId of a SubmodelElementCollection with
 * SubmodelElementCollection/allowDuplicates == true references a
 * ConceptDescription then the ConceptDescription/category shall be COLLECTION.
 */
public interface SubmodelElementCollection extends SubmodelElement {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * If allowDuplicates=true then it is allowed that the collection contains
     * the same element several times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed
     * that the collection contains several elements with the same semantics
     * (i.e. the same semanticId).
     *
     * @return Returns the List of Boolean for the property allowDuplicates.
     */
    public List<Boolean> getAllowDuplicates();

    /**
     * If allowDuplicates=true then it is allowed that the collection contains
     * the same element several times. Default = false
     *
     * Constraint AASd-026: If allowDuplicates==false then it is not allowed
     * that the collection contains several elements with the same semantics
     * (i.e. the same semanticId).
     *
     * @param value the List of Boolean for the property allowDuplicates.
     */
    public void setAllowDuplicates(List<Boolean> value);

    /**
     * If ordered=false then the elements in the property collection are not
     * ordered. If ordered=true then the elements in the collection are ordered.
     * Default = false
     *
     * @return Returns the List of Boolean for the property ordered.
     */
    public List<Boolean> getOrdered();

    /**
     * If ordered=false then the elements in the property collection are not
     * ordered. If ordered=true then the elements in the collection are ordered.
     * Default = false
     *
     * @param value the List of Boolean for the property ordered.
     */
    public void setOrdered(List<Boolean> value);

    /**
     * Submodel element contained in the collection.
     *
     * @return Returns the List of SubmodelElement for the property value.
     */
    public List<SubmodelElement> getValues();

    /**
     * Submodel element contained in the collection.
     *
     * @para vlaue the List of SubmodelElement for the property value.
     */
    public void setValues(List<SubmodelElement> value);

    public static abstract class AbstractBuilder<T extends SubmodelElementCollection, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B allowDuplicates(List<Boolean> value) {
            getBuildingInstance().setAllowDuplicates(value);
            return getSelf();
        }

        public B allowDuplicate(Boolean value) {
            getBuildingInstance().getAllowDuplicates().add(value);
            return getSelf();
        }

        public B ordered(List<Boolean> value) {
            getBuildingInstance().setOrdered(value);
            return getSelf();
        }

        public B ordered(Boolean value) {
            getBuildingInstance().getOrdered().add(value);
            return getSelf();
        }

        public B values(List<SubmodelElement> value) {
            getBuildingInstance().setValues(value);
            return getSelf();
        }

        public B value(SubmodelElement value) {
            getBuildingInstance().getValues().add(value);
            return getSelf();
        }

    }

}
