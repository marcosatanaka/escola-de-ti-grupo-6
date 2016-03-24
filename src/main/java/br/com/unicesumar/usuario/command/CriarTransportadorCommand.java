package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarTransportadorCommand {

    private String nome;
    private String cnpj;
    private Long idEndereco;

    @JsonCreator
    public CriarTransportadorCommand(@JsonProperty("nome") String nome
                                   , @JsonProperty("cnpj") String cnpj
                                   , @JsonProperty("idEndereco") Long idEndereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }
}
