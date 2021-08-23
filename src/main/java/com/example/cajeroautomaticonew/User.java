package com.example.cajeroautomaticonew;

import java.util.ArrayList;

public interface User {

    void agregarCuentas(Cuenta cuenta);

    ArrayList<Cuenta> getCuentas();

    void iniciarSesion();



}
