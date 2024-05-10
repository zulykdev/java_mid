package com.brixton.javamid.polimorfismo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Boleta extends Comprobante {

    private String slogan;

    //DATOS DEL CLIENTE
    private String nombreCliente;
    private String nroDocumento;
    private String direccion;

    public void imprimir(){
        log.info("IMPRIMIENDO ... SOY UNA BOLETA");
    }

    public double calcularSubTotal() {
        metodoBoleta();
        return 100.00;
    }

    public void metodoBoleta(){
        log.info("metodoBoleta");
    }

}
