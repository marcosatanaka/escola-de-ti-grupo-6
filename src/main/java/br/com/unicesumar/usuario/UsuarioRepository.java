package br.com.unicesumar.usuario;

import br.com.unicesumar.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select u from Usuario u where tipo = ?1")
    List<Usuario> findByTipo(String tipo);

}
