package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarUsuarioCommand {

    private String nome;

    @JsonCreator
    public CriarUsuarioCommand(@JsonProperty("nome") String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
