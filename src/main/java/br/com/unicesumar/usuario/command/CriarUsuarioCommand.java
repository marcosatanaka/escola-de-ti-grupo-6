package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CriarUsuarioCommand {

    private String nome;
    private String cpfCnpj;
    private Long idEndereco;

    @JsonCreator
    public CriarUsuarioCommand(@JsonProperty("nome") String nome
                                , @JsonProperty("cpfCnpj") String cpfCnpj
                                , @JsonProperty("idEndereco") Long idEndereco) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }
}
