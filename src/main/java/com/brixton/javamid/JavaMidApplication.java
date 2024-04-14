package com.brixton.javamid;

import com.brixton.javamid.model.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaMidApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMidApplication.class, args);

		Scanner input = new Scanner(System.in);
		String salida = "";
		Bank scotia = new Bank("Scotiabank");

		//scotia.abrirCuenta("BD", 500);

		while (!salida.equals("4")) {
			scotia.menuOpciones();
			salida = input.nextLine();
		}


		scotia.abrirCuenta("AB", 100);
		scotia.depositarEnCuenta("AB", 50);
		scotia.retirarDeCuenta("AB",300);
		scotia.retirarDeCuenta("AB", 100);
		//---------------------
		scotia.abrirCuenta("BC", 0.0);
		scotia.retirarDeCuenta("BC", 180);
		scotia.depositarEnCuenta("BC", 200);
		//---------------------
		scotia.mostrarInfo();


	}

}
