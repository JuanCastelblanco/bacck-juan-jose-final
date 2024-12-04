package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import com.example.SERVIDORSURA5G.MODELOS.SignoVital;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Executable;
import java.util.List;

@Service
public class ServicioSignoVital {
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    public SignoVital guardarSignoVital(SignoVital datosSignoVital) throws Exception {
        try {
            return iRepositorioSignoVital.save(datosSignoVital);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<SignoVital> buscarSignoVital() throws Exception {
        try {
            return iRepositorioSignoVital.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
