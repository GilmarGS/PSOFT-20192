package psoft.lab1.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


import psoft.lab1.disciplinas.Disciplinas;

@Service
public class DisciplinaService {
	private ArrayList<Disciplinas> listDisciplinas = new ArrayList<>();
	
	public Disciplinas addDisciplina(String nome, double nota) {
		Disciplinas d = new Disciplinas(nome, nota);
		listDisciplinas.add(d);
		return d;
		
				
	}


}
