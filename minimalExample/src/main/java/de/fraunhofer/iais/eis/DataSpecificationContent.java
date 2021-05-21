package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Data Specification Content" "DataSpecificationContent contains the additional attributes to be
 * added to the element instance that references the data specification template and meta
 * information about the template itself."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultDataSpecificationContent.class)
})
public interface DataSpecificationContent extends ModelClass {

    // standard methods

}
