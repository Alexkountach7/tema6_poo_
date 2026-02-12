package org.example;

import java.util.ArrayList;

public class RestauranteApp {
    static void main() {
        Camarero pepe = new Camarero("pepe","36254864j", 1354.4);
        pepe.mostrarinformacionpersonal();
        Cliente cliente1 = new Cliente("alex","56445484j", 5,4);
        cliente1.mostrarinfocliente();

        Encargado jose = new Encargado("jose luis","56525655q", 56562);

        jose.mostrarinformacionpersonal();

        Persona patri = new Encargado("patricia", "15545415d", 584848);

        ArrayList<Persona> listapersonal = new ArrayList<>();
        listapersonal.add(patri);
        listapersonal.add(jose);

        System.out.println(listapersonal);

        jose.accederalbaño();

    }
}
