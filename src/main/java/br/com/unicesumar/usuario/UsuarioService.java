package br.com.unicesumar.usuario;

import br.com.unicesumar.endereco.EnderecoService;
import br.com.unicesumar.endereco.entity.Endereco;
import br.com.unicesumar.usuario.command.AlterarEnderecoCommand;
import br.com.unicesumar.usuario.command.CriarAnuncianteCommand;
import br.com.unicesumar.usuario.command.CriarTransportadorCommand;
import br.com.unicesumar.usuario.entity.Anunciante;
import br.com.unicesumar.usuario.entity.Transportador;
import br.com.unicesumar.usuario.entity.Usuario;
import br.com.unicesumar.usuario.event.AlterarEnderecoEvent;
import br.com.unicesumar.usuario.event.CriarAnuncianteEvent;
import br.com.unicesumar.usuario.event.CriarTransportadorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private EnderecoService enderecoService;

    public Long criar(CriarAnuncianteCommand command) {
        return repository.save(
                new Anunciante(new CriarAnuncianteEvent(command.getNome()
                                                      , command.getCpf()
                                                      , enderecoService.findById(command.getIdEndereco())))
        ).getId();
    }

    public Long criar(CriarTransportadorCommand command) {
        return repository.save(
                new Transportador(new CriarTransportadorEvent(command.getNome()
                                                            , command.getCnpj()
                                                            , enderecoService.findById(command.getIdEndereco())))
        ).getId();
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

    public void alterarEndereco(AlterarEnderecoCommand command) {
        Usuario usuario = repository.findOne(command.getIdUsuario());
        Endereco endereco = enderecoService.findById(command.getIdEndereco());
        // TODO: como fazer?
        // 1) Teria um if para saber qual instanciar?
        // 2) Teriam dois métodos, com dois commands e dois services para alterar o endereço apesar das informações serem as mesmas?
        // 3) Teria um setter no Usuario para atualizar o endereço?
        repository.save(new Anunciante(new AlterarEnderecoEvent(usuario, endereco)));
    }

}