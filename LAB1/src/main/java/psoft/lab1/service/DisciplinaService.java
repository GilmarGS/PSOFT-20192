package psoft.lab1.service;

import java.util.HashMap;
import org.springframework.stereotype.Service;

import psoft.lab1.disciplinas.Disciplinas;
import psoft.lab1.disciplinas.Disciplina;

@Service
public class DisciplinaService {
	Disciplina disciplina1 = new Disciplina("", 0);
	
	public HashMap<Integer, Disciplina> mapaDisciplina = new HashMap<>();
	
	public Disciplina addDisciplina(Disciplina disciplina) {
		this.disciplina1 = disciplina;
		return disciplina1;				
	}

	public Disciplina getDisciplinas() {
		
		return null;
	}

}
