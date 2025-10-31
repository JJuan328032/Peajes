package ort.da.sistema_peajes.peaje.datos;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Bonificacion.*;

public class SistemaBonificaciones {
    // Implementación del sistema de bonificaciones
    private ArrayList<Bonificacion> bonificaciones;

    public SistemaBonificaciones() {
        this.bonificaciones = new ArrayList<>();
    }

    public void agregarBonificacion(Bonificacion bonificacion) {
        this.bonificaciones.add(bonificacion);
    } 

    public ArrayList<Bonificacion> getBonificaciones() {
        return bonificaciones;
    }

}
    