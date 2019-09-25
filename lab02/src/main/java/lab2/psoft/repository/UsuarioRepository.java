package lab2.psoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lab2.psoft.entities.Usuario;

@Repository
public interface UsuarioRepository<T, ID extends Serializable> extends JpaRepository<Usuario, String>{

}
