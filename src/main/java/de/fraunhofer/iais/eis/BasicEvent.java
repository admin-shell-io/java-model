package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Basic Event" "A basic event."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEvent.class)
})
public interface BasicEvent extends ModelClass, Event {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Reference to the data or other elements that are being observed."@en
     * 
     * @return Returns the Reference for the property observed. More information under
     *         https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed")
    public Reference getObserved();

}
