package com.brixton.javamid.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Slf4j
public class Bank {
    private String nombre;
    private Map<String, Account> cuentas;

    public Bank(String nombre) {
        setNombre(nombre);
        setCuentas(new HashMap<>());
    }

    public void abrirCuenta(String nroCuenta, double balanceInicial) {
        Account ctaNueva = new Account(nroCuenta, balanceInicial);
        getCuentas().put(nroCuenta, ctaNueva);

    }

    public void depositarEnCuenta(String nroCuenta, double amount) {
        Account tempAccount = getCuentas().get(nroCuenta);
        tempAccount.depositar(amount);
        //cuentas.get(nroCuenta).depositar(amount);
    }

    public void retirarDeCuenta(String nroCuenta, double amount) {
        Account tempAccount = getCuentas().get(nroCuenta);
        tempAccount.retirar(amount);
    }

    public void mostrarInfo() {
        log.info("Banco: " + getNombre());
        log.info("Cuentas: " + getCuentas().size());
    }

    public void menuOpciones() {
        log.info("=== OPCIONES === Ingrese el numero de opcion");
        log.info("1. Aperturar Cuenta");
        log.info("2. Realizar Deposito");
        log.info("3. Realizar Retiro");
        log.info("4. Salir");
    }
}
