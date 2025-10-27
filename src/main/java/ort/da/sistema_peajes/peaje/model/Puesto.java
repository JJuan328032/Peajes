package ort.da.sistema_peajes.peaje.model;

import java.util.ArrayList;
import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;

public class Puesto {
	private String nombre;
	private String direccion;
	private ArrayList<Tarifa> tarifas;
	private ArrayList<Bonificacion> bonificaciones;

	public Puesto(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.tarifas = new ArrayList<>();
		this.bonificaciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void agregarTarifa(Tarifa tarifa) {
		this.tarifas.add(tarifa);
	}

	public ArrayList<Tarifa> getTarifas() {
		return tarifas;
	}

	public void agregarBonificacion(Bonificacion bonificacion) {
		this.bonificaciones.add(bonificacion);
	}

	public ArrayList<Bonificacion> getBonificaciones() {
		return bonificaciones;
	}

    public void setTarifas(ArrayList<Tarifa> nuevasTarifas) {
        this.tarifas.addAll(nuevasTarifas);
    }

	public int obtenerMontoTarifaSegunVehiculo(Vehiculo vehiculo) {
		return this.obtenerTarifaSegunCategoriaVehiculo(vehiculo).getMonto();
	}

	private Tarifa obtenerTarifaSegunCategoriaVehiculo(Vehiculo vehiculo) {
		for (Tarifa tarifa : this.tarifas) {
			if (tarifa.mismaCategoria(vehiculo.getCategoria())) {
				return tarifa;
			}
		}

		return null;
	}
}
