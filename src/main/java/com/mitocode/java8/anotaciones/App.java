package com.mitocode.java8.anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by javalenja on 06-May-20
 */

public class App {

    //API reflection se usará para modificar el comportamiento de las anotaciones.

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes{
        Lenguaje[] value() default {};
    }

    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje{
        String value();
    }

    //JDK 1.7
    /*@Lenguajes({
            @Lenguaje("Java"),
            @Lenguaje("Python")
    })*/

    //JDK 1.8
    @Lenguaje("Java")
    @Lenguaje("Python")
    public  interface LenguajeProgramacion {

    }

    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en Lenguajes");

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for(Lenguaje elemento : len.value()){
            System.out.println(elemento.value());
        }
    }
}
