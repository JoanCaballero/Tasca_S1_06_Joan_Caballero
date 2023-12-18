package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericMethods gM = new GenericMethods();
        List<Object> llista = new ArrayList<>();
        llista.add(34.6F);
        llista.add("Hola");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        llista.add(array);
        llista.add(new Persona("Joan", "Caballero", 24));
        llista.add('c');
        gM.printGenericMethods(llista);
    }
}