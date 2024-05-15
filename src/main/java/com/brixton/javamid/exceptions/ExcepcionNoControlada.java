package com.brixton.javamid.exceptions;

import java.util.Scanner;

public class ExcepcionNoControlada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Excepcion no controlada, es cuando no se detecta en tiempo de COMPILACION, solo se detecta en TIEMPO DE EJECUCION
        int x;
        int y;

        String continuar = "y";
        while (continuar.equals("y")) {
            System.out.println("INGRESE 1ER NUMERO: ");
            x = sc.nextInt();

            System.out.println("INGRESE 2DO NUMERO: ");
            y = sc.nextInt();

            //division
            System.out.println("RESULTADO DIVISION: " + (x / y));

            System.out.println("=============");
            System.out.println("Desea continuar?: y/n");
            continuar = sc.next();
        }

        int capacity = 6;
        String [] valores = new String[capacity]; // [0][1][2][3][4][5]
        //input solicitando que caja quiere mostrar...
        // se debe limitar a que la caja que se quiera mostrar no sea mayor al numero total de cajas (6).
        System.out.println("INGRESE VALOR DE CAJA a mostrar");
        int inputCaja = sc.nextInt();
        if (inputCaja <= capacity) {
            System.out.println("valor de la caja 29:" + valores[inputCaja]);
        } else {
            System.out.println("NO ES UN VALOR VALIDO");
        }


    }
}
