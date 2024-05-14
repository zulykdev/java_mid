package com.brixton.javamid.polimorfismo;

public class DemoInterfaz {

    public static void main(String[] args) {

        Emision matrimonio = new Matrimonio();
        matrimonio.emitirMatrimonio();

        Emision defuncion = new Defuncion();
        defuncion.emitirDefuncion();

        Emision arbi = new AsientoContable();
        arbi.emitirArbitrio();





    }
}
