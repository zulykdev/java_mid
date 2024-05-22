package com.brixton.javamid.polimorfismo;

import java.sql.SQLOutput;

public class UsoPolimorfismo {

    public static void main(String[] args) {

        Boleta boleta = new Boleta();
        //boleta.imprimir();

        Factura factura = new Factura();
        //factura.imprimir();

        //----------------
        //SQLOutput"qUE TIPO QUIERES GENERAR: INGRES 1 BOLETA, INGRESE 2 FACTURA"
        Comprobante comprobante1 = generate(1);
        comprobante1.imprimir();
        comprobante1.calcularSubTotal();

        Comprobante comprobante2 = generate(2);
        comprobante2.imprimir();
        comprobante2.calcularSubTotal();

        //--------------
//        Comprobante compro2 = new Factura();
//        compro2.imprimir();
//        compro2.calcularSubTotal();
//
//        Comprobante compro1 = new Boleta();
//        compro1.imprimir();
//        compro1.calcularSubTotal();

        //----------------
       // Boleta boleta01 = new Comprobante();

        //Comprobante boleta1 = new Boleta();

        //Comprobante comprobante = new Comprobante();




    }

    public static Comprobante generate(int tipo){
        if(tipo == 1) {
            return new Boleta();
        }
        else {
            return new Factura();
        }
    }


}
