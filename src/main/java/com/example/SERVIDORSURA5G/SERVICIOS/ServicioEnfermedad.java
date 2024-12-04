package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Enfermedad;
import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEnfermedad {
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad guardarEnfermdad(Enfermedad datosEnfermedad) throws Exception {
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Enfermedad> buscarEnfermedad() throws Exception {
        try {
            return iRepositorioEnfermedad.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
