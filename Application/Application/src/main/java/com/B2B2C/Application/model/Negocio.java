package com.B2B2C.Application.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Negocio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_negocio;

    @ManyToOne
    @JoinColumn( name = "fk_dono")
    private Dono dono;

    @Column( unique = true, nullable = false)
    private String cnpj;
    @Column( nullable = false)
    private String nome;

}
