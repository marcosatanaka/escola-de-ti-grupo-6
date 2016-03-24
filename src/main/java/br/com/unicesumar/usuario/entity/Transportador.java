package br.com.unicesumar.usuario.entity;

import br.com.unicesumar.usuario.event.CriarTransportadorEvent;

import javax.persistence.*;

@Entity
@DiscriminatorValue("PESSOA_JURIDICA")
public class Transportador extends Usuario {

    private String cnpj;

    protected Transportador() {
    }

    public Transportador(CriarTransportadorEvent event) {
        super(event.getNome(), event.getEndereco());
        this.cnpj = event.getCnpj();
    }

    public String getCnpj() {
        return cnpj;
    }

}