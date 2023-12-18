package org.example;

import java.util.List;

public class GenericMethods {


    public static <T> void printGenericMethods(List<?> llista){
        llista.forEach(System.out::println);
    }

}
