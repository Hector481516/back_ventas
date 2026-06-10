package com.erp.backventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.erp.backventas.entity.Color;

public interface ColorRepository
    extends JpaRepository<Color, Long> {
}