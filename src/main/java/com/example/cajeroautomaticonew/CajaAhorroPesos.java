package com.example.cajeroautomaticonew;

import java.util.Scanner;

public class CajaAhorroPesos extends Cuenta{

    public CajaAhorroPesos() {this.saldoMinimo=0;
        this.saldoActual= 20000;}
    @Override
    public void depositarValor(TipoDeMoneda tipo) {
        if(!tipo.equals(TipoDeMoneda.PESOS)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);
    }


    @Override
    public String getInfo() {
        return "Caja de ahorro en pesos";
    }

}
