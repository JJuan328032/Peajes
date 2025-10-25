package ort.da.sistema_peajes.peaje.model;

public class InfoVehiculo {

    private Vehiculo vehiculo;
    private int cantidadRegistros;
    private double montoTotal;

    public InfoVehiculo(Vehiculo vehiculo, int cantidadRegistros, double montoTotal) {
        this.vehiculo = vehiculo;
        this.cantidadRegistros = cantidadRegistros;
        this.montoTotal = montoTotal;
    }

    public Vehiculo getVehiculo() { return vehiculo; }
    public int getCantidadRegistros() { return cantidadRegistros; }
    public double getMontoTotal() { return montoTotal; }


}
