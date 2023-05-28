package com.B2B2C.Application.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Cliente extends Usuario {
    @Column
    private UUID credit_card;

    public UUID getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(UUID credit_card) {
        this.credit_card = credit_card;
    }
}