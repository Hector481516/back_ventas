package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.TipoVenta;

public interface TipoVentaRepository
    extends JpaRepository<TipoVenta, Long> {
}