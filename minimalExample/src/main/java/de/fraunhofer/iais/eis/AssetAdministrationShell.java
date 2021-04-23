package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.builder.ExtendableBuilder;

import java.util.List;

/**
 * Asset Administration Shell Describes the Administration Shell for Assets,
 * Products, Components, e.g. Machines
 */
public interface AssetAdministrationShell {

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin
     * Shell of a given Asset
     *
     * @return Returns the List of Submodel for the property submodel.
     */
    public List<Submodel> getSubmodels();

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin
     * Shell of a given Asset
     *
     * @param value The List of Submodel for the property submodel.
     */
    public void setSubmodels(List<Submodel> value);


}
