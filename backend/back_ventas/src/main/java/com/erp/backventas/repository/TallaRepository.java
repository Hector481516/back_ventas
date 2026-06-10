package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Talla;

public interface TallaRepository
    extends JpaRepository<Talla, Long> {
}