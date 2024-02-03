package br.com.mlp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
//		int tempoTotal =0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		
		return " Nome do curso: " + this.nome + "\n Instrutor: " + this.instrutor + "\n Aulas: " + this.aulas;
	}

}
