package com.B2B2C.Application.services;

import com.B2B2C.Application.model.Negocio;
import com.B2B2C.Application.model.Produto;
import java.util.List;

public interface ProdutoService {
    Iterable<Produto> buscarTodosProdutos(Negocio negocio);

    Produto buscarProdutoPorId(Negocio negocio, Long id_produto);

    void novoProduto(Negocio negocio);

    void deletarProdutoNoBD(Negocio negocio, Long id);

}
