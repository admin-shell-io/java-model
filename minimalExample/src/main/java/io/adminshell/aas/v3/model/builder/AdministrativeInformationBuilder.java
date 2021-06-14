package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AdministrativeInformationBuilder<T extends AdministrativeInformation, B extends AdministrativeInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for versions
     * 
     * @param versions desired value to be set
     * @return Builder object with new value for versions
     */
    public B versions(List<String> versions) {
        getBuildingInstance().setVersions(versions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List versions
     * 
     * @param version desired value to be added
     * @return Builder object with new value for versions
     */
    public B version(String version) {
        getBuildingInstance().getVersions().add(version);
        return getSelf();
    }

    /**
     * This function allows setting a value for revisions
     * 
     * @param revisions desired value to be set
     * @return Builder object with new value for revisions
     */
    public B revisions(List<String> revisions) {
        getBuildingInstance().setRevisions(revisions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List revisions
     * 
     * @param revision desired value to be added
     * @return Builder object with new value for revisions
     */
    public B revision(String revision) {
        getBuildingInstance().getRevisions().add(revision);
        return getSelf();
    }
}
