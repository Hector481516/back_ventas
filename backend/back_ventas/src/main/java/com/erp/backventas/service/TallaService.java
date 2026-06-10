package com.erp.backventas.service;
import com.erp.backventas.entity.Talla;
import com.erp.backventas.repository.TallaRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TallaService {
    private final TallaRepository tallaRepository;

    public List<Talla> obtenerTodos() {
        return tallaRepository.findAll();
    }

    public Talla guardar(Talla talla) {
        return tallaRepository.save(talla);
    }
}
