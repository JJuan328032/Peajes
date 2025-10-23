package ort.da.sistema_peajes.peaje.dto;

import java.util.Date;


public class AsignacionDTO {
    private String puesto;

	private String bonificacion;

	private Date fecha;

	public AsignacionDTO(String puesto, String bonificacion, Date fecha) {
		this.puesto = puesto;
		this.bonificacion = bonificacion;
		this.fecha = fecha;
	}
}
