package com.example.SERVIDORSURA5G.REPOSITORIOS;

import com.example.SERVIDORSURA5G.MODELOS.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento,Long> {

}
