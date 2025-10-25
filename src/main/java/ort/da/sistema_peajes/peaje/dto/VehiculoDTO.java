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
    
    // Getters para serialización JSON
    public String getMatricula() { return matricula; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public int getTransitos() { return transitos; }
    public double getMontoTotal() { return montoTotal; }
}
