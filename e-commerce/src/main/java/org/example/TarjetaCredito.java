package org.example;

public class TarjetaCredito extends MetodoPago {
    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta, String tipo){
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;

    }

    public Boolean validartarjeta(String nro_tarjeta, String tipo) {
        if (nro_tarjeta.length() != 16) {
            return false;

        }
        if (!tipo.equalsIgnoreCase("VISA") && !tipo.equalsIgnoreCase("MASTERCARD") && !tipo.equalsIgnoreCase("MAESTRO")){
            return false;
        }

        return true;

    }



    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void procesarPago(Double importe) {
        System.out.println("Procesando pago de "+importe+" € con tarjeta de credito visa");
    }
}
