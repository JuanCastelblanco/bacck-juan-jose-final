package com.example.SERVIDORSURA5G.SERVICIOS;

import com.example.SERVIDORSURA5G.MODELOS.Medicamento;
import com.example.SERVIDORSURA5G.MODELOS.Medico;
import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioMedicamento;
import com.example.SERVIDORSURA5G.REPOSITORIOS.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedicamento {
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    public Medicamento guardarMedicamento(Medicamento datosMedicamento) throws Exception{
        try {
            return iRepositorioMedicamento.save(datosMedicamento);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Medicamento> buscarMedicamento() throws Exception {
        try {
            return iRepositorioMedicamento.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
