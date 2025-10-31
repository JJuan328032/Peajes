package ort.da.sistema_peajes.peaje.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import ort.da.sistema_peajes.Respuesta;
import ort.da.sistema_peajes.peaje.dto.PropietarioDTO;
import ort.da.sistema_peajes.peaje.model.Puesto;
import ort.da.sistema_peajes.peaje.model.Bonificacion.Bonificacion;
import ort.da.sistema_peajes.peaje.model.Usuarios.Administrador;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;
import ort.da.sistema_peajes.peaje.service.Fachada;

@RestController
@RequestMapping("/bonificaciones")
public class ControladorAsignarBonificaciones {

    // Obtener bonificaciones y puestos para llenar los dropdowns
    @PostMapping("/opciones")
    public List<Respuesta> obtenerOpciones(HttpSession sesionHttp) {
        // Verifico que haya un administrador logueado
        Administrador admin = (Administrador) sesionHttp.getAttribute("administrador");
        if (admin == null) {
            return Respuesta.lista(new Respuesta("Error", "No tiene permisos o la sesión expiró"));
        }

        // Obtengo bonificaciones y puestos desde Fachada

        List<Bonificacion> listaBonificaciones = Fachada.getInstancia().obtenerBonificaciones();
        List<Puesto> listaPuestos = Fachada.getInstancia().obtenerPuestos();
        

        // Devuelvo los datos en formato esperado
        return Respuesta.lista(
                new Respuesta("bonificacionesDefinidas", listaBonificaciones),
                new Respuesta("puestosDefinidos", listaPuestos)
        );
    }

    /*// Buscar propietario por cédula
    @PostMapping("/propietario/buscar")
    public List<Respuesta> buscarPropietario(@RequestParam String cedula, HttpSession sesionHttp) {
        Administrador admin = (Administrador) sesionHttp.getAttribute("administrador");
        if (admin == null) {
            return Respuesta.lista(new Respuesta("Error", "No tiene permisos o la sesión expiró"));
        }

        // Buscar el propietario desde la fachada
        Propietario encontrado = Fachada.getInstancia().buscarPropietarioPorCedula(cedula);
        if (encontrado == null) {
            return Respuesta.lista(new Respuesta("Error", "No se encontró un propietario con esa cédula."));
        }

        // Obtener sus bonificaciones actuales
        List<Bonificacion> bonificacionesDTO = Fachada.getInstancia().obtenerBonificacionesDePropietario(encontrado);

        return Respuesta.lista(
                new Respuesta("propietario", encontrado),
                new Respuesta("bonificaciones", bonificacionesDTO)
        );
    }

    //  Asignar bonificaciones a un propietario en determinados puestos
    @PostMapping("/asignar")
    public Respuesta asignarBonificaciones(
            @RequestParam String cedulaPropietario,
            @RequestParam List<Integer> idsBonificaciones,
            @RequestParam List<Integer> idsPuestos,
            HttpSession sesionHttp) {

        Administrador admin = (Administrador) sesionHttp.getAttribute("administrador");
        if (admin == null) {
            return new Respuesta("Error", "No tiene permisos o la sesión expiró");
        }

        // Buscar propietario
        Propietario propietario = Fachada.getInstancia().buscarPropietarioPorCedula(cedulaPropietario);
        if (ropietario == null) {
            return new Respuesta("Error", "No se encontró el propietario indicado");
        }

        // Asignar bonificaciones mediante la lógica de Fachada
        boolean exito = Fachada.getInstancia().asignarBonificaciones(propietario, idsBonificaciones, idsPuestos);
        if (!exito) {
            return new Respuesta("Error", "Hubo un problema al asignar las bonificaciones");
        }

        return new Respuesta("mensaje", "Bonificaciones asignadas correctamente."); 
    }*/
}
