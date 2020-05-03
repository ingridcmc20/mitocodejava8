package com.mitocode.java8.defaultmethods;

public interface PersonaB {

    default public void hablar(){
        System.out.println("Saludos coders - Persona B");
    }
}
