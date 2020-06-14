package com.everttonfernandes.backendvotos.domain;

public class Associado {
    private Long id;
    private String cpf;

    public Associado(Long id, String cpf) {
        this.id = id;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
