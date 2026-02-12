package org.example;

import java.util.ArrayList;

public class Influencer extends Usuario {
    private ArrayList<String> listacolaboradores;


    public Influencer(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.listacolaboradores = new ArrayList<>();

    }

    public ArrayList<String> getListacolaboradores() {
        return listacolaboradores;
    }

    public void informacioninfluencer() {
        super.informacionusuaria();
        System.out.println("la lista de los colaboradores son : "+listacolaboradores);
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "listacolaboradores=" + listacolaboradores +
                '}';
    }
}
