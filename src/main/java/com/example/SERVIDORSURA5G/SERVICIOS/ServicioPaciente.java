package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ServicioPaciente {
    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //2. Se programan las funciones para las distintas operaciones en la BD

    // Funcion para guardar DATOS
    public Paciente gaurdarPaciente(Paciente datosPaciente) throws Exception {
        try {
            return iRepositorioPaciente.save(datosPaciente);
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Paciente> buscarPacientes() throws Exception {
        try {
            return iRepositorioPaciente.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
