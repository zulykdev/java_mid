package com.brixton.input.controller;

import org.apache.poi.util.StringUtil;
import org.springframework.util.StringUtils;

public class DemoPersona {

    public static void main(String[] args) {

        Persona p = new Persona("Luchito");
        String nombreEmpresa = "Brixton";
        // p (objeto)
        p.hacerNada();
        Persona x = new Persona("Pepito");
        Persona y = new Persona("Isai");
        Persona z = new Persona("Yoselin");

        System.out.println("Contador Personas desde el objeto: " + z.getContadorPersonas());

        System.out.println("datos de la Persona -objeto-: " + p);
        System.out.println("datos de la Persona -atributo publico-: " + p.miValorBooleanPublico);
        //Metodos y atributos de la clase deben ser accedidos sin necesidad de crear un objeto.
        System.out.println("Atributo de clase -fueInstanciado-: " + Persona.fueInstanciado );
        System.out.println("Metodo de clase -getFueInstanciado-: " + Persona.getFueInstanciado());
        System.out.println("Atribu de clase -instancias-: " + Persona.instancias);

        //---------------------------------------
        //----------- SE UTILIZA EN CLASES UTILITARIAS
        //----------- SE UTILIZA EN PATRON SINGLETON
        //                      SE CARGA TODAS LAS CONFIGURACIONES Y VARIABLES EN UNA SOLA CLASE
        //                      Y SE COMPARTE SUS VALORES EN LA APLICACION

        //Ejemplo clase utilitaria: Math, StringUtils
        Double pi = Math.PI; //Math p = new Math  // p.getPI()
        Double senox = Math.cos(0.95);
        String miValor = StringUtils.capitalize("xyz");
        String textoAEvaluar = "hOLA iSAI";
        boolean contieneEspaciado = StringUtils.containsWhitespace(textoAEvaluar);
        System.out.println(miValor);
        System.out.println("contiene espacios: ? " + contieneEspaciado);

        Integer val = InitialConfiguration.VALOR_UIT;
        String nombre = InitialConfiguration.NOMBRE_EMPESA;




    }

}
