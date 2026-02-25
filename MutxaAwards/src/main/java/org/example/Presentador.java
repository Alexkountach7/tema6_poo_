package org.example;

public class Presentador extends MutxaAwards implements AccionesAsistentes{
    private String nombre;


    public Presentador(String nombre, int edicion) {
        super(edicion);
        this.nombre = nombre;

    }

    public void presentar(){

    }
    public void entregarPremio(Premio premio){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void obtenerDetalles() {
        System.out.print("el presentador saldra a las 19:00 con su compañera");
    }

    @Override
    public String toString() {
        return "Presentador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void aplaudir() {

    }

    @Override
    public void alfombraRoja() {

    }

    @Override
    public void darDiscurso(String tematica) {

    }

    @Override
    public void celebrarPremio(Premio premio) {

    }

}
