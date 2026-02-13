package org.example;

import java.util.Random;

public class Bizum extends MetodoPago{
    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = pin;
    }

    public Boolean validarPaypal (String telefono, int pin){
        Random aleatorio = new Random();
        for (int i =0; i<6; i++){
            int numero_pin = aleatorio.nextInt();
            System.out.println(numero_pin);
        }
        if (telefono.length() != 9){
            return false;
        }
        for (int i =0; i<telefono.length(); i++){
            char digitos = telefono.charAt(i);
            if (!Character.isDigit(digitos)){
                return false;
            }
        }
        return true;
    }


    @Override
    public void procesarPago(Double importe) {
        System.out.println("Procesando pago de " +importe+ " € con Bizum");
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}
