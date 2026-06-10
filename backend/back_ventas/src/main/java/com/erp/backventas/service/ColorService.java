package com.erp.backventas.service;
import com.erp.backventas.entity.Color;
import com.erp.backventas.repository.ColorRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorService {
    private final ColorRepository colorRepository;
    
    public List<Color> obtenerTodos() {
        return colorRepository.findAll();
    }

    public Color guardar(Color color) {
        return colorRepository.save(color);
    }
}
