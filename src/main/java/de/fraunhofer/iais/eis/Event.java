package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Event" "An event."@en "Constraint AASd-061: The semanticId of a Event submodel element shall
 * only reference a ConceptDescription with the category EVENT."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEvent.class),
    @KnownSubtypes.Type(value = BasicEvent.class)
})
public interface Event extends ModelClass, SubmodelElement {

    // standard methods

}
