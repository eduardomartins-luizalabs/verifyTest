/**
 * @author Eduardo Martins (eduardo.martins at luizalabs.com)
 */
public class Foo {

    private final Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public Foo() {
        this.bar = new Bar();
    }

    public void doMagic(String anyParameter) {
        Dummy dummy = new Dummy(1,"Dummy");
        bar.doSomething(dummy, "abc");
    }

}
