package com.erp.backventas.service;
import com.erp.backventas.entity.TipoVenta;
import com.erp.backventas.repository.TipoVentaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoVentaService {
    private final TipoVentaRepository tipoVentaRepository;

    public List<TipoVenta> obtenerTodos() {
        return tipoVentaRepository.findAll();
    }

    public TipoVenta guardar(TipoVenta tipoVenta) {
        return tipoVentaRepository.save(tipoVenta);
    }
}