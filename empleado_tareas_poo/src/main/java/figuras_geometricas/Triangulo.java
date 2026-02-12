package figuras_geometricas;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double calculararea() {
        return 0;
    }

    @Override
    public double calcularperimetro() {
        return 0;
    }
}
