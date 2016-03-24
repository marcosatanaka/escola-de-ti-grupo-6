package br.com.unicesumar.usuario.event;

import br.com.unicesumar.usuario.command.CriarTransportadorCommand;

public class CriarTransportadorEvent {

    private String nome;
    private String cnpj;

    public CriarTransportadorEvent(CriarTransportadorCommand command) {
        this.nome = command.getNome();
        this.cnpj = command.getCnpj();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

}
