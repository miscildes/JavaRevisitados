package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		int base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a base do triângulo? ");
		base = ler.nextInt();
		
		System.out.println("Qual a altura do triângulo? ");
		altura = ler.nextInt();
		
		if(base >= 0 && altura >= 0) {
			area = base * altura;
			System.out.println("A área do triangulo é " + area);
		}
		else {
			System.out.println("Não é possível calcular a área");
		}
	}

}
