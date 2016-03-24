package br.com.unicesumar.usuario.event;

import br.com.unicesumar.endereco.entity.Endereco;

public class CriarTransportadorEvent {

    private String nome;
    private String cnpj;
    private Endereco endereco;

    public CriarTransportadorEvent(String nome, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
