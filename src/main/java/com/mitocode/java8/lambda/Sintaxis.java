package com.mitocode.java8.lambda;

/**
 * Created by javalenja on 02-May-20
 */

public class Sintaxis {
    public double probarSintaxis(){

        //Operacion operacion = (double x, double y) -> (x + y)/2;
        //Operacion operacion = (double x, double y) -> {return (x + y)/2;};
        /*Operacion operacion = (x, y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x + y)/2 + a;
        };*/
        Operacion operacion = (x, y) -> (x + y) / 2;
        //Operacion operacion = () -> 2; //produce error con la definición de la interfaz Operacion.
        /*Operacion operacion = () -> {
            int x = 2;
            int y = 3;
            return x + y;
        };*/

        return operacion.calcular(2, 3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.probarSintaxis());
    }
}