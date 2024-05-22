package com.brixton.javamid.polimorfismo;


public class Matrimonio extends Acta implements Emision {

    @Override
    public void emitir() {
        System.out.println("EMITIR MATRIMONIO");
    }

    void actualizacionDatos() {
        System.out.println("ACTUALIZA MATRIMONIO");
    }
}
