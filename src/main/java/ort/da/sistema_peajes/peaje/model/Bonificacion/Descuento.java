package ort.da.sistema_peajes.peaje.model.Bonificacion;

public class Descuento extends Bonificacion {

	private double porcentaje;

	public Descuento(double porcentaje, String nombre) {
		super(nombre);
		this.porcentaje = porcentaje;
	}

	public double getPorcentaje() {
		return porcentaje;
	}


	public int calcular(int monto) {
		return monto - (int) (monto * (porcentaje / 100));
	}
}
