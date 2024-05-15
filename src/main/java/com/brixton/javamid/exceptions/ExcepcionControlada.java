package com.brixton.javamid.exceptions;

import com.brixton.javamid.polimorfismo.Acta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionControlada {

    public static void main(String[] args) {

        //FileNotFoundExcepcion
        //Excepcion controlada, es cuando se detecta en tiempo de COMPILACION
        //File file = new File("src/main/java/com/brixton/polimorfismo/img.png");
        //System.out.println("Puedo leer: " + file.isFile());

        try { //INTENTAR
            //Scanner input = new Scanner(new File("src/main/java/com/brixton/polimorfismo/img.png")); //ERROR
            Scanner input = new Scanner(new File("src/main/java/com/brixton/javamid/polimorfismo/imkg.png"));
            input.hasNext();
        } catch (FileNotFoundException e) { //ATRAPAR
            System.out.println("SE PRODUJO UNA EXCEPCION PORQUE NO EXISTE EL ARCHIVO");
            //throw new RuntimeException(e);
        }

        //ClassNotFoundExcepcion
        try {
            Class<?> clase = Class.forName("com.brixton.javamid.polimorfismo.Acta");
            //Acta instancia = clase.getDeclaredConstructor();

        } catch (ClassNotFoundException x) {
            System.out.println("CLASS NOT FOUND --- ESA CLASE NO EXISTE AMIGUITO");
        }





    }

}
