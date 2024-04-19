package com.brixton.javamid.herencia;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        log.info("PERSONA 1 antes de colocar datos"+ persona1);
        persona1.setNombre("ISA");
        persona1.setApellido("N");
        //LocalDate fechaNacimientoDePersona1 = LocalDate.now(); //17/04/2024 22:50
        //LocalDate fechaNacimientoDePersona1A = LocalDate.of(2000,5,15); //15/05/2000
        //fecha fechaNacimiento = fecha(2000,15,05)

        // setFecha(fechaNacimiento)
        // setFecha(fecha(2000,15,05))

        //persona1.setFechaNacimiento(fechaNacimientoDePersona1A);
        //otra forma
        persona1.setFechaNacimiento(LocalDate.of(2000,5,15));
        //
        DocumentoIdentidad dniPersona1 = new DocumentoIdentidad();
        dniPersona1.setNumero("70245555");
        dniPersona1.setTipo("DNI");

        DocumentoIdentidad cex = new DocumentoIdentidad("CE", "554555555");
        //
        //persona1.setDocumentoIdentidad(dniPersona1);
        //persona1.setDocumentoIdentidad( cex );
        persona1.setDocumentoIdentidad(new DocumentoIdentidad("CE", "05878556646465"));
        log.info("PERSONA 1"+ persona1);

        Persona persona2 = new Persona("Hans", "V");
        log.info("PERSONA 2 antes de colocar datos: "+ persona2);
        persona2.setFechaNacimiento(LocalDate.of(2000,5,15));
        persona2.setDocumentoIdentidad(new DocumentoIdentidad("CE", "05878556646465"));
        log.info("PERSONA 2: " + persona2 );

        Persona person3 = new Persona("YOSELIN","R", new DocumentoIdentidad("DNI", "05878565"), LocalDate.of(2000,5,15) );
        log.info("PERSONA 3: "+ person3);

        Empleado e1 = new Empleado("ISA","N", new DocumentoIdentidad("CE", "05878556646465"),LocalDate.of(2000,5,15),LocalDate.of(2024,4,18));
        log.info("Empleado: {}", e1);
        log.info("Empleado - Datos Persona: "
                + e1.getNombre() + ", " + e1.getApellido() + ", " + e1.getFechaNacimiento());

        Desarrollador des1 = new Desarrollador("hans", "V", "Junior");
        log.info("DESARROLLADOR: " + des1 + ", nombre: " + des1.getNombre());

    }
}
