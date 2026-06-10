package com.erp.backventas.service;
import com.erp.backventas.entity.ModeloDetalle;
import com.erp.backventas.repository.ModeloDetalleRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModeloDetalleService {
    private final ModeloDetalleRepository modeloDetalleRepository;

    public List<ModeloDetalle> obtenerTodos() {
        return modeloDetalleRepository.findAll();
    }

    public ModeloDetalle guardar(ModeloDetalle modeloDetalle) {
        return modeloDetalleRepository.save(modeloDetalle);
    }
}
