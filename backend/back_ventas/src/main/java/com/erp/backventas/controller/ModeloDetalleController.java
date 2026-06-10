package com.erp.backventas.controller;

import com.erp.backventas.entity.ModeloDetalle;
import com.erp.backventas.service.ModeloDetalleService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/modelos_detalle")
public class ModeloDetalleController {
    private final ModeloDetalleService modeloDetalleService;

    @GetMapping
    public List<ModeloDetalle> obtenerTodos() {
        return modeloDetalleService.obtenerTodos();
    }

    @PostMapping
    public ModeloDetalle guardar(@RequestBody ModeloDetalle modeloDetalle) {
        return modeloDetalleService.guardar(modeloDetalle);
    }
}
