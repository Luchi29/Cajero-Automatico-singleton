package com.example.cajeroautomaticonew;

import java.util.Scanner;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente() {
        this.saldoMinimo = -100000;
    }

    public void depositarValor(TipoDeMoneda tipo) {
        if (!tipo.equals(TipoDeMoneda.PESOS)) {
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

        if (saldoActual - opciones.get(opcionElegida) > saldoMinimo) {
            saldoActual -= (int) (opciones.get(opcionElegida) * 1.03);
        } else {
            System.out.println("Saldo insuficiente");
        }
        mostrarSaldo();

    }

    @Override
    public String getInfo() {
        return "Cuenta corriente";
    }


}
