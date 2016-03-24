package br.com.unicesumar.usuario.entity;

import br.com.unicesumar.usuario.event.CriarUsuarioEvent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    public Usuario() {
    }

    public Usuario(CriarUsuarioEvent event) {
        this.nome = event.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}