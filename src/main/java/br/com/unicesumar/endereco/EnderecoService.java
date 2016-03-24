package br.com.unicesumar.endereco;

import br.com.unicesumar.endereco.command.CriarEnderecoCommand;
import br.com.unicesumar.endereco.entity.Endereco;
import br.com.unicesumar.endereco.event.CriarEnderecoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public Long criar(CriarEnderecoCommand command) {
        return repository.save(new Endereco(new CriarEnderecoEvent(command.getLogradouro()
                                                                 , command.getNumero()
                                                                 , command.getBairro()
                                                                 , command.getCep()))
        ).getId();
    }

    public Endereco findById(Long idEndereco) {
        return repository.findOne(idEndereco);
    }

}
