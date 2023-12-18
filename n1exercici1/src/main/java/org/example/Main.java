package org.example;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods nGM = new NoGenericMethods(new Persona("Joan", "Caballero", 24), new Persona("Oscar", "Osbiju", 33), new Persona("Paulo", "Shalaka", 32));
        NoGenericMethods nGM2 = new NoGenericMethods( new Persona("Oscar", "Osbiju", 33), new Persona("Paulo", "Shalaka", 32), new Persona("Joan", "Caballero", 24));

    }
}