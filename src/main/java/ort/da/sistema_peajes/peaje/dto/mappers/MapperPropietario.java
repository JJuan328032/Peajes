package ort.da.sistema_peajes.peaje.dto.mappers;


import java.util.ArrayList;


import ort.da.sistema_peajes.peaje.dto.PropietarioDTO;
import ort.da.sistema_peajes.peaje.model.Usuarios.Propietario;

public class MapperPropietario {

    public static PropietarioDTO toDTO(Propietario p) {
        return new PropietarioDTO(p.getNombreCompleto(), p.getEstado(), p.getSaldo());
    }

    public static ArrayList<PropietarioDTO> toDTOList(ArrayList<Propietario> usuarios) {
        ArrayList<PropietarioDTO> dtoList = new ArrayList<>();
        for (Propietario p : usuarios) {
            dtoList.add(toDTO(p));
        }

        return dtoList;
    }
}
