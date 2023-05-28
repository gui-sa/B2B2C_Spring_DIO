package com.B2B2C.Application.model;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @Column( unique = true, nullable = false)
    private String cpf;

    @Column( nullable = false)
    private String nome;

}
