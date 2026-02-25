package org.example;

import java.util.Scanner;

public class AppPedido {
    static void main() {
        Scanner sc = new Scanner(System.in);
        EstadoPedido estado = EstadoPedido.RECIBIDO;
        System.out.println("estado actual: "+estado);

        System.out.println("todos los estados posibles: ");

        for (EstadoPedido estado_: EstadoPedido.values()) {
            System.out.println(estado_);
        }

        for (int i =0; i<5; i++){
            estado = estado.siguiente();
            System.out.println("estado actual: "+estado);
        }

        while (true){
            System.out.println("estado actual: "+estado);

            if (estado == EstadoPedido.ENTREGADO) {
                System.out.println("el pedido ya esta entregado. fin del proceso");
                break;
            }

            System.out.println("pulsa enter para avanzar al siguiente estado");
            estado = estado.siguiente();
        }
        EstadoPedido _estado_ = EstadoPedido.RECIBIDO;
        boolean salir = false;

        while (!salir) {
            System.out.print("estado actual "+estado);

            if (_estado_ == EstadoPedido.ENTREGADO){
                System.out.println("el pedido ya esta entregado. Fin del proceso");
                break;
            }

            System.out.println("1. Avanzar estado");
            System.out.println("2. Cancelar pedido");
            System.out.println("elige opcion");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    _estado_ = estado.siguiente();
                    System.out.println("estado actualizado a: "+_estado_);
                    break;
                case 2:
                    System.out.println("pedido canceldo");
                    salir = true;
                    break;
                default:
                    System.out.println("opcion no valida");

            }
        }
    }

}
