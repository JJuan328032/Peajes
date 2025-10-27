package ort.da.sistema_peajes.peaje.model;

import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public class InfoTransito {
    
    Vehiculo vehiculo;
    Asignacion asignacion;
    int montoTransito;

    public InfoTransito(Vehiculo vehiculo, Asignacion asignacion, int montoTransito) {
        this.vehiculo = vehiculo;
        this.asignacion = asignacion;
        this.montoTransito = montoTransito;
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
