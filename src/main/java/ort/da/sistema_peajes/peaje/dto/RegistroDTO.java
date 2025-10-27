package ort.da.sistema_peajes.peaje.dto;

import java.time.LocalDateTime;

public class RegistroDTO {
    private String puesto;
    private String matricula;
    private String tarifa;
    private int montoTarifa;
    private String bonificacion;
    private int montoBonificacion;
    private int montoPagado;
    private LocalDateTime fecha;

    public RegistroDTO(String puesto, String matricula, String tarifa, int montoTarifa, String bonificacion,
            int montoBonificacion, int montoPagado, LocalDateTime fecha) {
        this.puesto = puesto;
        this.matricula = matricula;
        this.tarifa = tarifa;
        this.montoTarifa = montoTarifa;
        this.bonificacion = bonificacion;
        this.montoBonificacion = montoBonificacion;
        this.montoPagado = montoPagado;
        this.fecha = fecha;
    }

    public String getPuesto() {
        return puesto;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getTarifa() {
        return tarifa;
    }
    public int getMontoTarifa() {
        return montoTarifa;
    }
    public String getBonificacion() {
        return bonificacion;
    }
    public int getMontoBonificacion() {
        return montoBonificacion;
    }
    public int getMontoPagado() {
        return montoPagado;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    
}
