package psoft.lab1.disciplinas;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplinas {
	private HashMap<Integer, Disciplina> disciplinas;
	private ArrayList<Disciplina> listDisciplinas;
	
	@JsonCreator
	public Disciplinas() {
		this.disciplinas = new HashMap<>();
		this.listDisciplinas = new ArrayList<>();
	}
	public void setDisciplinas(HashMap<Integer, Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Disciplina> getListDisciplinas() {
		return listDisciplinas;
	}
	public void setListDisciplinas(ArrayList<Disciplina> listDisciplinas) {
		this.listDisciplinas = listDisciplinas;
	}
	
	
	
}
