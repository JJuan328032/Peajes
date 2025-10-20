package ort.da.sistema_peajes.peaje.model.Usuarios;

public abstract class Usuario {

	private String cedula;
	private String password;
	private String nombreCompleto;


	public Usuario(String cedula, String password, String nombreCompleto) {
		this.cedula = cedula;
		this.password = password;
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * return this.nombreCompleto;
	 */
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

    public boolean validarCredenciales(String usuario, String password) {
		return this.cedula.equals(usuario) && this.password.equals(password);
	}

}
