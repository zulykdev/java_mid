package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Boleta extends Comprobante{

    private String slogan;

    //DATOS DEL CLIENTE
    private String nombreCliente;
    private String nroDocumento;
    private String direccion;


}
