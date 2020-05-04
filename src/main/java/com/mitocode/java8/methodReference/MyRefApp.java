package com.mitocode.java8.methodReference;

import java.util.Arrays;

/**
 * Created by javalenja on 03-May-20
 */

public class MyRefApp {

    public static void main(String[] args) {
        MyRefApp app = new MyRefApp();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArbitrario();
        //Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
        //op.saludar();
        app.referenciarConstructor();
    }

    public void operar(){
        /*Operacion op = () -> MyRefApp.referenciarMetodoStatic();
        op.saludar();*/

        Operacion op2 = MyRefApp::referenciarMetodoStatic;
        op2.saludar();
    }

    private static void referenciarMetodoStatic() {
        System.out.println("Método referido static");
    }

    private void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Mito", "Code", "Jorge"};

        //JDK < 1.7
        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        /*Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(nombres));*/

        //usando method references
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    private void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Método referido instancia de un objeto en particular");
    }

    private void referenciarConstructor() {

        //Usando clase anónima JDK < 1.7
        /*IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        iper.crear(1, "MitoCode");*/

        //Usando expresiones lambda
        /*IPersona iper2 = (x, y) -> new Persona(x, y);
        Persona per = iper2.crear(1, "MitoCode");
        System.out.println(per.toString());*/

        //usando referencias a métodos
        IPersona iper3 = Persona::new;
        Persona per = iper3.crear(1, "MitoCode");
        System.out.println(per.toString());
    }
}
