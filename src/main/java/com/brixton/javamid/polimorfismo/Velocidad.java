package com.brixton.javamid.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Velocidad {

    int aceleracion;

    Velocidad(int aceleracion) {
        setAceleracion(aceleracion);
    }

}
