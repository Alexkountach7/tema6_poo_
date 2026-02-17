package org.example;

import java.util.ArrayList;

import static java.awt.SystemColor.control;

public class DispositivosApp {
    static void main() {
        ArrayList<Dispositivo> listadispositivo = new ArrayList<>();
        Dispositivo dispositivo1 = new AireAcondicionado("AireAcondicionado");
        Dispositivo dispositivo2 = new Televisor("Televisor");
        Dispositivo dispositivo3 = new ParlanteInteligente("Parlante");
        listadispositivo.add(dispositivo1);
        listadispositivo.add(dispositivo2);
        listadispositivo.add(dispositivo3);
        for (Dispositivo dispositivo : listadispositivo){
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ControlRemoto control_ = (ControlRemoto) dispositivo;
                control_.sincronizar();
            }

            dispositivo.mostrarestado();
            dispositivo.apagar();

        }

    }

}
