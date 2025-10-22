package ort.da.sistema_peajes.peaje.model.Usuarios;

import ort.da.sistema_peajes.peaje.model.Vehiculo;
import ort.da.sistema_peajes.peaje.model.Estados.EstadoPropietario;
import ort.da.sistema_peajes.peaje.model.Estados.Habilitado;
import ort.da.sistema_peajes.peaje.model.Registro;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Asignacion;

public class Propietario extends Usuario {

	private int saldo;

	private int saldoMinimo;

	private ArrayList<Vehiculo> vehiculo;
	private ArrayList<Registro> registros;
	private ArrayList<Asignacion> asignacion;

	private EstadoPropietario estadoPropietario;


	public Propietario(String cedula, String password, String nombreCompleto) {
		super(cedula, password, nombreCompleto);
	}


    public String getEstado() {
        return null;
    }

	public int getSaldo() {
		return this.saldo;
	}


	@Override
	public void Validar() throws EstadoException, LoginException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'Validar'");
	}

}
