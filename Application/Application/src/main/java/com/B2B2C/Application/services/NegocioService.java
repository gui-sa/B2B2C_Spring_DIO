package com.B2B2C.Application.services;


import com.B2B2C.Application.dto.NegocioPost;
import com.B2B2C.Application.model.Negocio;

public interface NegocioService {
    Iterable<Negocio> buscarTodosNegocios();

    Negocio buscarNegocioPorId(Long id);

    void novoNegocioNoBD(NegocioPost negocioPost);

    void deletarNegocioNoBD(Long id);

}
