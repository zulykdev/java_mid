package com.brixton.javamid.polimorfismo;

import com.brixton.javamid.herencia.Empresa;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Factura extends Comprobante {

    private Empresa empresaCliente;

    public void imprimir(){
        log.info("IMPRIMIENDO ... SOY UNA FACTURA");
    }

    public void metodoFactura(){
        log.info("metodoFactura");
    }

    @Override
    public double calcularSubTotal() {
        metodoFactura();
        return 100.00;
    }

}
