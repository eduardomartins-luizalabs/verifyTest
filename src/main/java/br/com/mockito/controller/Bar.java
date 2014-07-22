package br.com.mockito.controller;

import br.com.mockito.pojo.Dummy;

/**
 * @author Eduardo Martins (eduardo.martins at luizalabs.com)
 */
public class Bar {

    public void doSomething(Dummy dummy, String argument) {
        String fake = dummy.getName() + dummy.getId() + argument;
    }

}
