package com.example.SERVIDORSURA5G.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
 @Table(name = "pacientes")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre; // nombre
    private LocalDate anioNacimiento; //MAXIMO 1900
    private String ciudad; //VALIDAR 40 CARACTERESY SOLO LETRAS
    private String correo; //CORRO VALIDO @SURA.COM.CO
    private String telefono; //MAXIMO 12 CARACTERES Y SOLO NUMEROS
    private String ips; //MAXIMO 50 CARACTERES
    private String grupoIngresos; //SOLO SE ADMITE A, B O C EN MAYUSCULA
    private Boolean poliza; //POLIZAAAAA
    private LocalDate fechaAfiliacion; //NO PUEDE SER MENOR A 2010

    @ManyToOne
    @JoinColumn(name = "fk_medico", referencedColumnName = "id")
    @JsonBackReference
    private Medico medico;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Medicamento> medicamentos;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<Enfermedad> enfermedads;

    @OneToMany(mappedBy = "paciente")
    @JsonManagedReference
    private List<SignoVital> signoVitals;

    public Paciente() {
    }

    public Paciente(long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, String grupoIngresos, Boolean poliza, LocalDate fechaAfiliacion, Medico medico, List<Medicamento> medicamentos, List<Enfermedad> enfermedads, List<SignoVital> signoVitals) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngresos = grupoIngresos;
        this.poliza = poliza;
        this.fechaAfiliacion = fechaAfiliacion;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.enfermedads = enfermedads;
        this.signoVitals = signoVitals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public Boolean getPoliza() {
        return poliza;
    }

    public void setPoliza(Boolean poliza) {
        this.poliza = poliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public List<Enfermedad> getEnfermedads() {
        return enfermedads;
    }

    public void setEnfermedads(List<Enfermedad> enfermedads) {
        this.enfermedads = enfermedads;
    }

    public List<SignoVital> getSignoVitals() {
        return signoVitals;
    }

    public void setSignoVitals(List<SignoVital> signoVitals) {
        this.signoVitals = signoVitals;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ips='" + ips + '\'' +
                ", grupoIngresos='" + grupoIngresos + '\'' +
                ", poliza=" + poliza +
                ", fechaAfiliacion=" + fechaAfiliacion +
                ", medico=" + medico +
                ", medicamentos=" + medicamentos +
                ", enfermedads=" + enfermedads +
                ", signoVitals=" + signoVitals +
                '}';
    }
}
