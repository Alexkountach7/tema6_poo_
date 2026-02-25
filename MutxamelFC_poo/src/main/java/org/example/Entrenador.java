package org.example;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionpreferida;
    public Entrenador(String nombre, int edad, String formacionpreferida, Equipos equipo) throws FormacionpreferidaExcept {
        super(nombre, edad);

        if (!formacionpreferida.matches("[\\d-\\d-\\d]"))
            throw new FormacionpreferidaExcept();

        this.formacionpreferida = formacionpreferida;
        this.equipos = equipo;

    }

    public void planficarEntrenamiento(){
        System.out.println("el entrenador planifica el entrenamiento");
    }
    public void hacercambios(){
        System.out.println("el entrenador hace cambios");
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setFormacionpreferida(String formacionpreferida) {
        this.formacionpreferida = formacionpreferida;
    }

    public String getFormacionpreferida() {
        return formacionpreferida;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipos=" + equipos +
                ", formacionpreferida='" + formacionpreferida + '\'' +
                '}';
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrargol() {

    }
}
