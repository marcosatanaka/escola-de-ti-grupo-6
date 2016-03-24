package br.com.unicesumar.usuario.event;

import br.com.unicesumar.endereco.entity.Endereco;

public class CriarAnuncianteEvent {

    private String nome;
    private String cpf;
    private Endereco endereco;

    public CriarAnuncianteEvent(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
