package br.com.generation.exerciciosrevistitados;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int idade, anoAtual, anoNasc, meses, dias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora de idade");
		System.out.println("Em que ano você nasceu(AAAA)? ");
		anoNasc = ler.nextInt();
		System.out.println("                              ");
		System.out.println("Em que ano estamos(AAAA)? ");
		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNasc;
		meses = idade/12;
		dias = meses/365;
		
		System.out.println(" Você tem " + idade + " anos, " + meses + " meses, e " + dias + " dias de vida");

	}

}
