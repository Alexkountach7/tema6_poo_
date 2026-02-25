package org.example;

public class Excepcionpremio extends Exception{
    public Excepcionpremio(){
        super("El actor no puede recoger un premio no otorgado");
    }
}
