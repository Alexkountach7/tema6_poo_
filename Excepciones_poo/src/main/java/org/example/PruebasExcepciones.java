package org.example;

import java.util.zip.DataFormatException;

public class PruebasExcepciones {
    static void main() throws DataFormatException {


        int cuenta = 5;

        if (cuenta<=0) {
            throw new IllegalArgumentException("EL SALDO DEBE SER POSITIVO");
            throw  new DataFormatException();
        }
    }
}