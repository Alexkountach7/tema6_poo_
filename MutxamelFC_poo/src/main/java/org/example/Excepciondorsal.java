package org.example;

public class Excepciondorsal extends Exception{
    public Excepciondorsal(){
        super("Error: el dorsal del jugador ya esta asignado");
    }
}
