package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		numero = ler.nextInt();
		
		if (numero >= 100) {
			System.out.println("O número digitado é " + numero);
		}
		else {
			System.out.println("Zero");
		}

	}

}
