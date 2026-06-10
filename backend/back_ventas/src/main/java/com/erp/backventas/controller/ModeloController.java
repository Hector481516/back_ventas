package com.erp.backventas.controller;

import com.erp.backventas.entity.Modelo;
import com.erp.backventas.service.ModeloService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/modelos")
public class ModeloController {
    private final ModeloService modeloService;

    @GetMapping
    public List<Modelo> obtenerTodos() {
        return modeloService.obtenerTodos();
    }

    @PostMapping
    public Modelo guardar(@RequestBody Modelo modelo) {
        return modeloService.guardar(modelo);
    }
}
