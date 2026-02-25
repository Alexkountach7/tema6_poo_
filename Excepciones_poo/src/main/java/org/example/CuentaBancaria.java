package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo_inicial) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo_inicial;
        }
    }

    public void ingresardinero(double cantidad) throws DepositoMaximoException{
        if (cantidad <= 0) {
            throw new IllegalArgumentException("la cantidad debe ser mayor de 0");
        }
        if (cantidad>=3000){
            throw new IllegalArgumentException("La cantidad no puede ser superior");
        }
        saldo =+cantidad;
    }


    public void retirardinero(double cantidad)
        throws Saldoinsuficiente {

            if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
            }
            if (cantidad>3000) {
                throw new IllegalArgumentException("La cantidad no puede ser superior a 3000");
            }
            saldo =+ cantidad;
        }


    public double consultarsaldo() {
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
