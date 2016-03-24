package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
