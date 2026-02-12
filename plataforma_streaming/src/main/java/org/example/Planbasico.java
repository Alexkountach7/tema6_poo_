package org.example;

public class Planbasico extends Suscripcion{
    public Planbasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }



    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todos el contenido en calidad estandar");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("30 dias de prueba gratuita");
    }
}
