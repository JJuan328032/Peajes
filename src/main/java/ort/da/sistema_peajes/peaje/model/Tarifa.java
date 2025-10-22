package ort.da.sistema_peajes.peaje.model;

public class Tarifa {
    private int monto;
    private CategoriaVehiculos categoria;

    public Tarifa(int monto, String nombreCategoria) {
        this.monto = monto;
        this.categoria = new CategoriaVehiculos(nombreCategoria);
    }

    public int getMonto() {
        return monto;
    }

    public CategoriaVehiculos getCategoria() {
        return categoria;
    }
}
