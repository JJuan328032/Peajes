package ort.da.sistema_peajes.peaje.model;


import java.time.LocalDateTime;

import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;

public class Registro {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private LocalDateTime fecha;
    
    private String tarifa;
    private int montoTarifa;

    private int montoBonificado;
    private Bonificacion bonificacion;

    private int montoPagado;

    public Registro(Puesto puesto, Vehiculo vehiculo, LocalDateTime fecha, Tarifa tarifa) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.tarifa = tarifa.getTipo();
        this.montoTarifa = tarifa.getMonto();
    }


    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getMontoBonificado() {
        return montoBonificado;
    }

    public void setMontoBonificado(int montoBonificado) {
        this.montoBonificado = montoBonificado;
    }

    public Bonificacion getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Bonificacion bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public String getMatricula() {
        return this.vehiculo.getMatricula();
    }

    public String getTipoTarifa() {
        return this.tarifa;
    }

    public int getMontoTarifa() {
        return this.montoTarifa;
    }

    
    public String getNombreBonificacion() {
        if (this.bonificacion == null) {
            return "Ninguna";
        }

        return this.bonificacion.getNombre();
    }

    public int getMontoBonificacion() {
        return this.montoBonificado;
    }

    public String getPuestoNombre() {
        return this.puesto.getNombre();
    }


    public void setMontoPagado(int i) {
        this.montoPagado = i;
    }

    public String toString() {
        return "Registro [puesto=" + puesto.getNombre() + ", vehiculo=" + vehiculo.getMatricula() + ", fecha=" + fecha.toLocalDate()
                + ", hora=" + fecha.toLocalTime() + ", tarifa=" + tarifa + ", montoTarifa=" + montoTarifa + ", montoBonificado="
                + montoBonificado + ", bonificacion=" + (bonificacion != null ? bonificacion.getNombre() : "N/A") 
                + ", montoPagado=" + montoPagado + "]";
    }
}
