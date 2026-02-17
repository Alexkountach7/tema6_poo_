package org.example;

public class Superman extends Superheroe implements Voladores{

    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos");
    }

}
