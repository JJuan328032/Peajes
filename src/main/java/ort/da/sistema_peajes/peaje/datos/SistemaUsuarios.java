package ort.da.sistema_peajes.peaje.datos;

import ort.da.sistema_peajes.peaje.model.Usuarios.Usuario;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;
import ort.da.sistema_peajes.peaje.model.Usuarios.Administrador;

import java.util.ArrayList;


public class SistemaUsuarios {

	private ArrayList<Propietario> propietarios;
	private ArrayList<Administrador> administradores;


	public SistemaUsuarios() {
		this.propietarios = new ArrayList<>();
		this.administradores = new ArrayList<>();
	}


	

	public Propietario loginPropietario(String usuario, String password) {
		return login(usuario, password, this.propietarios);
	}


	public Administrador loginAdministrador(String usuario, String password) {
		return login(usuario, password, administradores);
	}

	private <T extends Usuario> T login(String usuario, String password, ArrayList<T> lista) {
    for (T u : lista) {
        if (u.validarCredenciales(usuario, password)) {
            return u;
        }
    }
    return null;
}


}
