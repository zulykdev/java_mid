package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Empleado extends Persona{

    //FIN DE ATRIBUTOS DE LA CLASE PERSONA
    // Las clases hijas deben añadir valor
    private LocalDate fechaIngreso;
    //private Empresa empresa;

    //private Cargo cargo;
    private String codigoContrato; //A0519-895

    public Empleado(){

    }

}