package com.B2B2C.Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class Produto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id_produto;

    @Column( nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn( name = "fk_negocio", nullable = false)
    private Negocio negocio;

    @Column( nullable = false)
    private double valor;
}
