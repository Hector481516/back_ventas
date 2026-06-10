package com.erp.backventas.service;
import com.erp.backventas.entity.Modelo;
import com.erp.backventas.repository.ModeloRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModeloService {
    private final ModeloRepository modeloRepository;
    
    public List<Modelo> obtenerTodos() {
        return modeloRepository.findAll();
    }

    public Modelo guardar(Modelo modelo) {
        return modeloRepository.save(modelo);
    }
}
