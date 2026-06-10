package com.erp.backventas.controller;

import com.erp.backventas.entity.Talla;
import com.erp.backventas.service.TallaService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tallas")
@RequiredArgsConstructor
public class TallaController {
    private final TallaService tallaService;

    @GetMapping
    public List<Talla> obtenerTodos() {
        return tallaService.obtenerTodos();
    }

    @PostMapping
    public Talla guardar(@RequestBody Talla talla) {
        return tallaService.guardar(talla);
    }
}
