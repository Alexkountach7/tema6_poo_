package figuras_geometricas;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calculararea() {
        return base * altura;
    }

    @Override
    public double calcularperimetro() {
        return 2 * (base + altura);
    }

}
