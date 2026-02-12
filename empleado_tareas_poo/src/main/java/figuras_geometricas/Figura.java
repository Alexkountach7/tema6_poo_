package figuras_geometricas;

public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;

    }
    public void mostrarInfo() {
        System.out.println("Figura: "+nombre);
    }

    public abstract double calculararea();


    public abstract  double calcularperimetro();

    }

