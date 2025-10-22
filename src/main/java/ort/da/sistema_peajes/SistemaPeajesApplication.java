package ort.da.sistema_peajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ort.da.sistema_peajes.peaje.Precarga;

@SpringBootApplication
public class SistemaPeajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaPeajesApplication.class, args);
		
		Precarga.cargar();
		System.out.println("Sistema de Peajes iniciado.");

		//http://localhost:8080/login_Propietario.html
		//http://localhost:8080/login_Administrador.html
	}

}
