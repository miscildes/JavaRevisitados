package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double horasTrab, salario, horaExt = 0.0, salarioExt, novoSal;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantas horas trabalhas no m�s? ");
		horasTrab = ler.nextDouble();
		
		if (horasTrab <= 50) {
			salario = horasTrab * 10;
			System.out.println("O salario do funcion�rio � R$ " + salario + " reais");
		}
		else if (horasTrab > 50) {
			salario = 50 * 10;
			horaExt = horasTrab - 50;
			salarioExt = horaExt * 20; 
			novoSal = salario + salarioExt;
			System.out.println("O salario do funcionario com hora extra � R$ " + novoSal + " reais");
		}

	}

}
