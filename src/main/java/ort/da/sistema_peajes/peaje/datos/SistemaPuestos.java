package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Puesto;

public class SistemaPuestos {

	private ArrayList<Puesto> puestos;

	public SistemaPuestos() {
		this.puestos = new ArrayList<>();
	}

	public void agregarPuesto(Puesto puesto) {
		this.puestos.add(puesto);
	}

	public ArrayList<Puesto> getPuestos() {
		return this.puestos;
	}
}
