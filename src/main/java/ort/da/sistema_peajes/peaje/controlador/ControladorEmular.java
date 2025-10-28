package ort.da.sistema_peajes.peaje.controlador;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ort.da.sistema_peajes.Respuesta;
import ort.da.sistema_peajes.peaje.dto.mappers.MapperTransito;
import ort.da.sistema_peajes.peaje.exceptions.EstadoException;
import ort.da.sistema_peajes.peaje.exceptions.SaldoException;
import ort.da.sistema_peajes.peaje.exceptions.VehiculoException;
import ort.da.sistema_peajes.peaje.model.Puesto;
import ort.da.sistema_peajes.peaje.service.Fachada;



@RestController
@RequestMapping("/emular")
public class ControladorEmular {

    //private Puesto puesto; guardamos el puesto? 

    @PostMapping("/inicio")
    public List<Respuesta> inicializar(){

        return Respuesta.lista(puestos());
    }

    @PostMapping("/tarifas")
    public List<Respuesta> tarifasSegunPuesto(@RequestParam String nombre){

        return Respuesta.lista(tarifas(nombre));
    }

    @PostMapping("/transito")
    public List<Respuesta> emularTransito(@RequestParam String puesto, @RequestParam String matricula, @RequestParam LocalDateTime fechaHora) throws SaldoException, EstadoException, VehiculoException{
        

        //Se debe retornar
        //
        //Propietario: Usuario.nombreCompleto
        //Catergoria: Vehiculo.categoria
        //Bonificacion: Asignacion.bonificacion
        //Costo del Transito: segun la tarifa del puesto y el vehiculo
        //Saldo luego del Transito: Propietario.saldo

        //Propietario, Vehiculo, Asignacion, int : InfoTransito

        //a partir del vehiculo, obtener tarifa a cobrar. Mandar informacion a cobrar tomando en cuenta que puede existir bonificacion.
        //Quién es responsable de realizar el transito?
        
        return Respuesta.lista(new Respuesta("transitoEmulado", MapperTransito.toDTO(Fachada.getInstancia().emularTransito(puesto, matricula, fechaHora))));
    }

    private Respuesta puestos() {
        return new Respuesta("puestos", Fachada.getInstancia().getPuestos());
    }

    private Respuesta tarifas(String nombre){
        return new Respuesta("tarifas", Fachada.getInstancia().obtenerTarifasPorPuestoNombre(nombre));
    }
}
