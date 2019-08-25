package psoft.lab1.disciplinas;

import psoft.lab1.disciplinas.GeradorDeID;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Disciplina {
	private String nome;
	@SuppressWarnings("unused")
	private int id;
	private double nota;

	@SuppressWarnings("static-access")
	@JsonCreator
	public Disciplina(String nome, double nota) {
		GeradorDeID ID = new GeradorDeID();
		this.nome = nome;
		this.nota = nota;
		this.id = ID.getProximoID();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	
	
}
