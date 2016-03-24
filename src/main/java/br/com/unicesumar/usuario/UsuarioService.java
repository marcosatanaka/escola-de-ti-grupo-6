package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.command.CriarUsuarioCommand;
import br.com.unicesumar.usuario.entity.Usuario;
import br.com.unicesumar.usuario.event.CriarUsuarioEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Long criar(CriarUsuarioCommand command) {
        return repository.save(new Usuario(new CriarUsuarioEvent(command.getNome()))).getId();
    }

}
