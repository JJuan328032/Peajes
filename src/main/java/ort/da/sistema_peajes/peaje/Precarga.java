package ort.da.sistema_peajes.peaje;

import ort.da.sistema_peajes.peaje.service.Fachada;

public class Precarga {
    public static void cargar() {
        // Lógica para precargar datos en el sistema

        Fachada fachada = Fachada.getInstancia();

        //Admins
        fachada.agregarAdministrador("a", "a", "a");


        //Propietarios
        fachada.agregarPropietario("p", "p", "p");




    }
}
