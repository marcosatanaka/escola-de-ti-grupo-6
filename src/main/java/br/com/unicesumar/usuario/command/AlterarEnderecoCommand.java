package br.com.unicesumar.usuario.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AlterarEnderecoCommand {

    private Long idUsuario;
    private Long idEndereco;

    @JsonCreator
    public AlterarEnderecoCommand(@JsonProperty("idUsuario") Long idUsuario, @JsonProperty("idEndereco") Long idEndereco) {
        this.idUsuario = idUsuario;
        this.idEndereco = idEndereco;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

}