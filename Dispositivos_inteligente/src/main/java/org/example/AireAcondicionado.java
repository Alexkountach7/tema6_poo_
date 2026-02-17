package org.example;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (isEstado()){
            System.out.println("el aire acondicionado esta encendido");
        }else{
            setEstado(true);
            System.out.println("encendiendo aire acondicionado");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizar el aire acondicionado ");
    }


}
