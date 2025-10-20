package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Vehiculo;

public class SistemaVehiculos {

	private ArrayList<Vehiculo> vehiculos;

	public SistemaVehiculos() {
		this.vehiculos = new ArrayList<>();
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	public Vehiculo buscarVehiculoPorPatente(String matricula) {
		for (Vehiculo vehiculo : vehiculos) if (vehiculo.igualPatente(matricula)) return vehiculo;
		return null;
	}

}
