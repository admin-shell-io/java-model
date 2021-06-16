package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A basic event.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBasicEvent.class)
})
public interface BasicEvent extends Event {

    /**
     * Reference to the data or other elements that are being observed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed
     *
     * @return Returns the Reference for the property observed.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed")
    public Reference getObserved();

    /**
     * Reference to the data or other elements that are being observed.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/BasicEvent/observed
     *
     * @param observed desired value for the property observed.
     */
    public void setObserved(Reference observed);

}
