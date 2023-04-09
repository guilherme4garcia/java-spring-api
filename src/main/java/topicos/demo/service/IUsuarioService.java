package topicos.demo.service;

import java.util.List;

import topicos.demo.entity.Usuario;

public interface IUsuarioService {

  public Usuario novoUsuario(Usuario usuario);

  public List<Usuario> buscarTodosUsuarios();

  public Usuario buscarPorId(Long id);

}
