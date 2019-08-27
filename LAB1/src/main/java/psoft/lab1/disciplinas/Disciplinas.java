package psoft.lab1.disciplinas;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplinas {
	
	private ArrayList<Disciplina> listDisciplinas;
	
	@JsonCreator
	public Disciplinas() {		
		this.listDisciplinas = new ArrayList<>();
	}
	
	public ArrayList<Disciplina> getListDisciplinas() {
		return listDisciplinas;
	}
	
	public void setListDisciplinas(ArrayList<Disciplina> listDisciplinas) {
		this.listDisciplinas = listDisciplinas;
	}
	
	
	
}
