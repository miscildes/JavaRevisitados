package br.com.generation.exerciciosrevistitados;

public class Exercicio17 {

	public static void main(String[] args) {
		int i, soma = 0;
		
		for (i = 0; i <= 500; i++) {
			
			if (i%2 != 0) {
				if (i %3 == 0) {
					soma += i;
					System.out.println(soma);
				}
				
			}
		}

	}

}
