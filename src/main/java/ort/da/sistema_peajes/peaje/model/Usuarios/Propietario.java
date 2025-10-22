package ort.da.sistema_peajes.peaje.model.Usuarios;

import ort.da.sistema_peajes.peaje.model.Vehiculo;
import ort.da.sistema_peajes.peaje.model.Estados.EstadoPropietario;
import ort.da.sistema_peajes.peaje.model.Estados.Habilitado;
import ort.da.sistema_peajes.peaje.model.Registro;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.model.Asignacion;

public class Propietario extends Usuario {

	private int saldo;

	private int saldoMinimo;

	private ArrayList<Vehiculo> vehiculo;
	private ArrayList<Registro> registros;
	private ArrayList<Asignacion> asignacion;

	private EstadoPropietario estadoPropietario;


	public Propietario(String cedula, String password, String nombreCompleto) {
        super(cedula, password, nombreCompleto);
        this.vehiculo = new ArrayList<>();
        this.registros = new ArrayList<>();
        this.asignacion = new ArrayList<>();
        this.saldo = 0;
        this.saldoMinimo = 1000;
        this.estadoPropietario = new Habilitado(this);
    }


    public String getEstado() {
        return null;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoMinimo() {
        return this.saldoMinimo;
    }

    public void setSaldoMinimo(int saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return this.vehiculo;
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return this.asignacion;
    }

    public EstadoPropietario getEstadoPropietario() {
        return this.estadoPropietario;
    }

    public void setEstadoPropietario(EstadoPropietario estadoPropietario) {
        this.estadoPropietario = estadoPropietario;
    }

    public void agregarVehiculo(Vehiculo v) {
        this.vehiculo.add(v);
    }

    public void agregarRegistro(Registro r) {
        this.registros.add(r);
    }

    public void agregarAsignacion(Asignacion a) {
        this.asignacion.add(a);
    }

}
