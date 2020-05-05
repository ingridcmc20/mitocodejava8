package com.mitocode.java8.optional;

import java.util.Optional;

/**
 * Created by javalenja on 04-May-20
 */

public class OptionalApp {
    public void probar(String valor){
        //System.out.println(valor.contains("mito"));

        try {
            Optional op = Optional.empty();
            op.get();
        } catch (Exception e) {
            System.err.println("No hay elemento");
        }

    }

    public void orElse(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        String x = op.orElse("predeterminado");
        System.out.println(x);
    }

    public void orElseThrow(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
    }

    public void isPresent(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());
    }

    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        //app.probar("Mito");
        //app.orElse("Mito");
        //app.orElseThrow("Mito"); //No lanza ningún valor en pantalla ya que sí hay un valor no nulo del parámetro.
        app.isPresent(null);
    }

}
