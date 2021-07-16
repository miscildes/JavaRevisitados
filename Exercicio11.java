package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		numero = ler.nextInt();
		
		if (numero >= 0) {
			System.out.println("O número digitado é positivo");
		}
		else {
			System.out.println("O número digitado é negativo");
		}
		if (numero %2==0) {
			System.out.println("O número digitado é par");
		}
		else {
			System.out.println("O número digitado é impar");
		}
	}

}
