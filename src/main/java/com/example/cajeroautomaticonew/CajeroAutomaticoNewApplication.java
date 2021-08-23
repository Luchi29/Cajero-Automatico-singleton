package com.example.cajeroautomaticonew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CajeroAutomaticoNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CajeroAutomaticoNewApplication.class, args);
		Users usuario = new Users("noelia", "1234" );
		Cuenta cuenta1 = new CuentaCorriente();
		Cuenta cuenta2 = new CajaAhorroDolares();
		Cuenta cuenta3 = new CajaAhorroPesos();

		usuario.agregarCuentas(cuenta1);
		usuario.agregarCuentas(cuenta2);
		usuario.agregarCuentas(cuenta3);

		usuario.iniciarSesion();
		ATM cajero = new ATM(usuario);


		Log log = Log.getInstance();
		log.printLogs();
	}

}
