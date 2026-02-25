package org.example;

import java.awt.*;

public class Premio extends MutxaAwards{
    private Categoria categoria;
    private Artista ganador;

    public Premio(int edicion, Categoria categoria) {
        super(edicion);
        this.categoria =categoria;
        this.ganador= null;

    }

    @Override
    public void obtenerDetalles() {
        System.out.println("trofeo precioso");
    }

    @Override
    public int getEdicion() {
        return super.getEdicion();
    }

    @Override
    public void setEdicion(int año) {
        super.setEdicion(año);
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Artista getGanador() {
        return ganador;
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return "Premio{" +
                "categoria=" + categoria +
                ", ganador=" + ganador +
                '}';
    }
}
