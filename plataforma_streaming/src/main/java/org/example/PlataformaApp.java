package org.example;

import java.util.ArrayList;

public class PlataformaApp {
    static void main() {
        ArrayList<Suscripcion> listasuscripcion = new ArrayList<>();

        Suscripcion plantabasico1 = new Planbasico("basicplan",5955);
        Suscripcion plantafamiliar1 = new Planfamiliar("familyplan", 658985);
        Suscripcion plangratis1 = new Plangratis("freeplan", 658595);
        Suscripcion planpremium1 = new Planpremium("premiumplan", 545415);

        listasuscripcion.add(plangratis1);
        listasuscripcion.add(planpremium1);
        listasuscripcion.add(plantabasico1);
        listasuscripcion.add(plantafamiliar1);

        for (Suscripcion suscripcion : listasuscripcion){
            suscripcion.mostrarinfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
        }
    }
}
