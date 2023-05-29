package com.B2B2C.Application.services;

import com.B2B2C.Application.model.Dono;
import com.B2B2C.Application.model.Negocio;
import com.B2B2C.Application.model.Produto;

import java.util.List;

public interface DonoService {
    Iterable<Dono> buscarTodos();

    Dono buscarPorId(Long id_dono);

    void novoDono(Dono dono);

    void deletarDonoNoBD(Long id);

}
