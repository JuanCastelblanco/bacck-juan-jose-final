package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; //35 CARACTERES Y SOLO LETRAS //nombre
    private String matriculaProfesional; //20 CARACTERES
    private String especialidad; //20 CARACTERES
    private String salario; //SOLO POSITIVOS MENOS DE 10 MEGAS Y MAXIMO 20
    private String ips; //50 CARACTERES
    private String correo;
    private String telefono; //12 CARACTERES
    private String direccionConsultorio; //50 CARACTERES //DIRECCIONCONSULTORIO
    private Boolean finDeSemanaDisponible; //FINDESEMANADISPONIBLE

    @OneToMany(mappedBy = "medico")
    @JsonManagedReference
    private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombre, String matriculaProfesional, String especialidad, String salario, String ips, String correo, String telefono, String direccionConsultorio, Boolean finDeSemanaDisponible, List<Paciente> pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccionConsultorio = direccionConsultorio;
        this.finDeSemanaDisponible = finDeSemanaDisponible;
        this.pacientes = pacientes;
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

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public Boolean getFinDeSemanaDisponible() {
        return finDeSemanaDisponible;
    }

    public void setFinDeSemanaDisponible(Boolean finDeSemanaDisponible) {
        this.finDeSemanaDisponible = finDeSemanaDisponible;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", matriculaProfesional='" + matriculaProfesional + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario='" + salario + '\'' +
                ", ips='" + ips + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccionConsultorio='" + direccionConsultorio + '\'' +
                ", finDeSemanaDisponible=" + finDeSemanaDisponible +
                ", pacientes=" + pacientes +
                '}';
    }
}
