package com.mitocode.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by javalenja on 02-May-20
 */

public class LambdaApp {
    public static void main(String[] args) {

        LambdaApp lambdaApp = new LambdaApp();
        //lambdaApp.ordenar();
        lambdaApp.calcular();
    }

    public void ordenar(){
        List<String> lista = new ArrayList<String>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");

        //JDK < 1.7
        /*Collections.sort(lista, new Comparator<String>(){

            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for(String elemento : lista){
            System.out.println(elemento);
        }
    }

    public void calcular(){

        //JDK < 1.7
        /*Operacion operacion = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1 + n2)/2;
            }
        };
        System.out.println(operacion.calcularPromedio(2, 3));*/

        Operacion operacion = (double x, double y) -> (x + y)/2;
        System.out.println(operacion.calcular(2, 3));
    }
}
