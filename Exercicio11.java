package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero ");
		numero = ler.nextInt();
		
		if (numero >= 0) {
			System.out.println("O n�mero digitado � positivo");
		}
		else {
			System.out.println("O n�mero digitado � negativo");
		}
		if (numero %2==0) {
			System.out.println("O n�mero digitado � par");
		}
		else {
			System.out.println("O n�mero digitado � impar");
		}
	}

}
