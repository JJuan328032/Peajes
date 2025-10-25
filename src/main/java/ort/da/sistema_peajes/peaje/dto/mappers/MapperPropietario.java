package ort.da.sistema_peajes.peaje.dto.mappers;

import ort.da.sistema_peajes.peaje.dto.PropietarioDTO;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public class MapperPropietario {
    
    public static PropietarioDTO toDTO(Propietario propietario) {
        return new PropietarioDTO(propietario.getNombreCompleto(), propietario.getEstado(), propietario.getSaldo());
    }
}