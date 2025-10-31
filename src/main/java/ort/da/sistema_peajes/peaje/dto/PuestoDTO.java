package ort.da.sistema_peajes.peaje.dto;

public class PuestoDTO {
    private String nombre;

    public PuestoDTO(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){ return this.nombre;}
}
