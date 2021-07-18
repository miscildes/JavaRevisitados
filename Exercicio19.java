package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		int numero, contador = 0, soma =0, multi;
		Scanner ler = new Scanner(System.in);
		
		while (contador == 0) {
			System.out.println("Digite um número ");
			numero = ler.nextInt();
			multi = numero*3;
			soma += multi;
			System.out.println("A soma multiplicada por 3 é: " + soma);
			
			if (soma >= 100) {
				System.out.println("Fim da multiplicação");
				break;
			}
			
			
		}

	}

}
