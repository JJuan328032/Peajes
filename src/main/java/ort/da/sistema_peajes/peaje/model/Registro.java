package ort.da.sistema_peajes.peaje.model;

import java.time.LocalDateTime;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.exceptions.SaldoException;

public class Registro {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private LocalDateTime fecha;
    
    private String tarifa;
    private int montoTarifa;

    private int montoBonificado;
    private String bonificacion;

    private int montoPagado;

    public Registro(Puesto puesto, Vehiculo vehiculo, LocalDateTime fecha, Tarifa tarifa) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.tarifa = tarifa.getTipo();
        this.montoTarifa = tarifa.getMonto();
        this.montoBonificado = 0;
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

    public void setBonificacion(String b){
        this.bonificacion = b;
    }

    public void setMontoBonificado(int montoBonificado) {
        this.montoBonificado = montoBonificado;
    }

    public String getBonificacion() {
        return bonificacion;
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


    public int getMontoBonificacion() {
        return this.montoBonificado;
    }

    public String getPuestoNombre() {
        return this.puesto.getNombre();
    }


    public void setMontoPagado() {
        this.montoPagado = this.montoTarifa - this.montoBonificado;
    }

    public String toString() {
        return "Registro [puesto=" + puesto.getNombre() + ", vehiculo=" + vehiculo.getMatricula() + ", fecha=" + fecha.toLocalDate()
                + ", hora=" + fecha.toLocalTime() + ", tarifa=" + tarifa + ", montoTarifa=" + montoTarifa + ", montoBonificado="
                + montoBonificado + ", bonificacion=" + (bonificacion != null ? bonificacion : "N/A") 
                + ", montoPagado=" + montoPagado + "]";
    }


    public Asignacion cobrar() throws SaldoException, EstadoException{
        //hay bonificaciones?
        //  preguntar a Propietario

        //Como es el propietario que sabe si tiene una bonificacion en un Puesto, no puedo hacer todo el calculo desde Registro con el diseño actual
        return this.getVehiculo().realizarPago(this);
    }


    public int calcularPrecioFinal() {
        return this.montoTarifa - this.montoBonificado;
    }
}
