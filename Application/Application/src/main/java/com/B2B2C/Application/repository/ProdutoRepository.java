package com.B2B2C.Application.repository;


import com.B2B2C.Application.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long>{

}
