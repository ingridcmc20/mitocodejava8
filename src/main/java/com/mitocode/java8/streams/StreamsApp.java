package com.mitocode.java8.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javalenja on 04-May-20
 */

public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("Jorge");
        lista.add("MitoCode");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar(){
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x, y) -> y.compareToIgnoreCase(x)).forEach(System.out::println);
    }

    public void transformar(){
        //map se utiliza para transformar el contenido del stream; o sea, la lista.
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);

        //transformando una lista de #s String a números enteros Integer.
        //Sin usar streams
        /*for (String x : numeros){
            int num = Integer.parseInt(x) + 1;
            System.out.println(num);
        }*/
        //usando streams
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {

        StreamsApp app = new StreamsApp();
        //app.filtrar();
        //app.ordenar();
        //app.transformar();
        //app.limitar();
        app.contar();
    }
}
