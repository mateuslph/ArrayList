package br.com.mlp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
//		List<Aula> aulas = javaColecoes.getAulas();
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleções", 22));
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
//		aulas.add(new Aula("Trabalhando com List", 19));
//		System.out.println(aulas);
//		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes.toString());
		
	}

}
