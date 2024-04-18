package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DocumentoIdentidad {

    private String tipo; //DNI, CE, PASAPORTE
    private String numero; //00000AAA00

    public DocumentoIdentidad(String tipo, String numero) {
       setNumero(numero);
       setTipo(tipo);
    }

    public DocumentoIdentidad() {

    }



}
