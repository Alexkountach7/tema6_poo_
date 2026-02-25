package org.example;

public enum Semaforo {
    Amarillo,
    Rojo,
    Verde;

    public static Semaforo siguiente(Semaforo actual){ //los metodos en enum son siempre static tambien los atributos
        switch (actual) {
            case Amarillo:
                return Rojo;

            case Rojo:
                return Verde;

            case Verde:
                return Amarillo;

            default:
                return Amarillo;
        }
    }
}
