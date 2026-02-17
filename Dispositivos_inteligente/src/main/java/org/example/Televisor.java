package org.example;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {  // metodo abstracto
        if (isEstado()){ // se puede hacer con super si lo tengo protegido
            System.out.println("la television ya esta encendida");
        }else {
            setEstado(true); // con setestado se cambia el estado de false a true
            System.out.println("Encendiendo televisor");
        }

    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
