package br.com.unicesumar.endereco.entity;

import br.com.unicesumar.endereco.event.CriarEnderecoEvent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cep;

    public Endereco(CriarEnderecoEvent event) {
        this.logradouro = event.getLogradouro();
        this.numero = event.getNumero();
        this.bairro = event.getBairro();
        this.cep = event.getCep();
    }

    protected Endereco() {
    }

    public Long getId() {
        return id;
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