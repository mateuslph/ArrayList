package br.com.mlp;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 23));
		javaColecoes.adiciona(new Aula("Modelandon com Colleções", 21));
		
		Aluno a1 = new Aluno("Rodrigo Turiini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 56178);
		Aluno a3 = new Aluno("Lidiane Fortes", 87868);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
	}

}
