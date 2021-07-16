package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		double peso, excesso, multa;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o peso dos tomates? ");
		peso = ler.nextDouble();
		
		if (peso <= 50) {
			System.out.println("Zero multa");
		}
		else if (peso > 50) {
			excesso = peso - 50;
			System.out.println("O excesso de peso é: " + excesso + " Kg");
			multa = excesso * 4;
			System.out.println("O valor de multa é R$ " + multa + " reais");
		}
	}

}
