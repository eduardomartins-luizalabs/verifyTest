import br.com.mockito.controller.Bar;
import br.com.mockito.pojo.Dummy;
import br.com.mockito.rest.FooService;
import org.glassfish.grizzly.http.util.HttpStatus;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;

public class FooServiceTest extends JerseyTest {

    private Bar bar;

    @Before
    public void justToNothing() {
        if(this.bar == null) {
            this.bar = Mockito.mock(Bar.class);
        }
    }

    @Override
    protected Application configure() {
        this.bar = Mockito.mock(Bar.class);
        FooService foo = new FooService(bar);
        ResourceConfig config = new ResourceConfig();
        config.register(foo);
        return config;
    }

    @Test
    public void testFoo() {
        Form form = new Form();
        form.param("name", "eduardo");
        form.param("id", "123");

        Response response = target("/service/dummy").request().post(Entity.form(form));
        ArgumentCaptor<Dummy> captor = ArgumentCaptor.forClass(Dummy.class);
        Mockito.verify(bar).doSomething(isA(Dummy.class), anyString());

        Assert.assertEquals(HttpStatus.OK_200.getStatusCode(), response.getStatus());
        Assert.assertEquals("eduardo", captor.getValue().getName());
    }

}