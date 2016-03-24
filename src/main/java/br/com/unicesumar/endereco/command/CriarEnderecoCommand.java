package br.com.unicesumar.endereco.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarEnderecoCommand {

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cep;

    @JsonCreator
    public CriarEnderecoCommand(@JsonProperty("logradouro") String logradouro
                              , @JsonProperty("numero") Integer numero
                              , @JsonProperty("bairro") String bairro
                              , @JsonProperty("cep") String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

}
