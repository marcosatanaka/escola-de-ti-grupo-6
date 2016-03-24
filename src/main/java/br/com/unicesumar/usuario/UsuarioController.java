package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.command.CriarAnuncianteCommand;
import br.com.unicesumar.usuario.command.CriarTransportadorCommand;
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

    @RequestMapping(value = "/novoAnunciante", method = RequestMethod.POST)
    public ResponseEntity<Long> criarAnunciante(@RequestBody CriarAnuncianteCommand command) {
        return new ResponseEntity<>(service.criar(command), HttpStatus.OK);
    }

    @RequestMapping(value = "/novoTransportador", method = RequestMethod.POST)
    public ResponseEntity<Long> criarTransportador(@RequestBody CriarTransportadorCommand command) {
        return new ResponseEntity<>(service.criar(command), HttpStatus.OK);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/getAnunciantes", method = RequestMethod.GET)
    public List<Usuario> findAllAnunciantes() {
        return service.findAllAnunciantes();
    }

    @RequestMapping(value = "/getTransportadores", method = RequestMethod.GET)
    public List<Usuario> findAllTransportadores() {
        return service.findAllTransportadores();
    }

}