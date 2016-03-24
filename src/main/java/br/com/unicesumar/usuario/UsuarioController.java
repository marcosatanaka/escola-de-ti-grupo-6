package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.command.CriarUsuarioCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<Long> criar(CriarUsuarioCommand command) {
        return new ResponseEntity<>(service.criar(command), HttpStatus.OK);
    }

}