package com.B2B2C.Application.dto;

public class NegocioPost {
    private String cpf_dono;
    private String cnpj;
    private String nome;

    public NegocioPost(String cpf_dono, String cnpj, String nome) {
        this.cpf_dono = cpf_dono;
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCpf_dono() {
        return cpf_dono;
    }

    public void setCpf_dono(String cpf_dono) {
        this.cpf_dono = cpf_dono;
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
