package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarAnuncianteCommand {

    private String nome;
    private String cpf;

    @JsonCreator
    public CriarAnuncianteCommand(@JsonProperty("nome") String nome, @JsonProperty("cpf") String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
