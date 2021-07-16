package br.com.generation.exerciciosrevistitados;

public class Exercicio6 {

	public static void main(String[] args) {

		double a = 5.0 ,b =5.0 ,c = 0.0 ,d = 13.0,e = 13.0,f = 0.0,x,y;
		
		c = (Math.pow(a, 1) + (Math.pow(b, 1)));
		f = (Math.pow(d, 1) + (Math.pow(e, 1)));
		
		x = (c * e) - (b * f) / (a * e) - (b * d);
		y = (a * f) - (c * a) / (a * e) - (b * d);
		
		System.out.println(c);
		System.out.println(f);
		System.out.println(x);
		System.out.println(y);
	}

}
