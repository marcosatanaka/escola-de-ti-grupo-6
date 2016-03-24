package br.com.unicesumar.endereco;

import br.com.unicesumar.endereco.command.CriarEnderecoCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @RequestMapping(value = "/novoEndereco", method = RequestMethod.POST)
    public ResponseEntity<Long> criarEndereco(@RequestBody  CriarEnderecoCommand command) {
        return new ResponseEntity<>(service.criar(command), HttpStatus.OK);
    }

}