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

}
