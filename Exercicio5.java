package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double x1 = 1.0, y1 = 1.0, x2 = 3.0, y2 = 3.0, d;
		Scanner ler = new Scanner(System.in);
		
		d = Math.sqrt((Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2))));
		System.out.println(d);

	}

}
