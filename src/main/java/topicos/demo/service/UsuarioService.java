package topicos.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topicos.demo.entity.Usuario;
import topicos.demo.exception.UsuarioNaoEncontradoException;
import topicos.demo.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepo;

  public Usuario novoUsuario(Usuario usuario) {
    if (usuario == null
        || usuario.getNome() == null
        || usuario.getSenha() == null) {
      throw new IllegalArgumentException("Nome e senha inválidos!");
    }
    return usuarioRepo.save(usuario);
  }

  public List<Usuario> buscarTodosUsuarios() {
    return usuarioRepo.findAll();
  }

  public Usuario buscarPorId(Long id) {
    Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
    if (usuarioOp.isEmpty()) {
      throw new UsuarioNaoEncontradoException("Usuário não existe!");
    }
    return usuarioOp.get();
  }

}