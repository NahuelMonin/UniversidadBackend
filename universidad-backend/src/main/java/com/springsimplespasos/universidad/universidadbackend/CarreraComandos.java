package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        /*
        Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60,5);
        Carrera ingIndustrial = new Carrera(null, "Ingenieria Industrial", 55,5);
        Carrera ingAlimentos = new Carrera(null, "Ingenieria en Alimentos", 53,5);
        Carrera ingElectronica = new Carrera(null, "Ingenieria Electronica", 45,5);
        Carrera LicSistemas = new Carrera(null, "Licenciatura en Sistemas", 40,4);
        Carrera LicTurismo = new Carrera(null, "Licenciatura en Turismo", 42,4);
        Carrera LicYoga = new Carrera(null, "Licenciatura en Yoga", 25,3);
        Carrera LicRecursos = new Carrera(null, "Licenciatura en Recursos Humanos", 33,3);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(LicSistemas);
        servicio.save(LicTurismo);
        servicio.save(LicYoga);
        servicio.save(LicRecursos);
        */

        /*List<Carrera> carreras = (List<Carrera>) servicio.findCarrerasByNombreContains("sistemas");
        carreras.forEach(System.out::println);

        List<Carrera> carrerasIgnoreCase1 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>) servicio.findCarrerasByNombreContainsIgnoreCase("sistemas");
        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);

        List<Carrera> carrerasPorAnio = (List<Carrera>) servicio.findCarrerasByCantidadAniosAfter(4);
        carrerasPorAnio.forEach(System.out::println);
        */
    }


}
