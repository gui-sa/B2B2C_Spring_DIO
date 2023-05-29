package com.B2B2C.Application.dto;

import com.B2B2C.Application.model.Dono;
import com.B2B2C.Application.model.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
public class DonoPost {
    private String cpf_dono;
    private String nome;
    private int banco;
    private String conta_corrente;
/**
    public Dono getDono(Dono novoDono){
        novoDono.setCpf(this.cpf_dono);
        novoDono.setNome(this.nome);
        novoDono.setBanco(this.banco);
        novoDono.setConta_corrente(this.conta_corrente);
        return novoDono;
    }*/
}
