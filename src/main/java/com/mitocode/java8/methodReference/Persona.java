package com.mitocode.java8.methodReference;

/**
 * Created by javalenja on 03-May-20
 */

public class Persona{

    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
