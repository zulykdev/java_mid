package com.brixton.javamid.polimorfismo;

import com.brixton.javamid.herencia.Producto;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Setter
@Slf4j
public class Comprobante {

    private String numeroSerie;
    private String numeracion;
    private double total;
    private List<Producto> venta;

    public void imprimir() {
        log.info("Estoy imprimiendo");
    }

    public double calcularSubTotal() {
        return 0;
    }



}
