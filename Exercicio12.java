package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double nivelPoluicao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o n�vel de polui��o atual? ");
		nivelPoluicao = ler.nextDouble();
		
		if (nivelPoluicao <= 0.25) {
			System.out.println(" O n�vel � aceit�vel");
		}
		if (nivelPoluicao > 0.25 && nivelPoluicao <= 0.30) {
			System.out.println("1� grupo suspenda suas atividades");
		}
		if (nivelPoluicao > 0.30 && nivelPoluicao <= 0.40) {
			System.out.println("1� e 2� grupos suspendam suas atividades");
		}
		if (nivelPoluicao > 0.40) {
			System.out.println("Todos os grupos suspendam suas atividades");
		}

	}

}
