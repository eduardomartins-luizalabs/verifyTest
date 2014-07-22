package br.com.mockito.container;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Eduardo Martins (eduardo.martins at luizalabs.com)
 */
public class VerifyContainer extends ResourceConfig {

    public VerifyContainer() {
        packages("br.com.mockito.rest");
    }
}
