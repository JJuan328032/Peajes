package ort.da.sistema_peajes.peaje.model;

import java.util.Date;
import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;

public class Registro {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Date fecha;
    private int montoBonificado;
    private Tarifa tarifa;
    private Bonificacion bonificacion;

    public Registro(Puesto puesto, Vehiculo vehiculo, Date fecha) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.montoBonificado = 0;
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
}
