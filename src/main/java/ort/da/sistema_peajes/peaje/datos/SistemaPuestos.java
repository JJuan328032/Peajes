package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Puesto;
import ort.da.sistema_peajes.peaje.model.Tarifa;

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

    public Puesto obtenerPuestoPorNombre(String nombre) {
		for (Puesto p : puestos) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}

		return null;
    }

    public ArrayList<Tarifa> obtenerTarifasPorPuestoNombre(String nombre) {
        return obtenerPuestoPorNombre(nombre).getTarifas();
    }
}
