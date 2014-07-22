import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;

public class FooTest {

    // Bar contains a method who receives a 
    // Dummy class like  doSomething(Dummy d, String abc);

    @Test
    public void testFoo() {
        Bar bar = Mockito.mock(Bar.class);
        Foo foo = new Foo(bar);
        foo.doMagic(anyString());
        Mockito.verify(bar).doSomething(isA(Dummy.class), anyString());

//        I tried that too:
//        ArgumentCaptor<Dummy> captor = ArgumentCaptor.forClass(Dummy.class);
//        Mockito.verify(bar).doSomething(captor.capture(), anyString());
    }

}