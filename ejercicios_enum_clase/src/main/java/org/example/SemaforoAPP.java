package org.example;

public class SemaforoAPP {
    static void main() {

        Semaforo inicio = Semaforo.Amarillo;

        for (int i=0; i<10; i++){
            inicio = Semaforo.siguiente(inicio);
            System.out.println(inicio);
        }

    }
}
