package com.brixton.javamid.polimorfismo;

public class Vehiculo {

    //Encender de 3 formas
    //1 con llave
    //2 empujando (a una velocidad experada de 5km/h)
    //3 alza en el votaje 8kw

    public void encender(Llave llave) {
        System.out.println("ENCENDI CON LLAVE");
    }

    public void encender(Velocidad velocidad) {
        if (velocidad.getAceleracion() >= 5) {
            System.out.println("ENCENDI POR VELOCIDAD");
        }
    }

    public void encender(Shock shock) {
        System.out.println("ENCENDI CON SHOCK");
    }

    public void encender(Llave llave, Shock shock, Velocidad velocidad) {
        if(llave != null) {
            encender(llave);
        }
        if(shock != null) {
            encender(shock);
        }
        if(velocidad != null) {
            encender(velocidad);
        }
    }


}
