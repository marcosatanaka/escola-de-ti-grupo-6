package br.com.unicesumar.usuario.event;

public class CriarUsuarioEvent {

    private String nome;

    public CriarUsuarioEvent(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
