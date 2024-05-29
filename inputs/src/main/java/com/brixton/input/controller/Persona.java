package com.brixton.input.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
@Slf4j
public class Persona {

    static public int instancias = 0;

    static public boolean fueInstanciado;
    //-----------------------------------------
           public boolean miValorBooleanPublico;
    private String nombre;
    private int edad;
    private byte miByte;
    private short miShort;
    private char miChar;
    private long miLong;
    private float miFloat;
    private double miDouble;
    private boolean miBoolean;
    private String apellido;
    private Integer miWI;
    private Boolean miWB;
    private int contadorPersonas;


    public Persona(String nombre){
        instancias++;
        contadorPersonas++;
        fueInstanciado = true;
        log.info("fueInstanciado: " + fueInstanciado);
    }

    private void hacerAlgo() {
        log.info("hacerAlgo");
        fueInstanciado = false;
        log.info("fueInstanciado: " + fueInstanciado);
    }

    public void hacerNada() {
        hacerAlgo();
        log.info("hacerNada");
        fueInstanciado = true;
        log.info("fueInstanciado: " + fueInstanciado);
    }

    public static boolean getFueInstanciado() {
        return fueInstanciado;
    }

}
