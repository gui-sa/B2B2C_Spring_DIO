package com.B2B2C.Application.repository;


import com.B2B2C.Application.model.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long>{

}
