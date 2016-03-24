package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.command.CriarAnuncianteCommand;
import br.com.unicesumar.usuario.command.CriarTransportadorCommand;
import br.com.unicesumar.usuario.entity.Anunciante;
import br.com.unicesumar.usuario.entity.Transportador;
import br.com.unicesumar.usuario.entity.Usuario;
import br.com.unicesumar.usuario.event.CriarAnuncianteEvent;
import br.com.unicesumar.usuario.event.CriarTransportadorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Long criar(CriarAnuncianteCommand command) {
        return repository.save(new Anunciante(new CriarAnuncianteEvent(command))).getId();
    }

    public Long criar(CriarTransportadorCommand command) {
        return repository.save(new Transportador(new CriarTransportadorEvent(command))).getId();
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public List<Usuario> findAllAnunciantes() {
        return repository.findByTipo("PESSOA_FISICA");
    }

    public List<Usuario> findAllTransportadores() {
        return repository.findByTipo("PESSOA_JURIDICA");
    }

}