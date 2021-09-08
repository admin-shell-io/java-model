/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class EmbeddedDataSpecificationBuilder<T extends EmbeddedDataSpecification, B extends EmbeddedDataSpecificationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataSpecification
     * 
     * @param dataSpecification desired value to be set
     * @return Builder object with new value for dataSpecification
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().setDataSpecification(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecificationContent
     * 
     * @param dataSpecificationContent desired value to be set
     * @return Builder object with new value for dataSpecificationContent
     */
    public B dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        getBuildingInstance().setDataSpecificationContent(dataSpecificationContent);
        return getSelf();
    }
}
