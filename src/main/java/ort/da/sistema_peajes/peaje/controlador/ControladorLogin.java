package ort.da.sistema_peajes.peaje.controlador;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import ort.da.sistema_peajes.Respuesta;
import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.model.Usuarios.Administrador;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;
import ort.da.sistema_peajes.peaje.service.Fachada;

@RestController
@RequestMapping("/acceso")

public class ControladorLogin {

    @PostMapping("/loginPropietario")
    public List<Respuesta> loginPropietario(HttpSession sesionHttp, @RequestBody String user, @RequestBody String pass) throws LoginException, EstadoException {
        // Lógica para autenticar al propietario

        Propietario p = Fachada.getInstancia().loginPropietario(user, pass);

        sesionHttp.setAttribute("propietario", p);
        return Respuesta.lista(new Respuesta("LoginExitoso", "tablero_control_propietario.html"));
    }

    @PostMapping("/loginAdministrador")
    public List<Respuesta> loginAdministrador(HttpSession sesionHttp, @RequestBody String user, @RequestBody String pass) throws LoginException, EstadoException{
        // Lógica para autenticar al propietario

        Administrador a = Fachada.getInstancia().loginAdministrador(user, pass);

        sesionHttp.setAttribute("administrador", a);
        return Respuesta.lista(new Respuesta("Login Exitoso", "menu_administrador.html"));

    }
}