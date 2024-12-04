package com.example.SERVIDORSURA5G.CONTROLADORES;

import com.example.SERVIDORSURA5G.MODELOS.Medico;
import com.example.SERVIDORSURA5G.SERVICIOS.ServicioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/medico")
public class ControladorMedico {
    @Autowired
    ServicioMedico servicioMedico;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Medico datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioMedico.guardarMedico(datos));
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
                    .body(servicioMedico.buscarMedico());
        } catch(Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
