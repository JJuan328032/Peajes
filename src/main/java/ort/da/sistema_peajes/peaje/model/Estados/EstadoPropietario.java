package ort.da.sistema_peajes.peaje.model.Estados;

import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public abstract class EstadoPropietario {

    @SuppressWarnings("unused")
    private Propietario propietario;

    public EstadoPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    

    public boolean mismoEstado(EstadoPropietario estado) {
        return this.getClass().equals(estado.getClass());
    }

    public abstract boolean puedeEntrar() throws EstadoException;

    public abstract void habilitado() throws EstadoException;
    public abstract void suspendido() throws EstadoException;
    public abstract void penalizado() throws EstadoException;
    public abstract void deshabilitado() throws EstadoException;


}
