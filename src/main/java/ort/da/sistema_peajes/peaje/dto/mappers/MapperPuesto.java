package ort.da.sistema_peajes.peaje.dto.mappers;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.dto.PuestoDTO;
import ort.da.sistema_peajes.peaje.model.Puesto;

public class MapperPuesto {

    public static PuestoDTO toDTO(String nommbre){
        return new PuestoDTO(nommbre);
    }

    public static ArrayList<PuestoDTO> toDTOlist(ArrayList<Puesto> lista){
        ArrayList<PuestoDTO> nueva = new ArrayList<>();

        for(Puesto p : lista) {
            nueva.add(toDTO(p.getNombre()));
        }
        

        return nueva;
    }
}
