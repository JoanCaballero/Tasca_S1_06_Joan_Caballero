package org.example;

public class GenericMethods {


    public static <T> void printGenericMethods(Persona p1, T t2, T t3){
        System.out.println(p1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
