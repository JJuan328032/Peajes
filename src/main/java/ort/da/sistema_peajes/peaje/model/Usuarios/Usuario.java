package ort.da.sistema_peajes.peaje.model.Usuarios;

import javax.security.auth.login.LoginException;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;

public abstract class Usuario {

	private String usuario;
	private String password;
	private String nombreCompleto;


	public Usuario(String usuario, String password, String nombreCompleto) {
		this.usuario = usuario;
		this.password = password;
		this.nombreCompleto = nombreCompleto;
	}

	abstract public void Validar() throws EstadoException ,LoginException;


	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

    public boolean validarCredenciales(String usuario, String password) throws EstadoException, LoginException{
		return this.usuario.equals(usuario) && this.password.equals(password);
	}
}
