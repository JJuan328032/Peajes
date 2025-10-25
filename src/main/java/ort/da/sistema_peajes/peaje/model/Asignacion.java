package ort.da.sistema_peajes.peaje.model;

import java.util.Date;
import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;

public class Asignacion {

	private Puesto puesto;

	private Bonificacion bonificacion;

	private Date fecha;


	public String getPuestoNombre() {
		return this.puesto.getNombre();
	}

	public String getBonificacionNombre() {
		return this.bonificacion.getNombre();
	}

	public Date getFecha() {
		return this.fecha;
	}

}
