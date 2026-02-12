package org.example;

import java.util.ArrayList;

public class Cliente extends Persona{
    private int mesa;
    private int n_comensales;
    public Cliente(String nombre, String dni, int n_comensales, int mesa) {
        super(nombre, dni);
        this.mesa = mesa;
        this.n_comensales = n_comensales;

    }

    public void mostrarinfocliente () {
        super.mostrarinformacionpersonal();
        System.out.println("el numero de comentaseles "+n_comensales);
        System.out.println("la mesa se llama "+mesa);
    }

    public void echarbronca() {
        System.out.println("sirve mas rapidoooo");
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getN_comensales() {
        return n_comensales;
    }

    public void setN_comensales(int n_comensales) {
        this.n_comensales = n_comensales;
    }

    @Override
    public void accederalbaño() {
        System.out.println("el cliente va al baño, pide las llaves");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mesa='" + mesa + '\'' +
                ", n_comensales=" + n_comensales +
                '}';
    }
}
