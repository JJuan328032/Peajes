package ort.da.sistema_peajes.peaje.controlador;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ort.da.sistema_peajes.Respuesta;
import ort.da.sistema_peajes.peaje.dto.PropietarioDTO;
import ort.da.sistema_peajes.peaje.dto.VehiculoDTO;
import ort.da.sistema_peajes.peaje.dto.RegistroDTO;

@RestController
@RequestMapping("/tablero")
public class ControladorMockTablero {

    @PostMapping("/informacion/mock")
    public List<Respuesta> iniciarTableroMock() {
        // Propietario ejemplo
        PropietarioDTO p = new PropietarioDTO("Juan Perez", "Habilitado", 2500);

        // Vehículos ejemplo
        List<VehiculoDTO> vehs = new ArrayList<>();
        vehs.add(new VehiculoDTO("ABC-123", "Toyota Corolla", "Blanco", 3, 300.0));
        vehs.add(new VehiculoDTO("XYZ-999", "Ford Fiesta", "Azul", 1, 50.0));

        // Tránsitos ejemplo
        List<RegistroDTO> regs = new ArrayList<>();
        Date hoy = new Date(System.currentTimeMillis());
        Time ahora = new Time(System.currentTimeMillis());
        regs.add(new RegistroDTO("Puesto A", "ABC-123", "Tarifa A", 100, "Bonif A", 10, 90, hoy, ahora));
        regs.add(new RegistroDTO("Puesto B", "XYZ-999", "Tarifa B", 50, "", 0, 50, hoy, ahora));

        // Asignaciones / bonificaciones ejemplo (lista de mapas simples)
        List<HashMap<String,Object>> asigns = new ArrayList<>();
        HashMap<String,Object> a1 = new HashMap<>();
        a1.put("tipo", "Descuento");
        a1.put("descuento", 20);
        a1.put("estado", "Activa");
        a1.put("vehiculo", "ABC-123");
        asigns.add(a1);

        return Respuesta.lista(
            new Respuesta("propietario", p),
            new Respuesta("vehiculos", vehs),
            new Respuesta("transitosRealizados", regs),
            new Respuesta("asignaciones", asigns)
        );
    }
}
