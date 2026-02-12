package org.example;

import java.util.ArrayList;

public class Camarero extends Persona {

    private double salario;
    private ArrayList<Integer> listamesas;
    public Camarero(String nombre, String dni, double salario) {
        super(nombre, dni);
        this.salario = salario;
        listamesas = new ArrayList<>();


    }

    @Override
    public void mostrarinformacionpersonal() {
        super.mostrarinformacionpersonal();
        System.out.println("salario "+salario);
        System.out.println("numero de mesas "+listamesas);
    }

    public static void entraralbar (Encargado encargado) {
        System.out.println("holaaaa");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDni() {
        return super.getDni();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setListamesas(ArrayList<Integer> listamesas) {
        this.listamesas = listamesas;
    }


    @Override
    public void accederalbaño() {
        System.out.println("el camarero va al baño");
    }

    public String getNombre() {
        return super.getNombre();
    }


    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public String toString() {
        return "Camarero{" +
                "salario=" + salario +
                ", listamesas=" + listamesas +
                '}';
    }
}
