package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Empleado extends Persona{

    //FIN DE ATRIBUTOS DE LA CLASE PERSONA
    // Las clases hijas deben añadir valor
    private LocalDate fechaIngreso;
    //private Empresa empresa;

    //private Cargo cargo;
    private String codigoContrato; //A0519-895

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, DocumentoIdentidad documento, LocalDate fechaNacimiento, LocalDate fechaIng) {
        super(nombre, apellido, documento, fechaNacimiento);
//        setNombre(nombre);
//        setApellido(apellido);
//        setDocumentoIdentidad(documento);
//        setFechaNacimiento(fechaNacimiento);
        setFechaIngreso(fechaIng);
        setCodigoContrato("PENDIENTE");
    }

}
