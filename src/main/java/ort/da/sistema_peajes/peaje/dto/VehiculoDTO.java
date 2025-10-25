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

    public String getMatricula() {
        return this.matricula;
    }
    public String getModelo() {
        return this.modelo;
    }
    public String getColor() {
        return this.color;
    }
    public int getTransitos() {
        return this.transitos;
    }
    public double getMontoTotal() {
        return this.montoTotal;
    }
}
