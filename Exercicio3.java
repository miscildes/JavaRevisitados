package br.com.generation.exerciciosrevistitados;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int a = 2, b = 3, c = 4, r, s, d, po1, po2;
	
		r = (a + b);
		po1 = (int) Math.pow(r, 2);
		
		s = (b + c);
		po2 = (int) Math.pow(s, 2);
		
		d = (po1 + po2)/2;
		
		System.out.println("Resultado de R " + po1 + ", \nresultado de S " + po2 + ", \nresultado de D " + d + ".");
		
	}

}
