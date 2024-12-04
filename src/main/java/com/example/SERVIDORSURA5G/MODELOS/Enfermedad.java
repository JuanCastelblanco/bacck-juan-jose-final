package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "enfermedades")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String grado;
    private Double probavilidadVida;

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String sintomas, String clasificacion, String grado, Double probavilidadVida) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probavilidadVida = probavilidadVida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbavilidadVida() {
        return probavilidadVida;
    }

    public void setProbavilidadVida(Double probavilidadVida) {
        this.probavilidadVida = probavilidadVida;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", grado='" + grado + '\'' +
                ", probavilidadVida=" + probavilidadVida +
                '}';
    }
}
