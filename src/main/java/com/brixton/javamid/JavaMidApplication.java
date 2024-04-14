package com.brixton.javamid;

import com.brixton.javamid.model.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaMidApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMidApplication.class, args);

		Bank scotia = new Bank("Scotiabank");

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
