package br.com.mockito.pojo;

/**
 * @author Eduardo Martins (eduardo.martins at luizalabs.com)
 */
public class Dummy {

    private String id;
    private String name;

    public Dummy(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dummy() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
