package com.example.SERVIDORSURA5G.REPOSITORIOS;

import com.example.SERVIDORSURA5G.MODELOS.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioEnfermedad extends JpaRepository<Enfermedad,Long> {
    
}
