package lab2.psoft.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lab2.psoft.entities.Usuario;
import lab2.psoft.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository<Usuario, String> usuarioRepositoryDAO;

	public UsuarioService(UsuarioRepository<Usuario, String> usuariosDAO) {
		super();
		this.usuarioRepositoryDAO = usuariosDAO;
	}

	public Usuario cadastrarUsuario(Usuario usuario) {
		return this.usuarioRepositoryDAO.save(usuario);
	}

	public boolean logar(Usuario usuario) {
		Optional<Usuario> u = this.usuarioRepositoryDAO.findById(usuario.getEmail());
		if (u.isPresent()) {
			return (usuario.getSenha() == u.get().getSenha());
		} else {
			return false;
		}
	}

	public Usuario excluirUsuario(String email) {
		Usuario u = getUsuarioById(email).get();
		this.usuarioRepositoryDAO.deleteById(email);
		return u;
	}

	public Optional<Usuario> getUsuarioById(String email) {
		return this.usuarioRepositoryDAO.findById(email);
	}

	public List<Usuario> getUsuarios() {
		return this.usuarioRepositoryDAO.findAll();
	}

}
