package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double numeroF, salario = 0.0, i, somaS=0.0, media, somaF=0.0;
		double mediaF, contS=0.0, percentualS = 0.0, maiorSa = 0.0;
		Scanner ler = new Scanner(System.in);
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Qual o salário do cidadão número " + (i)+ "? R$");
			salario = ler.nextDouble();
			
				if (salario >= 100) {
					contS++;
					percentualS = (contS / 5) * 100;
				}
				if (salario > maiorSa) {
					maiorSa = salario;
				}
			System.out.println("Qual o número de filhos do cidadão " + (i) + "?");
			numeroF = ler.nextDouble();
			somaS += salario;
			somaF += numeroF;
			
		}
		media = somaS/5;
		mediaF = somaF/5;
		System.out.println("_______________________________________________________________");
		System.out.println("A média de salários da população é R$ " + media);
		System.out.println("A média de filhos da população é: " + mediaF);
		System.out.println("________________________________________________________________");
		System.out.println("O maior salário da população é R$" + maiorSa);
		System.out.println("A média de pessoas com salário acima de R$ 100,00 reais é de " + percentualS + " %");
		

	}

}
