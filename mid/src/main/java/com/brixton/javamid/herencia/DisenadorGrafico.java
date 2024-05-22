package com.brixton.javamid.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class DisenadorGrafico extends Empleado {

    private String portfolio;
    private List<String> swGraficos;
    public DisenadorGrafico(String portfolio, List software) {
        setPortfolio(portfolio);
        setSwGraficos(software);
    }

    public DisenadorGrafico() {

    }

    public void imprimir(String paginas) {

    }

    public void imprimir(String nombreImpresora, String color) {

    }

    public void encender(Llave isTheKey){

    }

    public void encender(Voltage isForced){

    }

    public void encender(Speed minimoVelocidad) {

    }

    public void aperturarLibroMayor(LibroDebe debe){

    }
    public void aperturarLibroMayor(LibroHaber haber){

    }
    public void aperturarLibroMayor(LibroDebe debe, LibroHaber haber){

    }

}
