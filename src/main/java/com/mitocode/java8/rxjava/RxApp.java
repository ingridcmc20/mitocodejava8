package com.mitocode.java8.rxjava;

import rx.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javalenja on 10-May-20
 */

public class RxApp {

    private List<Integer> lista1;
    private List<Integer> lista2;

    public RxApp(){
        lista1 = new ArrayList<Integer>();
        lista2 = new ArrayList<Integer>();
        this.llenarListas();
    }

    private void llenarListas() {
        for (int i = 0; i < 10; i ++) {
            lista1.add(i);
            lista2.add(i);
        }
    }

    public void buscar(){
        Observable<Integer> obs1 = Observable.from(lista1);
        Observable<Integer> obs2 = Observable.from(lista2);

        //merge permite unir 2 Observable en 1 único Observable.
        //si no se hace así, tocaría recorrer cada lista secuencialmente
        /*Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer numero) {
                if (numero == 1) {
                    System.out.println(numero);
                }
            }
        });*/

        Observable.merge(obs1, obs2).filter(x -> x == 1).subscribe(System.out::println);
    }

    public static void main(String[] args) {
        /*List<String> lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("MitoCode");

        Observable<String> obs = Observable.from(lista);
        obs.subscribe(new Action1<String>() {
            @Override
            public void call(String elemento) {
                System.out.println(elemento);
            }
        });*/

        RxApp app = new RxApp();
        app.buscar();
    }

}
