package lab2.psoft.services;

import lab2.psoft.daos.DisciplinasRepository;
import lab2.psoft.entities.Disciplina;

public class DisciplinasService {
	private DisciplinasRepository<Disciplina, Long> disciplinasDAO;
	
	public DisciplinasService(DisciplinasRepository<Disciplina, Long> disciplinasDAO) {
		super();
		this.disciplinasDAO = disciplinasDAO;
	}
}
