package ort.da.sistema_peajes.peaje.model.Usuarios;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Estados.EstadoPropietario;

public abstract class Usuario {

	private String cedula;
	private String password;
	private String nombreCompleto;
	private EstadoPropietario estado;


	public Usuario(String cedula, String password, String nombreCompleto) {
		this.cedula = cedula;
		this.password = password;
		this.nombreCompleto = nombreCompleto;
	}


	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

    public boolean validarCredenciales(String usuario, String password) throws EstadoException{
		return this.cedula.equals(usuario) && this.password.equals(password) && this.estado.puedeEntrar();
	}

}
