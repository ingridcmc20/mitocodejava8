package com.mitocode.java8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by javalenja on 04-May-20
 */

public class AppMap {

    private Map<Integer, String> map;

    public void poblar(){
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "Code");
        map.put(3, "Learn");
    }

    public void imprimir_v7(){
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public void imprimir_v8(){
        //map.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void recolectar(){
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("o"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        mapaRecolectado.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }

    public void insertarSiAusente(){
        map.putIfAbsent(4, "Jorge"); //agrega un elemento si esta llave no existe.
    }

    public void operarSiPresente() {
        map.computeIfPresent(3, (k, v) -> k + v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado(){
        String valor = map.getOrDefault(5, "Valor por defecto");// si se le pasa un key que exista, devuelve su valor actual en el mapa.
        System.out.println(valor);
    }

    public static void main(String[] args) {
        AppMap appMap = new AppMap();
        appMap.poblar();
        //appMap.imprimir_v7();
        //appMap.insertarSiAusente();
        //appMap.imprimir_v8();
        //appMap.operarSiPresente();
        //appMap.obtenerOrPredeterminado();
        appMap.recolectar();
    }
}
