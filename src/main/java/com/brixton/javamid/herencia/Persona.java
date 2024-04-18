package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Persona {

    private String nombre;
    private String apellido;
    private DocumentoIdentidad documentoIdentidad;
    private LocalDate fechaNacimiento;

    public Persona(String nombrex, String apellidoz) {
        setNombre(nombrex);
        setApellido(apellidoz);
    }

    public Persona(String nombre, String apellido, DocumentoIdentidad docu, LocalDate fnac) {
        setNombre(nombre);
        setApellido(apellido);
        setDocumentoIdentidad(docu);
        setFechaNacimiento(fnac);
    }

    public Persona() {

    }

}
