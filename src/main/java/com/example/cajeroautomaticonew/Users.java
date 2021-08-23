package com.example.cajeroautomaticonew;

import java.util.ArrayList;
import java.util.Scanner;

public class Users implements User{

    private String nombreUsuario;
    private String contraseña;
    private ArrayList<Cuenta> cuentas;

    public Users(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        cuentas = new ArrayList<>();
    }
    @Override
    public void agregarCuentas(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public ArrayList<Cuenta> getCuentas() {

        return cuentas;
    }

    @Override
    public void iniciarSesion() {
        Scanner in = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("ingrese su usuario: ");
        userName = in.nextLine();
        System.out.println("ingrese su contraseña: ");
        password = in.nextLine();

        if(nombreUsuario.equals(userName) && contraseña.equals(password)) {
            System.out.println("Bienvenido!");
        } else {
            System.out.println("ingrese su usuario: ");
            userName = in.nextLine();
            System.out.println("ingrese su contraseña: ");
            password = in.nextLine();
        }

    }
}
