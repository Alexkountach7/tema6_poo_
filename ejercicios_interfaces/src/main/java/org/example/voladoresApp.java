package org.example;

import java.util.ArrayList;

public class voladoresApp {
    static void main() {
        Superman clark_kent = new Superman();
        Avion boing = new Avion();

        clark_kent.volar();
        boing.volar();


        ArrayList<Superheroe> listaheroes = new ArrayList<>();
        listaheroes.add(clark_kent);
        listaheroes.add(new Spiderman());

        for (Superheroe superheroe : listaheroes){
            if (superheroe instanceof Superman){
                ((Superman) superheroe).volar();
            }
        }
    }
}
