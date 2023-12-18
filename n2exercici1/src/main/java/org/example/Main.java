package org.example;

public class Main {
    public static void main(String[] args) {
        GenericMethods gM = new GenericMethods();
        gM.printGenericMethods(new Persona("Joan", "Caballero", 24), 76, "Java");
        gM.printGenericMethods(new Persona("Joan", "Caballero", 24), "Firulais", 34.7F);
    }
}