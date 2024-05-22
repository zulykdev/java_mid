package com.brixton.javamid.polimorfismo;

public class DemoPolimorfismoMetodo {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.encender(new Llave());
        vehiculo.encender(new Shock());
        vehiculo.encender(new Velocidad(5));

        vehiculo.encender(null, null, new Velocidad(6));

    }
}
