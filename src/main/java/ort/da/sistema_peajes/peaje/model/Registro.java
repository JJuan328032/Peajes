package ort.da.sistema_peajes.peaje.model;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;

public class Registro {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Date fecha;
    private Time hora;
    
    private String tarifa;
    private int montoTarifa;

    private int montoBonificado;
    private Bonificacion bonificacion;

    private int montoPagado;

    public Registro(Puesto puesto, Vehiculo vehiculo, Date fecha, Time hora, Tarifa tarifa) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.hora = hora;
        this.tarifa = tarifa.getTipo();
        this.montoTarifa = tarifa.getMonto();
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora(){
        return this.hora; 
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMatricula'");
    }

    public String getTipoTarifa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoTarifa'");
    }

    public int getMontoTarifa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMontoTarifa'");
    }

    public String getTipoBonificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipoBonificacion'");
    }

    public int getMontoBonificacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMontoBonificacion'");
    }

    public String getPuestoNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPuestoNombre'");
    }
}
