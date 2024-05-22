package com.brixton.javamid.polimorfismo;

public class DemoInterfaz {

    public static void main(String[] args) {

        Emision emitir1 = generate(1);
        emitir1.emitir();
        Emision emitir2 = generate(2);
        emitir2.emitir();
        Emision emitir3 = generate(3);
        emitir3.emitir();

    }

    public static Emision generate(int tipo){
        /**
         * 1 genera Matrimonio
         * 2 genera Defuncion
         * 3 genera AsientoContable
         */
        if(tipo == 1) {
            return new Matrimonio();
        }
        else if (tipo == 2) {
            return new Defuncion();
        }
        else {
            return new AsientoContable();
        }
    }
}
