package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Modelo;

public interface ModeloRepository
    extends JpaRepository<Modelo, Long> {
}