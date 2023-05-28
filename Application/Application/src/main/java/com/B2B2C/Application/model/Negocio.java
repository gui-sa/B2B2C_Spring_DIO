package com.B2B2C.Application.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;


@Entity
public class Negocio {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id_negocio;

    @ManyToOne
    @JoinColumn( name = "fk_dono" , referencedColumnName = "id_usuario" , nullable = false)
    private Dono dono;

    @Column( unique = true, nullable = false)
    private String cnpj;
    @Column( nullable = false)
    private String nome;

    public long getId_negocio() {
        return id_negocio;
    }

    public void setId_negocio(long id_negocio) {
        this.id_negocio = id_negocio;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
