package org.example;

public class Planpremium extends Suscripcion{
    public Planpremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estandar");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("14 dias de prueba gratuta");
    }
}
