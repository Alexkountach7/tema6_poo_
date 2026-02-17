package org.example;

public abstract class Dispositivo { // dispositivo es una clase abstracta
    protected String nombre;
    protected boolean estado;

    public Dispositivo(String nombre) {
        this.nombre=nombre;
        this.estado = false;



        }
        public abstract void encender(); // metodo abstracto, por lo tanto todas las clases hijas estan
    // obligados a implementarlo
        // todos implementan encender porque es abstracto
        //nadie implementa apagar y mostrar estado porque estan ya en el padre
        public boolean apagar(){ // apagar ya esta en la clase padre entonces las hijas no hace falta implementarlas
            if (estado == false) { // si el estado es igual a falso el dispositivo ya esta apagado
                System.out.println( nombre +"el dispositivo ya esta apagado");
            }else {
                estado = false;
                System.out.println(nombre+ "esta apagado ");
            }
            return estado;
        }

        public  void mostrarestado() {
            if (estado) {
                System.out.println("el dispositivo esta encendido ");
            }else {

                System.out.println("el estado es apagado");
            }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }



    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}

