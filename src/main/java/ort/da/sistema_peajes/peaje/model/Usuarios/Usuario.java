package ort.da.sistema_peajes.peaje.model.Usuarios;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Estados.EstadoPropietario;

public abstract class Usuario {

	private String usuario;
	private String password;
	private String nombreCompleto;
	private EstadoPropietario estado;


	public Usuario(String usuario, String password, String nombreCompleto) {
		this.usuario = usuario;
		this.password = password;
		this.nombreCompleto = nombreCompleto;
	}


	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

    public boolean validarCredenciales(String usuario, String password) throws EstadoException{
		return this.usuario.equals(usuario) && this.password.equals(password); // && this.estado.puedeEntrar()
	}

}
