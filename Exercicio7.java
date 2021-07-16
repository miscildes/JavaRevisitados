package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double custoTotal, custoFabric, percentDB, impostos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor total do carro? ");
		custoTotal = ler.nextDouble();
		
		percentDB = custoTotal * 0.28;
		impostos = custoTotal * 0.45;
		
		custoFabric = (custoTotal - percentDB) - impostos;
		
		System.out.println("O custo de fábrica é: " + custoFabric);
		System.out.println("O valor de impostos é: " + impostos);
		System.out.printf("O valor de retorno da distribuidora é: %.2f ", (percentDB));
		

	}

}
