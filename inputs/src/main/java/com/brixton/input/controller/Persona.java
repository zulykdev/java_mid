package com.brixton.input.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Persona {

    static int cuentaPersonas = 0;
    private static int cuentaPersona = 0;

    String nombre;
    int edad;
    String apellido;

    public Persona(String nombre){
        cuentaPersonas++;
        setNombre(nombre);
    }

    private void hacerAlgo() {

    }

    public void hacerNada() {
        hacerAlgo();
    }

    public static int getCantidadPersonas() {
        cuentaPersona = 99;
        return cuentaPersonas;
    }

}
