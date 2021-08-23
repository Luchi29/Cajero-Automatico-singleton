package com.example.cajeroautomaticonew;

import java.util.Scanner;

public class CajaAhorroDolares extends Cuenta{

    public CajaAhorroDolares() {this.saldoMinimo=0;
    this.saldoActual= 20000;}

    @Override
    public void depositarValor(TipoDeMoneda tipo) {
        if(!tipo.equals(TipoDeMoneda.DOLARES)){
            System.out.println("Tipo de moneda incorrecto");
            return;
        }
        super.depositarValor(tipo);

    }

    @Override
    public void extraerDinero() {

        Scanner in = new Scanner(System.in);
        int opcionElegida;

        mostrarOpciones(this.opciones);
        opcionElegida = in.nextInt();

        if(saldoActual - opciones.get(opcionElegida) > saldoMinimo){
            saldoActual -= (int)(opciones.get(opcionElegida)*1.3);
        }else {
            System.out.println("Saldo insuficiente");
        }
        mostrarSaldo();
    }

    @Override
    public String getInfo() {
        return "Caja de ahorro en dolares";
    }
}
