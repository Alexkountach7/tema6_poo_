package org.example;

import java.util.ArrayList;

public class Encargado extends Persona{
    private ArrayList<Camarero> listacamareros;
    private double salario;
    public Encargado(String nombre, String dni, double salario) {
        super(nombre, dni);
        this.salario = salario;
        this.listacamareros = new ArrayList<>();

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void accederalbaño() {
        System.out.println("el encargado se va al baño");
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void mostrarinformacionpersonal() {
        super.mostrarinformacionpersonal();
        System.out.println("encargado con salario" +salario);
        System.out.println("camareros a cargo: ");
        for (Camarero camarero : listacamareros) {
            System.out.println(camarero.getNombre());
        }
    }



}
