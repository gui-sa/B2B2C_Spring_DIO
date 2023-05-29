package com.B2B2C.Application.services.impl;

import com.B2B2C.Application.dto.NegocioPost;
import com.B2B2C.Application.model.Dono;
import com.B2B2C.Application.model.Negocio;
import com.B2B2C.Application.repository.DonoRepository;
import com.B2B2C.Application.repository.NegocioRepository;
import com.B2B2C.Application.services.DonoService;
import com.B2B2C.Application.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonoServiceImpl implements DonoService {

    @Autowired
    private DonoRepository donoRepository;

    @Override
    public Iterable<Dono> buscarTodos() {
        return this.donoRepository.findAll();
    }

    @Override
    public Dono buscarPorId(Long id_dono) {
        Optional<Dono> dono = this.donoRepository.findById(id_dono);
        return dono.get();
    }

    @Override
    public void novoDono(Dono dono) {

    }

    @Override
    public void deletarDonoNoBD(Long id) {
        this.donoRepository.deleteById(id);
    }
}
