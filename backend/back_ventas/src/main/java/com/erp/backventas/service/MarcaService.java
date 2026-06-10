package com.erp.backventas.service;
import com.erp.backventas.entity.Marca;
import com.erp.backventas.repository.MarcaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarcaService {
    private final MarcaRepository marcaRepository;

    public List<Marca> obtenerTodos() {
        return marcaRepository.findAll();
    }

    public Marca guardar(Marca marca) {
        return marcaRepository.save(marca);
    }
}