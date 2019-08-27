package psoft.lab1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Service;

import psoft.lab1.disciplinas.Disciplinas;
import psoft.lab1.disciplinas.Disciplina;

@Service
public class DisciplinaService {
	Disciplina disciplina1 = new Disciplina("", 0);
	
	
	public HashMap<Integer, Disciplina> mapaDisciplinas = new HashMap<>();
	
	public Disciplina addDisciplina(Disciplina disciplina) {
		this.disciplina1 = disciplina;
		this.mapaDisciplinas.put(disciplina1.getId(), disciplina1);
		return disciplina1;				
	}

	public Disciplinas getDisciplinas() {
		Collection<Disciplina> disciplinas = this.mapaDisciplinas.values();
		ArrayList<Disciplina> lista1 = new ArrayList<Disciplina>();
		for (Disciplina d : disciplinas) {
			lista1.add(d);
		}
		Disciplinas disciplinas3 = new Disciplinas();
		disciplinas3.setListDisciplinas(lista1);
		return disciplinas3;
	}

	public Disciplina getDisciplina(int id) {
		Disciplina disciplina = this.mapaDisciplinas.get(id);
		return disciplina;
	}

	public Disciplina setNomeDisciplina(int id, Disciplina nome) {
		Disciplina disciplina = this.mapaDisciplinas.get(id);
		this.disciplina1 = disciplina;
		disciplina.setNome(disciplina1.getNome());
		return disciplina;
	}

	public Disciplina setNotaDisciplina(Disciplina nota) {
		
		return null;
	}

	public Disciplina deleteDisciplina(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Disciplina getDisciplinasRanking() {
		// TODO Auto-generated method stub
		return null;
	}

}
