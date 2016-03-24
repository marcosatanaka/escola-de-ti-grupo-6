package br.com.unicesumar.usuario.event;

import br.com.unicesumar.usuario.command.CriarAnuncianteCommand;

public class CriarAnuncianteEvent {

    private String nome;
    private String cpf;

    public CriarAnuncianteEvent(CriarAnuncianteCommand command) {
        this.nome = command.getNome();
        this.cpf = command.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
