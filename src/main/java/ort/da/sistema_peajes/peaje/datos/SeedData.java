package ort.da.sistema_peajes.peaje.datos;

import ort.da.sistema_peajes.peaje.model.Bonificacion.*;
import ort.da.sistema_peajes.peaje.model.*;
import ort.da.sistema_peajes.peaje.model.Usuarios.*;
import ort.da.sistema_peajes.peaje.service.Fachada;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase para generar datos de prueba representativos para el sistema de peajes.
 * Incluye datos para todas las entidades principales del sistema.
 */
public class SeedData {
    private static Fachada fachada = Fachada.getInstancia();
    private static SistemaPuestos sistemaPuestos = new SistemaPuestos();
    private static SistemaVehiculos sistemaVehiculos = new SistemaVehiculos();
    private static SistemaRegistro sistemaRegistro = new SistemaRegistro();
    
    public static void cargarDatos() {
        cargarUsuarios();
        cargarCategoriasVehiculos();
        cargarVehiculos();
        cargarPuestos();
        cargarBonificaciones();
        //cargarRegistros();
        System.out.println("Datos de prueba cargados exitosamente");
    }

    private static void cargarUsuarios() {
        // Administradores
        fachada.agregarAdministrador("admin1", "admin123", "Juan Pérez");
        fachada.agregarAdministrador("admin2", "admin456", "María González");
        
        // Propietarios
        fachada.agregarPropietario("prop1", "prop123", "Carlos Rodríguez");
        fachada.agregarPropietario("prop2", "prop456", "Ana Martínez");
        fachada.agregarPropietario("prop3", "prop789", "Luis García");
    }

    private static void cargarCategoriasVehiculos() {
        ArrayList<CategoriaVehiculos> categorias = new ArrayList<>();
        categorias.add(new CategoriaVehiculos("Automóvil"));
        categorias.add(new CategoriaVehiculos("Camioneta"));
        categorias.add(new CategoriaVehiculos("Camión"));
        categorias.add(new CategoriaVehiculos("Ómnibus"));
        categorias.add(new CategoriaVehiculos("Moto"));
    }

    private static void cargarVehiculos() {
        // Ejemplos de vehículos con diferentes categorías
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Corolla", "Rojo", "Automóvil");
        Vehiculo v2 = new Vehiculo("DEF456", "Ford Ranger", "Blanco", "Camioneta");
        Vehiculo v3 = new Vehiculo("GHI789", "Volvo FH", "Azul", "Camión");
        Vehiculo v4 = new Vehiculo("JKL012", "Mercedes Sprinter", "Gris", "Ómnibus");
        Vehiculo v5 = new Vehiculo("MNO345", "Honda CBR", "Negro", "Moto");

        sistemaVehiculos.agregarVehiculo(v1);
        sistemaVehiculos.agregarVehiculo(v2);
        sistemaVehiculos.agregarVehiculo(v3);
        sistemaVehiculos.agregarVehiculo(v4);
        sistemaVehiculos.agregarVehiculo(v5);
    }

    private static void cargarPuestos() {
        // Puestos de peaje con diferentes ubicaciones y tarifas
        Puesto p1 = new Puesto("Peaje Ruta 1", "Km 56 Ruta 1");
        Puesto p2 = new Puesto("Peaje Ruta 5", "Km 98 Ruta 5");
        Puesto p3 = new Puesto("Peaje Ruta 8", "Km 23 Ruta 8");
        Puesto p4 = new Puesto("Peaje Interbalnearia", "Km 45 Ruta IB");

        // Agregar tarifas por categoría para cada puesto
        agregarTarifas(p1);
        agregarTarifas(p2);
        agregarTarifas(p3);
        agregarTarifas(p4);

        sistemaPuestos.agregarPuesto(p1);
        sistemaPuestos.agregarPuesto(p2);
        sistemaPuestos.agregarPuesto(p3);
        sistemaPuestos.agregarPuesto(p4);
    }

    private static void agregarTarifas(Puesto puesto) {
        ArrayList<Tarifa> tarifas = new ArrayList<>();
        tarifas.add(new Tarifa("Tarifa Básica", 100, "Automóvil"));
        tarifas.add(new Tarifa("Tarifa Básica", 150, "Camioneta"));
        tarifas.add(new Tarifa("Tarifa Básica", 300, "Camión"));
        tarifas.add(new Tarifa("Tarifa Básica", 250, "Ómnibus"));
        tarifas.add(new Tarifa("Tarifa Básica", 50, "Moto"));
        // Asignar tarifas al puesto
    }

    private static void cargarBonificaciones() {
        // Diferentes tipos de bonificaciones
        Bonificacion frecuente = new Descuento(20, "Usuario Frecuente");
        Bonificacion trabajador = new Descuento(50, "Trabajador");
        // Las bonificaciones se asignarán a los vehículos según corresponda
    }

    /* 
    private static void cargarRegistros() {
        // Ejemplos de registros de paso por peajes
        LocalDateTime fecha = LocalDateTime.now();
        
        Registro r1 = new Registro(
            sistemaPuestos.getPuestos().get(0),
            sistemaVehiculos.getVehiculos().get(0),
            fecha,
            tarifas.get(0)
        );
        
        Registro r2 = new Registro(
            sistemaPuestos.getPuestos().get(1),
            sistemaVehiculos.getVehiculos().get(1),
            fecha
        );

        sistemaRegistro.agregarRegistro(r1);
        sistemaRegistro.agregarRegistro(r2);
    }
        */
}