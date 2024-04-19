package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Desarrollador extends Empleado {

    String expertise;
    List<String> lenguajesProgramacion;

    public Desarrollador() {

    }

    public Desarrollador(String nombre, String apellido, String expertisse) {
        super(nombre, apellido, null, null, null);
        setExpertise(expertisse);
        setLenguajesProgramacion(new ArrayList<>());
    }

}
