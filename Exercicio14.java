package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		int base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a base do tri�ngulo? ");
		base = ler.nextInt();
		
		System.out.println("Qual a altura do tri�ngulo? ");
		altura = ler.nextInt();
		
		if(base >= 0 && altura >= 0) {
			area = base * altura;
			System.out.println("A �rea do triangulo � " + area);
		}
		else {
			System.out.println("N�o � poss�vel calcular a �rea");
		}
	}

}
