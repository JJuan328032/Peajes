package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;
import ort.da.sistema_peajes.peaje.model.Registro;

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
}
