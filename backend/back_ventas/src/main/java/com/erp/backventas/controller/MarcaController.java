package com.erp.backventas.controller;

import com.erp.backventas.entity.Marca;
import com.erp.backventas.service.MarcaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@RequiredArgsConstructor
public class MarcaController {
    private final MarcaService marcaService;

    @GetMapping
    public List<Marca> obtenerTodos() {
        return marcaService.obtenerTodos();
    }

    @PostMapping
    public Marca guardar(@RequestBody Marca marca) {
        return marcaService.guardar(marca);
    }
}
