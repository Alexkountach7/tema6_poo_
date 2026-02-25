package org.example;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int añosexperiencia;

    public Masajista(String titulacion, int añosexperiencia, String nombre, int edad) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosexperiencia = añosexperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("el masajista");
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", añosexperiencia=" + añosexperiencia +
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
