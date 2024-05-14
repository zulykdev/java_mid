package com.brixton.javamid.polimorfismo;

public class AsientoContable implements Emision {

    @Override
    public void emitirMatrimonio() {

    }

    @Override
    public void emitirDefuncion() {

    }

    @Override
    public void emitirArbitrio() {
        System.out.println("EMITIR ARBITRIO");
    }
}
