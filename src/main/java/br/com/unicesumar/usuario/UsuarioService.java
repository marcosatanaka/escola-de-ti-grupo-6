package br.com.unicesumar.usuario;

import br.com.unicesumar.endereco.EnderecoService;
import br.com.unicesumar.endereco.entity.Endereco;
import br.com.unicesumar.usuario.command.AlterarEnderecoCommand;
import br.com.unicesumar.usuario.command.CriarUsuarioCommand;
import br.com.unicesumar.usuario.entity.Usuario;
import br.com.unicesumar.usuario.event.AlterarEnderecoEvent;
import br.com.unicesumar.usuario.event.CriarUsuarioEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private EnderecoService enderecoService;

    public Long criar(CriarUsuarioCommand command) {
        return repository.save(
                new Usuario(new CriarUsuarioEvent(command.getNome()
                                                      , command.getCpfCnpj()
                                                      , enderecoService.findById(command.getIdEndereco())))
        ).getId();
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public void alterarEndereco(AlterarEnderecoCommand command) {
        Usuario usuario = repository.findOne(command.getIdUsuario());
        Endereco endereco = enderecoService.findById(command.getIdEndereco());
        usuario.mudar(endereco);
        repository.save(usuario);
    }

}