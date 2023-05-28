package com.B2B2C.Application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Dono extends Usuario{
    @Column(nullable = false)
    private int banco;

    @Column( unique = true, nullable = false)
    private String conta_corrente;

}
