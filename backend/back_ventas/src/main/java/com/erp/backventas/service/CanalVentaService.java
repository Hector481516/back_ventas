package com.erp.backventas.service;
import com.erp.backventas.entity.CanalVenta;
import com.erp.backventas.repository.CanalVentaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CanalVentaService {
    private final CanalVentaRepository canalVentaRepository;

    public List<CanalVenta> obtenerTodos() {
        return canalVentaRepository.findAll();
    }

    public CanalVenta guardar(CanalVenta canalVenta) {
        return canalVentaRepository.save(canalVenta);
    }
}