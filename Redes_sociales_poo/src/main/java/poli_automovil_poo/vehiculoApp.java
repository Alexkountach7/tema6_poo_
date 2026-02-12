package poli_automovil_poo;

import java.util.ArrayList;

public class vehiculoApp {
    static void main() {



            ArrayList<vehiculo> listaVehiculos = new ArrayList<>();

            listaVehiculos.add(new Coche());
            listaVehiculos.add(new Moto());
            listaVehiculos.add(new Coche());
            listaVehiculos.add(new Moto());

            for (vehiculo v : listaVehiculos) {
                v.arrancar();
            }
        }
    }


