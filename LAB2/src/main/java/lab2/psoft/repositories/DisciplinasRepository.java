package lab2.psoft.daos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lab2.psoft.entities.Disciplina;

@Repository
public interface DisciplinasRepository <T, ID extends Serializable> extends JpaRepository<Disciplina, Long> {

}
