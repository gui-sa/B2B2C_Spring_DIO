package com.B2B2C.Application.services;

import com.B2B2C.Application.model.Usuario;
import java.util.List;
public interface UsuarioService {
    List<Usuario> buscarTodos();

    Usuario buscarPorId(Long id);

    void inserirNoBD(Usuario usuario);

    void atualizarNoBD(Long id, Usuario usuario);

    void deletarNoBD(Long id);
}
