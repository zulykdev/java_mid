package com.brixton.input.service;

import com.brixton.input.controller.Persona;
import org.apache.poi.ss.usermodel.*;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExcelService {

    public static void main(String[] args) {

        Persona juanito = new Persona("Pancho");
        juanito.setEdad(25);
        juanito.setApellido("Salamanca");
        System.out.println("Cantidad de Personas: " + Persona.getCantidadPersonas());
        System.out.println(juanito);
        Persona jk = new Persona("JK");

        System.out.println("Cantidad de Personas: " + Persona.getCantidadPersonas());



        ExcelService ex = new ExcelService();
        try {
            ex.construct();
        } catch (Exception e) {
            System.out.println("hbubo una excepcion; " + e.getClass());
        }

    }

    static void construct() throws Exception {
        File file = new File("D:\\ZolyDev\\BrixtonGroup\\Teaching\\Java_Backend_Mid_Senior\\repo\\java_mid\\inputs\\src\\main\\java\\com\\brixton\\input\\service\\demo.xlsx");
        InputStream inp = new FileInputStream(file);
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        System.out.println("Nombre del Sheet |Hoja| : " + sheet.getSheetName());

        int iRow = 0;
        Row row = sheet.getRow(iRow); //En qué fila empezar ya dependerá también de si tenemos, por ejemplo, el título de cada columna en la primera fila
        while(row!=null) {
            Cell cell = row.getCell(0);
            String value = cell.getStringCellValue();
            System.out.println("Valor de la celda es " + value);
            iRow++;
            row = sheet.getRow(iRow);
        }
/*
        try {
            File file = new File("D:\\ZolyDev\\BrixtonGroup\\Teaching\\Java_Backend_Mid_Senior\\repo\\java_mid\\inputs\\src\\main\\java\\com\\brixton\\input\\service\\demo.xlsx");
            FileInputStream fis = new FileInputStream(file);

            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            String cellValue = cell.getStringCellValue();

            System.out.println("El valor de la celda A1 es: " + cellValue);

            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }



}
