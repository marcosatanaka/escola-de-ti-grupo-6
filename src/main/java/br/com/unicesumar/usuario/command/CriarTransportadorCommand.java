package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarTransportadorCommand {

    private String nome;
    private String cnpj;

    @JsonCreator
    public CriarTransportadorCommand(@JsonProperty("nome") String nome, @JsonProperty("cnpj") String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
