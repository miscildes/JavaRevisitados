package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double num1, num2, num3, num4, i, num;
		Scanner ler = new Scanner(System.in);
		
		for (i = 0; i <=3; i++) {
			System.out.println("Digite o " + (i+1) + " número");
			num = ler.nextDouble();
			
			if (i == 0) {
				num1 = Math.pow(num, 2);
				System.out.println("O quadrado do " + (i+1) + " número é " + num1);
			}
			if (i == 1) {
				num2 = Math.pow(num, 2);
				System.out.println("O quadrado do " + (i+1) + " número é " + num2);
			}
			if (i == 2) {
				num3 = Math.pow(num, 2);
				System.out.println("O quadrado do " + (i+1) + " número é " + num3);
		}
			
			if (i==3) {
				num4 = Math.pow(num, 2);
				if (num4 >= 1000) {
					System.out.println("O quadrado do "+(i +1) + " número é " + num4);
					}
					else {
						System.out.println(num);
					
				}
					
			}
			
		}
	}

}
