package org.example;

public abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio ) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarinfo(){
        System.out.println("plan:" +nombrePlan);
        System.out.println("Precio: "+precio);
    }



    public abstract void obtenerBeneficios();

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }

    public abstract void obtenerPeriodoPrueba();
    }



