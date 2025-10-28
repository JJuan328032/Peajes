package ort.da.sistema_peajes.peaje.model;

import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public class InfoTransito {
    
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Asignacion asignacion;
    private int montoTransito;

    public InfoTransito(Puesto puesto, Vehiculo vehiculo, Asignacion asignacion, int montoTransito) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.asignacion = asignacion;
        this.montoTransito = montoTransito;
    }

    public Puesto getPuesto(){
        return this.puesto;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Asignacion getAsignacion() {
        return asignacion;
    }
    public int getMontoTransito() {
        return montoTransito;
    }
    public Propietario getPropietario() {
        return this.vehiculo.getPropietario();
    }

}
