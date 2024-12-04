package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Medico;
import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedico {
    @Autowired
    IRepositorioMedico iRepositorioMedico;

    public Medico guardarMedico(Medico datosMedico) throws Exception{
        try {
            return iRepositorioMedico.save(datosMedico);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Medico> buscarMedico() throws Exception {
        try {
            return iRepositorioMedico.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
