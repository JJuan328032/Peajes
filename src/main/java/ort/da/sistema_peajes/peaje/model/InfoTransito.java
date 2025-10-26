package ort.da.sistema_peajes.peaje.model;

import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public class InfoTransito {
    Propietario propietario;
    Vehiculo vehiculo;
    Asignacion asignacion;
    int montoTransito;

    public InfoTransito(Propietario propietario, Vehiculo vehiculo, Asignacion asignacion, int montoTransito) {
        this.propietario = propietario;
        this.vehiculo = vehiculo;
        this.asignacion = asignacion;
        this.montoTransito = montoTransito;
    }

    public Propietario getPropietario() {
        return propietario;
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
}
