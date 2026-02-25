package org.example;

public abstract class MutxaAwards {
    private int edicion;


    public MutxaAwards(int edicion) {
        this.edicion = edicion;
    }

    public abstract void obtenerDetalles();


    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "MutxaAwards{" +
                "Edicion= " +edicion  +
                '}';
    }
}
