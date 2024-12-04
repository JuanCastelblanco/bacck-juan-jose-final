package com.example.SERVIDORSURA5G.CONTROLADORES;

import com.example.SERVIDORSURA5G.MODELOS.Enfermedad;
import com.example.SERVIDORSURA5G.MODELOS.Medicamento;
import com.example.SERVIDORSURA5G.SERVICIOS.ServicioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/enfermedad")
public class ControladorEnfermedad {
    @Autowired
    ServicioEnfermedad servicioEnfermedad;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEnfermedad.guardarEnfermdad(datos));
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
                    .body(servicioEnfermedad.buscarEnfermedad());
        } catch(Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
