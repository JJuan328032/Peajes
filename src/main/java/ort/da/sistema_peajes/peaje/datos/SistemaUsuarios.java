package ort.da.sistema_peajes.peaje.datos;

import ort.da.sistema_peajes.peaje.model.Usuarios.Usuario;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;
import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Usuarios.Administrador;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;


public class SistemaUsuarios {

	private ArrayList<Propietario> propietarios;
	private ArrayList<Administrador> administradores;


	public SistemaUsuarios() {
		this.propietarios = new ArrayList<>();
		this.administradores = new ArrayList<>();
	}


	public Propietario loginPropietario(String usuario, String password) throws LoginException, EstadoException {
		return login(usuario, password, this.propietarios);
	}

	public Administrador loginAdministrador(String usuario, String password) throws LoginException, EstadoException{
		return login(usuario, password, administradores);
	}

	private <T extends Usuario> T login(String usuario, String password, ArrayList<T> lista) throws LoginException, EstadoException{
		for (T u : lista) if (u.validarCredenciales(usuario, password)) return u;
		throw new LoginException("Algo salió mal...");
	}


    public void agregarAdministrador(String user, String pass, String nombreCompleto) {
        this.administradores.add(new Administrador(user, pass, nombreCompleto));
    }


    public void agregarPropietario(String user, String pass, String nombreCompleto) {
        this.propietarios.add(new Propietario(user, pass, nombreCompleto));
    }

}
