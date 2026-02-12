package org.example;

public class Planfamiliar extends Suscripcion{
    public Planfamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultaneamente en alta definicion");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("7 dias de prueba para cuentas nuevas");
    }
}
