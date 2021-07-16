package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double nivelPoluicao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o nível de poluição atual? ");
		nivelPoluicao = ler.nextDouble();
		
		if (nivelPoluicao <= 0.25) {
			System.out.println(" O nível é aceitável");
		}
		if (nivelPoluicao > 0.25 && nivelPoluicao <= 0.30) {
			System.out.println("1º grupo suspenda suas atividades");
		}
		if (nivelPoluicao > 0.30 && nivelPoluicao <= 0.40) {
			System.out.println("1º e 2º grupos suspendam suas atividades");
		}
		if (nivelPoluicao > 0.40) {
			System.out.println("Todos os grupos suspendam suas atividades");
		}

	}

}
