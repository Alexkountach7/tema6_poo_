package org.example;

public class ParlanteInteligente extends Dispositivo {

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (isEstado()) {
            System.out.println("el parlante ya esta encendido ");
        } else {
            setEstado(true);
            System.out.println("El parlante se esta encendiendo por comando de voz ");
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
