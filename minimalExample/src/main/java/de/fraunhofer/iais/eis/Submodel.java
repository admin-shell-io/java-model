package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;
import java.util.List;

/**
 * A Submodel defines a specific aspect of the asset represented by the AAS. A
 * submodel is used to structure the virtual representation and technical
 * functionality of an Administration Shell into distinguishable parts. Each
 * submodel refers to a well-defined domain or subject matter. Submodels can
 * become standardized and thus become submodels types. Submodels can have
 * different life-cycles.
 *
 * Describe the different types of Data related to the I4.0 Asset
 *
 * Constraint AASd-062: The semanticId of a Submodel shall only reference a
 * ConceptDescription with the category APPLICATION_CLASS.
 */
public interface Submodel {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * @return Returns the List of SubmodelElement for the property
     * submodelElement.
     */
    public List<SubmodelElement> getSubmodelElements();

    /**
     * A submodel consists of zero or more submodel elements.
     *
     * @param value the List of SubmodelElement for the property
     * submodelElement.
     */
    public void setSubmodelElements(List<SubmodelElement> value);

    public static abstract class AbstractBuilder<T extends Submodel, B extends AbstractBuilder<T, B>> extends ExtendableBuilder<T, B> {

        public B submodelElements(List<SubmodelElement> value) {
            getBuildingInstance().setSubmodelElements(value);
            return getSelf();
        }

        public B submodelElement(SubmodelElement value) {
            getBuildingInstance().getSubmodelElements().add(value);
            return getSelf();
        }

    }
}
