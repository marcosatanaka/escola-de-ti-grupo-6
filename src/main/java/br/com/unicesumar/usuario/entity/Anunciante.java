package br.com.unicesumar.usuario.entity;

import br.com.unicesumar.usuario.event.AlterarEnderecoEvent;
import br.com.unicesumar.usuario.event.CriarAnuncianteEvent;

import javax.persistence.*;

@Entity
@DiscriminatorValue("PESSOA_FISICA")
public class Anunciante extends Usuario {

    private String cpf;

    protected Anunciante() {
    }

    public Anunciante(CriarAnuncianteEvent event) {
        super(event.getNome(), event.getEndereco());
        this.cpf = event.getCpf();
    }

    public Anunciante(AlterarEnderecoEvent alterarEnderecoEvent) {

    }

    public String getCpf() {
        return cpf;
    }
}