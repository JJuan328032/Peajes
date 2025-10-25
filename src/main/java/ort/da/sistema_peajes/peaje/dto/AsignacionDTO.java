package ort.da.sistema_peajes.peaje.dto;

import java.time.LocalDate;


public class AsignacionDTO {
    private String puesto;
	private String bonificacion;
	private LocalDate fecha;

	public AsignacionDTO(String puesto, String bonificacion, LocalDate fecha) {
		this.puesto = puesto;
		this.bonificacion = bonificacion;
		this.fecha = fecha;
	}

	public String getPuesto() {
		return puesto;
	}
	public String getBonificacion() {
		return bonificacion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
}
