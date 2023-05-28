package com.B2B2C.Application.services.impl;

import com.B2B2C.Application.dto.NegocioPost;
import com.B2B2C.Application.model.Dono;
import com.B2B2C.Application.model.Negocio;
import com.B2B2C.Application.repository.DonoRepository;
import com.B2B2C.Application.repository.NegocioRepository;
import com.B2B2C.Application.services.NegocioService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
@Service
public class NegocioServiceImpl implements NegocioService {

    @Autowired
    private NegocioRepository negociorepository;

    @Override
    public Iterable<Negocio> buscarTodosNegocios() {
        return this.negociorepository.findAll();
    }

    @Override
    public Negocio buscarNegocioPorId(Long id) {
        Optional<Negocio> negocio = this.negociorepository.findById(id);
        return negocio.get();
        //Nao trata o Optional mas nao quebra a aplicacao caso aconteca
    }

    @Override
    public void novoNegocioNoBD(NegocioPost negocioPost) {
        // Capturar o Dono primeiro via negocioPost.getCpf_dono() no repository
        // Usando o
        //this.negociorepository.save();
    }

    @Override
    public void deletarNegocioNoBD(Long id) {
        this.negociorepository.deleteById(id);
    }
}
