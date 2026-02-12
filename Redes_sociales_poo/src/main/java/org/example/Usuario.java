package org.example;

public class Usuario {
    private String nombre;
    private int edad;
    private String nombre_usuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombre_usuario, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombre_usuario = nombre_usuario;
        this.seguidores = seguidores;

    }
    public void informacionusuaria() {
        System.out.println("el nombre del usuario es " +nombre);
        System.out.println("la edad del usuario es: "+edad);
        System.out.println("el alias del usuario: "+nombre_usuario);
        System.out.println("los seguidores son: "+seguidores);
    }

    public int getEdad() {

        return edad;
    }

    public int getSeguidores() {

        return seguidores;
    }

    public String getNombre() {

        return nombre;
    }

    public void setSeguidores(int seguidores) {

        this.seguidores = seguidores;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}
