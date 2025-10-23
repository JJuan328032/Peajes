package ort.da.sistema_peajes.peaje.dto;

public class VehiculoDTO {

    private String matricula;
    private String modelo;
    private String color;

    private int transitos;
    private double montoTotal;

    public VehiculoDTO(String matricula, String modelo, String color, int transitos, double montoTotal) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.transitos = transitos;
        this.montoTotal = montoTotal;
    }
}
