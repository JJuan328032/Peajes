package ort.da.sistema_peajes.peaje.dto;

public class PropietarioDTO {

    private String user;
    private String pass;

    private String nombreCompleto;
    private String estado;
    private int saldo;

    public PropietarioDTO(String nombreCompleto, String estado, int saldo) {
        this.nombreCompleto = nombreCompleto;
        this.estado = estado;
        this.saldo = saldo;
    }

    public PropietarioDTO(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }


    public String getUser() {
        return user;
    }
    public String getPass() {
        return pass;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getEstado() {
        return estado;
    }
    public int getSaldo() {
        return saldo;
    }

}
