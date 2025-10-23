package ort.da.sistema_peajes.peaje.dto.mappers;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.dto.AsignacionDTO;
import ort.da.sistema_peajes.peaje.model.Asignacion;

public class MapperAsignacion {

    public static ArrayList<AsignacionDTO> toDTOList(ArrayList<Asignacion> asignaciones) {
        ArrayList<AsignacionDTO> dtoList = new ArrayList<>();

        for (Asignacion a : asignaciones) {
            // Suponiendo que hay una clase MapperAsignacionDTO para mapear cada Asignacion a su DTO
            AsignacionDTO dto = new AsignacionDTO(a.getPuestoNombre(), a.getBonificacionNombre(), a.getFecha());
            dtoList.add(dto);
        }

        return dtoList;
    }

    public static AsignacionDTO toDTO(Asignacion asignacion) {
        return new AsignacionDTO(asignacion.getPuestoNombre(), asignacion.getBonificacionNombre(), asignacion.getFecha());
    }

}
