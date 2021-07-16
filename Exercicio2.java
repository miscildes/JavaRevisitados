package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int tempoH, tempoM, tempoS;
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Duração estimada do evento");
		System.out.println("Quanto tempo em horas será o evento? ");
		tempoH = ler.nextInt();
		
		tempoM = tempoH * 60;
		tempoS = tempoM * 60;
		
		System.out.println(" O evento terá duração de " + tempoM + " minutos e " + tempoS + " segundos");
	}

}
