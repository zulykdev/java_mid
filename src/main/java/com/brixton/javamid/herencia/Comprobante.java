package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Comprobante {

    private String numeroSerie;
    private String numeracion;
    private double total;
    private List<Producto> venta;


}
