package org.example;

public enum EstadoPedido {
    RECIBIDO,
    PROCESANDO,
    ENVIADO,
    ENTREGADO;

public EstadoPedido siguiente() {
        switch (this) {
            case RECIBIDO:
                return PROCESANDO;
            case PROCESANDO:
                return ENVIADO;

            case ENVIADO:
                return ENTREGADO;
            case ENTREGADO:
                return ENTREGADO;
            default:
                return RECIBIDO;

    }
}
}


