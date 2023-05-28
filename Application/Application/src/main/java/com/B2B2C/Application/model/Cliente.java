package com.B2B2C.Application.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cliente extends Usuario{
    @Column
    private UUID credit_card;
}
