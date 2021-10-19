package Exercicio03;

import java.util.Arrays;

public class Aluno {
		
	private String nome;
	private double[] notas;
	
	
	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void aprovado() {
		double media = this.media();
		
		if(media>7) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
	
	public double maiorNota() {
		double maior = this.notas[0];
		
		for(double n:notas) {
			if(n>maior) {
				maior = n;
			}
		}
		return maior;
	}
	
	public double media() {
		double soma = 0.0;
		double media;
		
		for (double n:notas) {
			soma += n;
		}
		media = soma / notas.length;
		return media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}
	
}

