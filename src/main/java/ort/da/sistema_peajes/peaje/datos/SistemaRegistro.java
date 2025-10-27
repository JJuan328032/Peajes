package ort.da.sistema_peajes.peaje.datos;

import java.time.LocalDateTime;
import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Registro;
import ort.da.sistema_peajes.peaje.model.Vehiculo;

public class SistemaRegistro {

	private ArrayList<Registro> registros;

	public SistemaRegistro() {
		this.registros = new ArrayList<>();
	}

	public void agregarRegistro(Registro registro) {
		this.registros.add(registro);
	}

	public ArrayList<Registro> getRegistros() {
		return this.registros;
	}

	public void emularTransito(Vehiculo v, LocalDateTime fechaHora, int tarifaACobrar) {
		//TODO
		
	}

	public void realizarTransito(){
		//TODO
	}
}
