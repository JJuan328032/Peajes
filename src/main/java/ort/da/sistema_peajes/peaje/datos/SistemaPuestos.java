package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.exceptions.PuestoException;
import ort.da.sistema_peajes.peaje.model.Puesto;
import ort.da.sistema_peajes.peaje.model.Tarifa;
import ort.da.sistema_peajes.peaje.model.Vehiculo;

public class SistemaPuestos {

	private ArrayList<Puesto> puestos;

	public SistemaPuestos() {
		this.puestos = new ArrayList<>();
	}

	public void agregarPuesto(Puesto puesto) throws PuestoException {
		if(this.obtenerPuestoPorNombre(puesto.getNombre()) == null) this.puestos.add(puesto);
		else throw new PuestoException("Ya existe el Puesto con nombre: " + puesto.getNombre());
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

    public int obtenerTarifaSegunPuestoYVehiculo(String puesto, Vehiculo vehiculo) {
        return this.obtenerPuestoPorNombre(puesto).obtenerMontoTarifaSegunVehiculo(vehiculo);
    }
}
