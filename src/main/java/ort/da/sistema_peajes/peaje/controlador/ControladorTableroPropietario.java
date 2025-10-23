package ort.da.sistema_peajes.peaje.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import ort.da.sistema_peajes.Respuesta;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

@RestController
@RequestMapping("/tablero")

public class ControladorTableroPropietario {

    @PostMapping("/informacion")
    public List<Respuesta> iniciarTablero(@SessionAttribute(name = "propietario") Propietario p){

        return Respuesta.lista(
            propietario(p),
            asignaciones(p),
            vehiculos(p),
            transitosRealizados(p)
            );
    }
    

    private Respuesta propietario(Propietario p){
        return new Respuesta("propietario", p.mandarDatos());
    }

    //Lista de Asignaciones de Peajes del Propietario - Bonificacion, Puesto, FechaAsignada
    private Respuesta asignaciones(Propietario p){
        return new Respuesta("asignaciones", p.getAsignaciones());
    }

    //Vehiculos del Propietario - Matricula, Modelo, Color, Transitos, MontoTotal
    private Respuesta vehiculos(Propietario p){
        return new Respuesta("vehiculos", p.obtenerInfoVehiculos());
    }

    //SE PUEDE OPTIMIZAR? 
    //PODEMOS MANDAR DOS LISTAS EN UN SOLO OBJETO RESPUESTA?


    //Transitos Realizados - Puesto, Matricula, Tarifa, MontoTarifa, Bonificacion, MontoBonificacion, MontoPagado, Fecha, Hora
    private Respuesta transitosRealizados(Propietario p){
        return new Respuesta("transitosRealizados", p.obtenerRegistros());
    }


}
