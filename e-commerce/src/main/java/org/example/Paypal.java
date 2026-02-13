package org.example;

public class Paypal extends MetodoPago{
    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {
        this.cuenta= cuenta;
        this.saldo = 23;

    }

    public boolean validarPaypal(String cuenta){
        if (!cuenta.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.es$")){
            return false;

        }
        return true;

    }






    @Override
    public void procesarPago(Double importe) {
        System.out.println("Procesando pago de "+importe +"con paypal");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
