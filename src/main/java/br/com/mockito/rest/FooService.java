package br.com.mockito.rest;

import br.com.mockito.controller.Bar;
import br.com.mockito.pojo.Dummy;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Eduardo Martins (eduardo.martins at luizalabs.com)
 */
@Path("/service")
public class FooService {

    private final Bar bar;

    public FooService(Bar bar) {
        this.bar = bar;
    }

    public FooService() {
        this.bar = new Bar();
    }

    @POST
    @Path("/dummy")
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleProductInteractions(@FormParam("name") String name, @FormParam("id") String id)  {
        Dummy dummy = new Dummy(id, name);
        bar.doSomething(dummy, "service");

        return Response.ok().build();
    }

}
