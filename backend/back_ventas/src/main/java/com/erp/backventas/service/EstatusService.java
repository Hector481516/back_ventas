package com.erp.backventas.service;
import com.erp.backventas.entity.Estatus;
import com.erp.backventas.repository.EstatusRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstatusService {
    private final EstatusRepository estatusRepository;

    public List<Estatus> obtenerTodos() {
        return estatusRepository.findAll();
    }

    public Estatus guardar(Estatus estatus) {
        return estatusRepository.save(estatus);
    }
}