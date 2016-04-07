package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.command.AlterarEnderecoCommand;
import br.com.unicesumar.usuario.command.CriarUsuarioCommand;
import br.com.unicesumar.usuario.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
        public ResponseEntity<Long> criarUsuario(@RequestBody CriarUsuarioCommand command) {
        return new ResponseEntity<>(service.criar(command), HttpStatus.OK);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/alterarEndereco", method = RequestMethod.PUT)
    public ResponseEntity<String> alterarEndereco(@RequestBody AlterarEnderecoCommand command) {
        service.alterarEndereco(command);
        return new ResponseEntity<>("Endereço alterado com sucesso.", HttpStatus.OK);
    }

}