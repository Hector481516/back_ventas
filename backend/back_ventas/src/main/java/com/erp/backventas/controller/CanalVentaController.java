package com.erp.backventas.controller;

import com.erp.backventas.entity.CanalVenta;
import com.erp.backventas.service.CanalVentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canal_ventas")
@RequiredArgsConstructor
public class CanalVentaController {
    private final CanalVentaService canalVentaService;

    @GetMapping
    public List<CanalVenta> obtenerTodos() {
        return canalVentaService.obtenerTodos();
    }

    @PostMapping
    public CanalVenta guardar(@RequestBody CanalVenta canalVenta) {
        return canalVentaService.guardar(canalVenta);
    }
}
