package com.erp.backventas.controller;

import com.erp.backventas.entity.Color;
import com.erp.backventas.service.ColorService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/colores")
public class ColorController {
    private final ColorService colorService;

    @GetMapping
    public List<Color> obtenerTodos() {
        return colorService.obtenerTodos();
    }

    @PostMapping
    public Color guardar(@RequestBody Color color) {
        return colorService.guardar(color);
    }
}
