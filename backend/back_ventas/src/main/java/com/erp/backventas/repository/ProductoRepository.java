package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Producto;

public interface ProductoRepository
    extends JpaRepository<Producto, Long> {
}