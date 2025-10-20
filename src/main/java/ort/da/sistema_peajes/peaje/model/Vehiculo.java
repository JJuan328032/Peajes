package ort.da.sistema_peajes.peaje.model;

public class Vehiculo {

	private String matricula;

	private String modelo;

	private String color;

	private CategoriaVehiculos categoria;

	private CategoriaVehiculos categoriaVehiculos;

	private Vehiculo vehiculo;

	private Registro registro;

    public boolean igualPatente(String matricula) {
        return this.matricula.equalsIgnoreCase(matricula);
    }

}
