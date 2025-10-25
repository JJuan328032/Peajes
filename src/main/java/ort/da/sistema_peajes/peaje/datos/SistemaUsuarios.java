package ort.da.sistema_peajes.peaje.datos;

import ort.da.sistema_peajes.peaje.model.Usuarios.Usuario;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;
import ort.da.sistema_peajes.peaje.dto.PropietarioDTO;
import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Usuarios.Administrador;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import org.springframework.aop.framework.ProxyProcessorSupport;


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
		Administrador administrador = login(usuario, password, administradores);
		administrador.setLogged(true);
		
		return administrador;
	}

    public void agregarAdministrador(String user, String pass, String nombreCompleto) {
        this.administradores.add(new Administrador(user, pass, nombreCompleto));
    }


    public Propietario agregarPropietario(String user, String pass, String nombreCompleto) {
		Propietario p = new Propietario(user, pass, nombreCompleto);
        this.propietarios.add(p);

		return p;
    }


	private <T extends Usuario> T login(String usuario, String password, ArrayList<T> lista) throws LoginException, EstadoException{

		T u = buscarUsuario(new PropietarioDTO(usuario, password), lista);
		u.Validar();

		return u;
	}

	public <T extends Usuario> T buscarUsuario(PropietarioDTO dto, ArrayList<T> lista) throws LoginException, EstadoException{
		for (T u : lista) 
			if (u.validarCredenciales(dto.getUser(), dto.getPass())) {
				return u;
			}

		throw new LoginException("Algo salió mal...");
	}


    public Propietario buscarPropietario(Propietario prop) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPropietario'");
    }


	/* 
    public Propietario obtenerPropietario(String user, String pass) throws EstadoException, LoginException {
        for(Propietario p : this.propietarios) {
			if(p.validarCredenciales(user, pass)) {
				return p;
			}
		}

		return null;
    }
	*/

}
