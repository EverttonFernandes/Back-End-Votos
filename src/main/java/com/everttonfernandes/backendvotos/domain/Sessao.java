package com.everttonfernandes.backendvotos.domain;

import java.util.Date;

public class Sessao {
    private Long id;
    private String descricao;
    private Date dataCriacao;
    private int totalVotosSim;
    private int totalVotosNao;
    private boolean abertaParaVotacao;

    public Sessao(Long id, String descricao, Date dataCriacao, int totalVotosSim, int totalVotosNao, boolean abertaParaVotacao) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.totalVotosSim = totalVotosSim;
        this.totalVotosNao = totalVotosNao;
        this.abertaParaVotacao = abertaParaVotacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getTotalVotosSim() {
        return totalVotosSim;
    }

    public void setTotalVotosSim(int totalVotosSim) {
        this.totalVotosSim = totalVotosSim;
    }

    public int getTotalVotosNao() {
        return totalVotosNao;
    }

    public void setTotalVotosNao(int totalVotosNao) {
        this.totalVotosNao = totalVotosNao;
    }

    public boolean isAbertaParaVotacao() {
        return abertaParaVotacao;
    }

    public void setAbertaParaVotacao(boolean abertaParaVotacao) {
        this.abertaParaVotacao = abertaParaVotacao;
    }

}
