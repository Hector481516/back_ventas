package com.erp.backventas.controller;

import com.erp.backventas.entity.TipoVenta;
import com.erp.backventas.service.TipoVentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo_ventas")
@RequiredArgsConstructor
public class TipoVentaController {
    private final TipoVentaService tipoVentaService;

    @GetMapping
    public List<TipoVenta> obtenerTodos() {
        return tipoVentaService.obtenerTodos();
    }

    @PostMapping
    public TipoVenta guardar(@RequestBody TipoVenta tipoVenta) {
        return tipoVentaService.guardar(tipoVenta);
    }
}
