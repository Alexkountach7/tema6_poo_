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

        for (Dispositivo dispositivo : listadispositivo) {
            dispositivo.encender();
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                // ((controlaremoto) dipositivo).sincronizar();
                ControlRemoto control_ = (ControlRemoto) dispositivo;
                control_.sincronizar();
            }

            dispositivo.mostrarestado();
            dispositivo.apagar();

        }
        Dispositivo proyector = new Dispositivo("optoma") {
            @Override
            public void encender() {
                if (estado) {
                    System.out.println("el proyector ya esta encendido");
                } else {
                    System.out.println("encendiendo proyetor con brillo automatico ");
                    estado = true;
                }
            }

        };
        proyector.encender();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("sincronizar proyector con ");
            }
        };
        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("horno chatgo") {
            @Override
            public void encender() {
                if (estado){
                    System.out.println("el horno ya esta encendido");
                }else {
                    System.out.println("calentando horno con ajuste");
                    estado = true;
                }
            }
        };

        horno_ia.encender();
        listadispositivo.add(proyector);
        listadispositivo.add(horno_ia);
        for (Dispositivo dispositivo : listadispositivo) {
            dispositivo.encender();
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                // ((controlaremoto) dipositivo).sincronizar();
                ControlRemoto control_ = (ControlRemoto) dispositivo;
                proyector_sinc.sincronizar();
            } else if (dispositivo.nombre.equals("optoma")) {
                proyector_sinc.sincronizar();

            }

            dispositivo.mostrarestado();
            dispositivo.apagar();
            dispositivo.apagar();

        }
    }
}
