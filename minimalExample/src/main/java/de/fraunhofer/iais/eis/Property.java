package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.TypedLiteral;

/**
 * A property is a data element that has a single value.
 *
 * Constraint AASd-052a: If the semanticId of a Property references a
 * ConceptDescription then the ConceptDescription/category shall be one of
 * following values: VALUE, PROPERTY.
 *
 * Constraint AASd-065: If the semanticId of a Property or MultiLanguageProperty
 * references a ConceptDescription with the category VALUE then the value of the
 * property is identical to DataSpecificationIEC61360/value and the valueId of
 * the property is identical to DataSpecificationIEC61360/valueId.
 *
 * Constraint AASd-066: If the semanticId of a Property or MultiLanguageProperty
 * references a ConceptDescription with the category PROPERTY and
 * DataSpecificationIEC61360/valueList is defined the value and valueId of the
 * property is identical to one of the value reference pair types references in
 * the value list, i.e. ValueReferencePairType/value or
 * ValueReferencePairType/valueId, resp.
 */
public interface Property extends DataElement {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * The value of the property instance.
     *
     * @return Returns the TypedLiteral for the property value.
     */
    public TypedLiteral getValue();

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then
     * the value needs to be identical to the value of the referenced coded
     * value in valueId.
     *
     * @return Returns the Reference for the property valueId.
     */
    public Reference getValueId();

}
