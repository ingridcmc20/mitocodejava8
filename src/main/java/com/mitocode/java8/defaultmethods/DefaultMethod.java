package com.mitocode.java8.defaultmethods;

/**
 * Created by javalenja on 03-May-20
 */

public class DefaultMethod implements PersonaA, PersonaB {

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        //app.caminar();
        app.hablar();
    }

    @Override
    public void caminar() {
        System.out.println("Hola Coders");
    }

    @Override
    public void hablar() {
        //PersonaA.super.hablar();
        //PersonaB.super.hablar();
        System.out.println("Suscríbanse Coders");
    }
}
