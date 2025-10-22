package ort.da.sistema_peajes.peaje.model;

public class Vehiculo {

	private String matricula;
	private String modelo;
	private String color;
	private CategoriaVehiculos categoria;

	public Vehiculo(String matricula, String modelo, String color, String nombreCategoria) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
		this.categoria = new CategoriaVehiculos(nombreCategoria);
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public CategoriaVehiculos getCategoria() {
		return categoria;
	}

    public boolean igualPatente(String matricula) {
        return this.matricula.equalsIgnoreCase(matricula);
    }

}
