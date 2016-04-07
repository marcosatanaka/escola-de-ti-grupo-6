package br.com.unicesumar.usuario.entity;

import br.com.unicesumar.endereco.entity.Endereco;
import br.com.unicesumar.usuario.event.CriarUsuarioEvent;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String cpfCnpj;

    @ManyToOne
    private Endereco endereco;

    protected Usuario() {
    }

    public Usuario(CriarUsuarioEvent event) {
        this.nome = event.getNome();
        this.cpfCnpj = event.getCpf();
        this.endereco = event.getEndereco();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void mudar(Endereco endereco) {
        this.endereco = endereco;
    }
}