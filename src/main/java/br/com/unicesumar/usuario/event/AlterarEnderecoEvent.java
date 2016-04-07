package br.com.unicesumar.usuario.event;

import br.com.unicesumar.endereco.entity.Endereco;
import br.com.unicesumar.usuario.entity.Usuario;

public class AlterarEnderecoEvent {

    Usuario usuario;
    Endereco endereco;

    public AlterarEnderecoEvent(Usuario usuario, Endereco endereco) {
        this.usuario = usuario;
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}