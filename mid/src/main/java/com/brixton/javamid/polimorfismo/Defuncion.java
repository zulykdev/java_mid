package com.brixton.javamid.polimorfismo;

public class Defuncion extends Acta implements Emision, Movible{


    @Override
    public void emitir() {
        System.out.println("EMITIR DEFUNCION");
    }


    void actualizacionDatos() {
        System.out.println("ACTUALIZACION DE DEFUNCION");
    }

    @Override
    public void mover() {

    }
}
