package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> llista = new ArrayList<>();
        llista.add(34.6F);
        llista.add("Hola");
        llista.add(new Persona("Joan", "Caballero", 24));
        llista.add('c');
        GenericMethods.printGenericMethods(llista);
    }
}