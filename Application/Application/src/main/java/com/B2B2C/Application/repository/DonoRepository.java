package com.B2B2C.Application.repository;


import com.B2B2C.Application.model.Dono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends CrudRepository<Dono,Long>{

}
