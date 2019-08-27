package psoft.lab1.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		this.disciplina1 = nome;
		disciplina.setNome(disciplina1.getNome());
		return disciplina;
	}

	public Disciplina setNotaDisciplina(int id, Disciplina nota) {
		Disciplina disciplina = this.mapaDisciplinas.get(id);
		this.disciplina1 = nota;
		disciplina.setNota(disciplina1.getNota());
		return disciplina;		

	}

	public Disciplina deleteDisciplina(int id) {
		Disciplina disciplina = this.mapaDisciplinas.remove(id);	
		return disciplina;
	}

	public Disciplinas getDisciplinasRanking() {
		Collection<Disciplina> disciplinas = this.mapaDisciplinas.values();
		ArrayList<Disciplina> lista1 = new ArrayList<Disciplina>();
		for (Disciplina d : disciplinas) {
			lista1.add(d);
		}
		Collections.sort(lista1, new DisciplinaComparator());
		Disciplinas disciplinas3 = new Disciplinas();
		disciplinas3.setListDisciplinas(lista1);
		return disciplinas3;

	}

}
