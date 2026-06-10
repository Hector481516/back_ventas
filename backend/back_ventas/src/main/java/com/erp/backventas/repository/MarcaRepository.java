package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Marca;

public interface MarcaRepository
    extends JpaRepository<Marca, Long> {
}