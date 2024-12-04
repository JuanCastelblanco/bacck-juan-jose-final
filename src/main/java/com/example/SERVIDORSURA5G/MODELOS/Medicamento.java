package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraIndicaciones;
    private String registroInvima; //regirstroInvima
    private Boolean copago; //copago

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraIndicaciones, String registroInvima, Boolean copago, Paciente paciente) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraIndicaciones = contraIndicaciones;
        this.registroInvima = registroInvima;
        this.copago = copago;
        this.paciente = paciente;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraIndicaciones() {
        return contraIndicaciones;
    }

    public void setContraIndicaciones(String contraIndicaciones) {
        this.contraIndicaciones = contraIndicaciones;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public Boolean getCopago() {
        return copago;
    }

    public void setCopago(Boolean copago) {
        this.copago = copago;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", dosis=" + dosis +
                ", laboratorio='" + laboratorio + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", contraIndicaciones='" + contraIndicaciones + '\'' +
                ", registroInvima='" + registroInvima + '\'' +
                ", copago=" + copago +
                ", paciente=" + paciente +
                '}';
    }
}
