package com.everttonfernandes.backendvotos.controller;

import com.everttonfernandes.backendvotos.domain.Pauta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PautaController {

    @PostMapping("/pauta")
    public ResponseEntity criarPauta(@RequestBody DadosPauta dadosPauta) {
        Pauta pauta = new Pauta();
        pauta.setDescricao(dadosPauta.getDescricao());
        return new ResponseEntity<>(pauta, HttpStatus.OK);
    }

    static class DadosPauta {
        private String descricao;

        public DadosPauta() {
        }

        public DadosPauta(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }

}