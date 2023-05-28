package com.B2B2C.Application.services.impl;

import com.B2B2C.Application.model.Usuario;
import com.B2B2C.Application.repository.UsuarioRepository;
import com.B2B2C.Application.services.UsuarioService;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuariorepository;

    @Override
    public List<Usuario> buscarTodos() {
        return null;
    }

    @Override
    public Usuario buscarPorId(Long id) {
            Optional<Usuario> usuario = usuariorepository.findById(id);
            return usuario.get();
    }

    @Override
    public void inserirNoBD(Usuario usuario) {

    }

    @Override
    public void atualizarNoBD(Long id, Usuario usuario) {

    }

    @Override
    public void deletarNoBD(Long id) {

    }
}
