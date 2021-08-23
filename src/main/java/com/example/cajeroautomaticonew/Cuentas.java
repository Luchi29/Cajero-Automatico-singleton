package com.example.cajeroautomaticonew;

import java.util.ArrayList;

public interface Cuentas {
    void mostrarSaldo();

    void depositarValor(TipoDeMoneda tipo);

    void extraerDinero();

    String getInfo();

    void mostrarOpciones(ArrayList<Integer> opciones);

}
