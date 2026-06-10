package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Estatus;

public interface EstatusRepository
    extends JpaRepository<Estatus, Long> {
}