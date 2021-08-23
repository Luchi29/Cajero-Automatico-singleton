package com.example.cajeroautomaticonew;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM implements Cajero{

    ArrayList<String> opciones = new ArrayList<>();
    User usuarioActual;
    Cuenta tipoCuenta;

    public ATM(User user) {
        opciones.add("Ver saldo");
        opciones.add("Realizar deposito");
        opciones.add("Extraer");
        this.usuarioActual = user;

        elegirCuenta();
        seleccionarOperacion();
    }
    @Override
    public void elegirCuenta() {
        Scanner in = new Scanner(System.in);
        int opcion;
        ArrayList<Cuenta> cuentas = usuarioActual.getCuentas();

        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println(i + ". " +  cuentas.get(i).getInfo());
        }

        opcion = in.nextInt();


        //TODO: comprobar si es opcion valida
        tipoCuenta = cuentas.get(opcion);
        System.out.println(cuentas.get(opcion).getInfo() + " selecionada" );
        Log.getInstance().add("Ud ha seleccionado " + opcion);

    }

    @Override
    public void seleccionarOperacion() {
        Scanner in = new Scanner(System.in);
        int opcionElegida;
        mostrarOpciones();
        opcionElegida = in.nextInt();
        switch (opcionElegida){
            case 1: {
                tipoCuenta.mostrarSaldo();
                break;
            }
            case 2: {
                System.out.println("Seleccione tipo de moneda");
                tipoCuenta.depositarValor(seleccionarMoneda());
                break;
            }
            case 3: {
                tipoCuenta.extraerDinero();
                break;
            }
            case 4: {
                tipoCuenta.getInfo();
                break;
            }
        }
        Log.getInstance().add("Ud ha seleccionado exitosamente  " + opcionElegida);

    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Seleccione una operacion a realizar");
        for(int i = 0; i < opciones.size(); i++) {
            System.out.println("Opcion " + (i+1) + ": " + opciones.get(i));
        }

    }

    @Override
    public TipoDeMoneda seleccionarMoneda() {
        TipoDeMoneda tipo;
        Scanner in = new Scanner(System.in);
        int opcionElegida;

        System.out.println("1. PESOS");
        System.out.println("2. DOLARES");

        opcionElegida = in.nextInt();

        switch (opcionElegida){
            case 1:
                tipo = TipoDeMoneda.PESOS;
                break;
            case 2:
                tipo = TipoDeMoneda.DOLARES;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcionElegida);
        }
        return tipo;
    }

    }

