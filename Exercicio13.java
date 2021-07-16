package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a idade do nadador? ");
		idade = ler.nextInt();
		
		if (idade < 5) {
			System.out.println("Desculpe, essa idade não pode participar do evento");
		}
		if (idade >= 5 && idade <= 7) {
			System.out.println("O participante é da categoria Infantil A");
		}
		if (idade >= 8 && idade <= 11) {
			System.out.println("O participante é da categoria Infantil B");
		}
		if (idade >= 12 && idade <= 13) {
			System.out.println("O participante é da categoria Juvenil A");
		}
		if (idade >= 14 && idade <= 17) {
			System.out.println("O participante é da categoria Juvenil B");
		}
		if (idade >= 18 && idade <= 50) {
			System.out.println("O participante é da categoria Adulto");
		}
		if (idade > 50) {
			System.out.println("Desculpe, por motivos de segurança você não pode participar");
		}

	}

}
