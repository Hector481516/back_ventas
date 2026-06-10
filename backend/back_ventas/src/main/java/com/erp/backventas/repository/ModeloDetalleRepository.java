package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.ModeloDetalle;

public interface ModeloDetalleRepository
    extends JpaRepository<ModeloDetalle, Long> {
}