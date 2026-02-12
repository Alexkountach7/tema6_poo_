package org.example;

import java.util.ArrayList;

public class empleadoApp {
    static void main() {
         ArrayList<Empleado> listaempleado = new ArrayList<>();
         Empleado alex = new Empleado();
         Gerente pablo = new Gerente();
         Diseñador samu = new Diseñador();
         Desarrollador santi = new Desarrollador();
         listaempleado.add(alex);
         listaempleado.add(pablo);
         listaempleado.add(samu);
         listaempleado.add(santi);

         for (Empleado empleado : listaempleado) {
             empleado.realizartarea();


         }



    }

    public void asignartare(Empleado empleado) {
        System.out.println("asignando tarea al empleado");
        empleado.realizartarea();

    }



}
