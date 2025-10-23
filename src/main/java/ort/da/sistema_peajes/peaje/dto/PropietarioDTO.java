package ort.da.sistema_peajes.peaje.dto;

public class PropietarioDTO {
    private String nombreCompleto;
    private String estado;
    private int saldo;

    public PropietarioDTO(String nombreCompleto, String estado, int saldo) {
        this.nombreCompleto = nombreCompleto;
        this.estado = estado;
        this.saldo = saldo;
    }
}
