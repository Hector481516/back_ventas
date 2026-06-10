package com.erp.backventas.controller;

import com.erp.backventas.entity.Estatus;
import com.erp.backventas.service.EstatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estatus")
@RequiredArgsConstructor
public class EstatusController {
    private final EstatusService estatusService;

    @GetMapping
    public List<Estatus> obtenerTodos() {
        return estatusService.obtenerTodos();
    }

    @PostMapping
    public Estatus guardar(@RequestBody Estatus estatus) {
        return estatusService.guardar(estatus);
    }
}
