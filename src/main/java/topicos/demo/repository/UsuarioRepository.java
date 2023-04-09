package topicos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import topicos.demo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  public Usuario findByNome(String nome);
}