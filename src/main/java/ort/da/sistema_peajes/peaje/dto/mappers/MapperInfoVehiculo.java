package ort.da.sistema_peajes.peaje.dto.mappers;

import java.util.ArrayList;

import ort.da.sistema_peajes.peaje.dto.VehiculoDTO;
import ort.da.sistema_peajes.peaje.model.InfoVehiculo;
import ort.da.sistema_peajes.peaje.model.Vehiculo;

public class MapperInfoVehiculo {
    
    public static VehiculoDTO toDTO(InfoVehiculo info) {
        Vehiculo v = info.getVehiculo();
        return new VehiculoDTO(
            v.getMatricula(),
            v.getModelo(),
            v.getColor(),
            info.getCantidadRegistros(),
            info.getMontoTotal()
        );
    }

    public static ArrayList<VehiculoDTO> toDTOList(ArrayList<InfoVehiculo> infoList) {
        
        ArrayList<VehiculoDTO> lista = new ArrayList<>();

        for (InfoVehiculo info : infoList) {
            lista.add(toDTO(info));
        }

        return lista;
    }
}
