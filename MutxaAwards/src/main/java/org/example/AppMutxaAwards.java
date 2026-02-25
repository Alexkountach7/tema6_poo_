package org.example;

import java.util.ArrayList;

public class AppMutxaAwards {
    static void main() {
        ArrayList<AccionesAsistentes> asistentes = new ArrayList<>();
        ArrayList<Presentador>listapresentador = new ArrayList<>();
        ArrayList<Artista> lista_artist = new ArrayList<>();
        Presentador presentador1 = new Presentador("alex", 2025);
        System.out.println("el presentador "+presentador1.getNombre()+" en la " +presentador1.getEdicion()+" edicion");
        presentador1.obtenerDetalles();
        Artista artista1 = new Artista(2025,"britney");
        Artista artista2 = new Artista(2025,"drdree");
        Artista artista3 = new Artista(2025,"cyprehills");
        Artista artista4 = new Artista(2025, "wutang");
        Artista artista5 = new Artista(2025,"alice in chains");

        asistentes.add(presentador1);
        asistentes.add(artista1);
        asistentes.add(artista2);
        asistentes.add(artista3);
        asistentes.add(artista4);
        asistentes.add(artista5);

        for (AccionesAsistentes acciones : asistentes){
            acciones.alfombraRoja();

        }

        for (AccionesAsistentes acciones : asistentes){
            acciones.aplaudir();
        }

        presentador1.presentar();
        presentador1.darDiscurso("dana");
        Premio premio1 = new Premio(2025,Categoria.mejor_actor);

        lista_artist.add(artista1);
        lista_artist.add(artista2);
        lista_artist.add(artista3);
        lista_artist.add(artista4);

        for (Artista artistas : lista_artist){
            artistas.esNominado(Categoria.mejor_actor);
        }
        artista1.ganarPremio(premio1);
        premio1.setGanador(artista1);



    }

}
