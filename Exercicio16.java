package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double numeroF, salario = 0.0, i, somaS=0.0, media, somaF=0.0;
		double mediaF, contS=0.0, percentualS = 0.0, maiorSa = 0.0;
		Scanner ler = new Scanner(System.in);
		
		for (i = 1; i <= 5; i++) {
			System.out.println("Qual o sal�rio do cidad�o n�mero " + (i)+ "? R$");
			salario = ler.nextDouble();
			
				if (salario >= 100) {
					contS++;
					percentualS = (contS / 5) * 100;
				}
				if (salario > maiorSa) {
					maiorSa = salario;
				}
			System.out.println("Qual o n�mero de filhos do cidad�o " + (i) + "?");
			numeroF = ler.nextDouble();
			somaS += salario;
			somaF += numeroF;
			
		}
		media = somaS/5;
		mediaF = somaF/5;
		System.out.println("_______________________________________________________________");
		System.out.println("A m�dia de sal�rios da popula��o � R$ " + media);
		System.out.println("A m�dia de filhos da popula��o �: " + mediaF);
		System.out.println("________________________________________________________________");
		System.out.println("O maior sal�rio da popula��o � R$" + maiorSa);
		System.out.println("A m�dia de pessoas com sal�rio acima de R$ 100,00 reais � de " + percentualS + " %");
		

	}

}
