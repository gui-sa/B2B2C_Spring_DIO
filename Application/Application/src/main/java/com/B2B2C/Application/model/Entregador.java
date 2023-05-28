package com.B2B2C.Application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Entregador extends Usuario{

    @Column( unique= true, nullable = false)
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
