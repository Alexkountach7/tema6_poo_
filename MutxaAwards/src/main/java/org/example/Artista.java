package org.example;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{
    private String nombre;
    private ArrayList<Categoria> categorias;
    private ArrayList<Premio> listapremio;

    public Artista(int edicion, String nombre) {
        super(edicion);
        this.nombre= nombre;
        this.categorias= new ArrayList<>();
        this.listapremio = new ArrayList<>();
    }

    public void esNominado(Categoria categoria){

    }

    public void ganarPremio(Premio premio) {

    }

    public void recogerPremio(Premio premio){

    }


    @Override
    public void obtenerDetalles() {

    }

    @Override
    public void setEdicion(int año) {
        super.setEdicion(año);
    }

    @Override
    public int getEdicion() {
        return super.getEdicion();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Premio> getListapremio() {
        return listapremio;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setListapremio(ArrayList<Premio> listapremio) {
        this.listapremio = listapremio;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", categorias=" + categorias +
                ", listapremio=" + listapremio +
                '}';
    }

    @Override
    public void aplaudir() {
        System.out.println("el artista "+getNombre()+ " esta aplaudiendo");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("el artista "+getNombre()+ " esta pasando por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println("El artista da un discurso");
    }

    @Override
    public void celebrarPremio(Premio premio) {

    }


}
