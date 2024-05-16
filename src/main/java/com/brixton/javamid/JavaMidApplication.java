package com.brixton.javamid;

import com.brixton.javamid.model.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class JavaMidApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMidApplication.class, args);
//
//		Scanner input = new Scanner(System.in);
//		String salida = "";
//		Bank scotia = new Bank("Scotiabank");
//
//		//scotia.abrirCuenta("BD", 500);
//
//		while (!salida.equals("4")) {
//			scotia.menuOpciones();
//			salida = input.nextLine();
//		}
//
//
//		scotia.abrirCuenta("AB", 100);
//		scotia.depositarEnCuenta("AB", 50);
//		scotia.retirarDeCuenta("AB",300);
//		scotia.retirarDeCuenta("AB", 100);
//		//---------------------
//		scotia.abrirCuenta("BC", 0.0);
//		scotia.retirarDeCuenta("BC", 180);
//		scotia.depositarEnCuenta("BC", 200);
//		//---------------------
//		scotia.mostrarInfo();

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
			try {
				System.out.println("RESULTADO DIVISION: " + (x / y));
			} catch (Exception e) {
				System.out.println("Error ME001: " + e.getMessage());
			}

			System.out.println("=============");
			System.out.println("Desea continuar?: y/n");
			continuar = sc.next();
		}

		int capacity2 = 6;
		String [] valores2 = new String[capacity2]; // [0][1][2][3][4][5]
		//input solicitando que caja quiere mostrar...
		// se debe limitar a que la caja que se quiera mostrar no sea mayor al numero total de cajas (6).
		try {
			System.out.println("INGRESE VALOR DE CAJA a mostrar");
			int inputCaja2 = sc.nextInt();
			System.out.println("valor de la caja 29:" + valores2[inputCaja2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ME002: INGRESAS UN VALOR FUERA DEL RANGO");
		} catch (Exception e) {
			System.out.println("ME003: SE PRODUJO UN ERROR INESPERADO");
		}

//		int num = 9;
//		switch (num) {
//			case 1: System.out.println(); break;
//			case 2: System.out.println(); break;
//			default:
//				System.out.println("no ingresar valor incorrecto");
//		}

		// String tarjeta = "1234567895556666";
		// System.out.println("MOSTRANDO TEXTO1: " + tarjeta.substring(12));

		System.out.println("INGRESA ALGO: (Minimo 3 letra)");
		String texto1 = sc.next();

		try {
			System.out.println("MOSTRANDO TEXTO1: " + texto1.substring(2));
//			fILE.OPEN()....
			//intento leer el archivo "que debe contener solo numeros"
			// .......... hay una letra
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			texto1 = "9999";
//			file.close();
		}
		System.out.println("Valor de TEXTO1: " + texto1);

	}

}
