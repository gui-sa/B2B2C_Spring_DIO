package com.B2B2C.Application.services;

import com.B2B2C.Application.model.Negocio;
import java.util.List;

public interface NegocioService {
    List<Negocio> buscarTodosNegocios();

    Negocio buscarNegocioPorId(Long id);

    void novoNegocioNoBD(Negocio negocio);

    void deletarNegocioNoBD(Long id);

}
