package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Factura extends Comprobante{

    private Empresa empresaCliente;

}
