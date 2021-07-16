package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		double nota, nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, somaNota = 0.0, mediaP = 0.0, i;
		Scanner ler = new Scanner(System.in);
		
		for (i = 0.0; i <=2.0; i++) {
		System.out.println("Digite a " + (i+1)+ "º nota ");
		nota = ler.nextDouble();
		somaNota += nota;
		
		if (i == 0.0) {
			nota1 = nota * 2;
		}
		if (i == 1.0) {
			nota2 = nota * 3;
		}
		if (i == 2.0) {
			nota3 = nota * 5;
		}
		mediaP = (nota1 + nota2 + nota3) / 10;
		}
		System.out.println("A média ponderada é " + mediaP);
	}

}
