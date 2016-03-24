package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarAnuncianteCommand {

    private String nome;
    private String cpf;
    private Long idEndereco;

    @JsonCreator
    public CriarAnuncianteCommand(@JsonProperty("nome") String nome
                                , @JsonProperty("cpf") String cpf
                                , @JsonProperty("idEndereco") Long idEndereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }
}
