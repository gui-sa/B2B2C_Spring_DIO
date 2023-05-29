package com.B2B2C.Application.repository;


import com.B2B2C.Application.model.Entregador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregadorRepository extends CrudRepository<Entregador,Long>{

}
