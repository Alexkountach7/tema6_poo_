package org.example;

public class Acompañante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;
    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this. integrante= integrante;
    }

    public void animarEquipo(){
        System.out.println("el acompañante anima");
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    public String getParentesco() {
        return parentesco;
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrargol() {

    }
}
