package com.brixton.javamid.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Account {

    String nroCuenta;
    double saldo;

    public Account(String nroCuenta, double balance) {
        setNroCuenta(nroCuenta);
        setSaldo(balance);
        mostrarInfo();
    }

    public void depositar(double amount) {
        if(amount > 0.0) {
            setSaldo(getSaldo() + amount);
        } else{
            log.info("Account: Monto de deposito no permitido");
        }
        mostrarInfo();
    }

    public void retirar(double amount) {
        if ((getSaldo() - amount) > 0) {
            setSaldo(getSaldo() - amount);
        } else {
            log.info("Account: Saldo insuficiente");
        }
        mostrarInfo();
    }

    private void mostrarInfo(){
        log.info("Saldo: " + getSaldo());
        log.info("Nro de Cuenta: " + getNroCuenta());
    }
}
