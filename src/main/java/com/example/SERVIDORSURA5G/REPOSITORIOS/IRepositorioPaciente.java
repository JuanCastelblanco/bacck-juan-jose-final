package com.example.SERVIDORSURA5G.REPOSITORIOS;

import com.example.SERVIDORSURA5G.MODELOS.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPaciente extends JpaRepository<Paciente,Long> {

}
