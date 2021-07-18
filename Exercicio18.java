package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		 int numero, soma = 0, media = 0, contador = 0, valores = 0;
		 Scanner ler = new Scanner(System.in);
		 
		 while (contador == 0) {
			 System.out.println("Digite um número ");
			 numero = ler.nextInt();
			 soma += numero;
			 System.out.println("A soma dos números é: " + soma);
			 if (numero <= 0) {
				 System.out.println("STOP");
				 break; 
			 }
			 if (numero > 0) {
				 valores++;
				 media = soma / valores;
			 }
			 System.out.println("A quantidade de números digitados é: " + valores);
			 System.out.println("A média dos números é: " + media);
			 
			 
		 }
		 

	}

}
