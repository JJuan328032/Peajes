package ort.da.sistema_peajes.peaje.model.Bonificacion;


public abstract class Bonificacion {

	private String nombre;

	public Bonificacion(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
