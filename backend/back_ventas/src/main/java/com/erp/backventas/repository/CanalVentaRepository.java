package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.CanalVenta;

public interface CanalVentaRepository
    extends JpaRepository<CanalVenta, Long> {
}