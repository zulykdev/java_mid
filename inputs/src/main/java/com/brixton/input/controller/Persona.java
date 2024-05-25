package com.brixton.input.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Persona {

    String nombre;
    int edad;
    String apellido;

    private void hacerAlgo() {

    }

    public void hacerNada() {
        hacerAlgo();
    }

}
