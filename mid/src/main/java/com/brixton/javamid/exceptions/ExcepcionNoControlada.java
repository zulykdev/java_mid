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

        //input solicitando que caja quiere mostrar...
        // se debe limitar a que la caja que se quiera mostrar no sea mayor al numero total de cajas (6).
//        int capacity = 6;
//        String [] valores = new String[capacity]; // [0][1][2][3][4][5]
//        System.out.println("INGRESE VALOR DE CAJA a mostrar");
//        int inputCaja = sc.nextInt();
//        if (inputCaja <= capacity) {
//            System.out.println("valor de la caja 29:" + valores[inputCaja]);
//        } else {
//            System.out.println("NO ES UN VALOR VALIDO");
//        }


        int capacity2 = 6;
        String [] valores2 = new String[capacity2]; // [0][1][2][3][4][5]
        //input solicitando que caja quiere mostrar...
        // se debe limitar a que la caja que se quiera mostrar no sea mayor al numero total de cajas (6).
        try {
            System.out.println("INGRESE VALOR DE CAJA a mostrar");
            int inputCaja2 = sc.nextInt();
            System.out.println("valor de la caja 29:" + valores2[inputCaja2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INGRESAS UN VALOR FUERA DEL RANGO");
        } catch (Exception e) {
            System.out.println("SE PRODUJO UN ERROR INESPERADO");
        }







    }
}
