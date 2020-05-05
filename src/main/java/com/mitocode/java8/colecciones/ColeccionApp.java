package com.mitocode.java8.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javalenja on 04-May-20
 */

public class ColeccionApp {

    private List<String> lista;

    public void llenarLista(){
        lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");
    }

    public void usarForEach(){

        /*for(String elemento : lista){
            System.out.println(elemento);
        }*/

        //lista.forEach(x -> System.out.println(x));

        lista.forEach(System.out::println);
    }

    public void usarRemoveIf(){

        /*for (String elemento : lista) {
            if(elemento.equalsIgnoreCase("Code")){
                lista.remove(elemento); //no se puede remover un elemento en un ciclo porque arroja error de concurrencia
            }
        }*/

        //El problema del punto anterior se resuelve implementando un Iterator.

        /*Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase("Code")){
                it.remove();
            }
        }*/

        lista.removeIf(x -> x.equalsIgnoreCase("Code"));
    }

    public void usarSort(){
        //Collections.sort(lista);
        lista.sort((x, y) -> x.compareToIgnoreCase(y));
    }

    public static void main(String... mitocode) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }
}
