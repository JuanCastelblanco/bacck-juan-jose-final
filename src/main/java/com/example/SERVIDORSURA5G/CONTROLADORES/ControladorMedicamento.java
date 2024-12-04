package com.example.SERVIDORSURA5G.CONTROLADORES;

import com.example.SERVIDORSURA5G.MODELOS.Medicamento;
import com.example.SERVIDORSURA5G.MODELOS.Medico;
import com.example.SERVIDORSURA5G.SERVICIOS.ServicioMedicamento;
import com.example.SERVIDORSURA5G.SERVICIOS.ServicioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/medicamento")
public class ControladorMedicamento {
    @Autowired
    ServicioMedicamento servicioMedicamento;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medicamento datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedicamento.guardarMedicamento(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> obtener(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedicamento.buscarMedicamento());
        } catch(Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
