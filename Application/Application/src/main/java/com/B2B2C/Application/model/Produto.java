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
    @JoinColumn( name = "fk_negocio", nullable = false, referencedColumnName = "id_negocio")
    private Negocio negocio;

    @Column( nullable = false)
    private double valor;

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
