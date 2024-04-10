package controller;

import util.Teclado;

public class Questao06 {
	public static void main(String[] args) {
		
		System.out.println("NÚMEROS MULTIPLOS DE 3 E 5");
		System.out.println("----------------------------\n");
		int inLimite = Teclado.lerInt("Informe um número inteiro: \n");
		
		
		for (int i = 1; i <= inLimite; i++) {
			
			boolean condMultiplo3 = i % 3 == 0;
			boolean condMultiplo5 = i % 5 == 0;
			
			if(condMultiplo3 && condMultiplo5) {
				System.out.println(i);
			}
		}
		
	}
}
