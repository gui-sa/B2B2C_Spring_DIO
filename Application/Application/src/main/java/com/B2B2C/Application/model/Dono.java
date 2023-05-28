package com.B2B2C.Application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Dono extends Usuario{
    @Column(nullable = false)
    private int banco;

    @Column( unique = true, nullable = false)
    private String conta_corrente;

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public String getConta_corrente() {
        return conta_corrente;
    }

    public void setConta_corrente(String conta_corrente) {
        this.conta_corrente = conta_corrente;
    }
}
