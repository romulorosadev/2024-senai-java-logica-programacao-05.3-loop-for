package controller;

public class Questao04 {
	public static void main(String[] args) {
		
		int iLimite = 21;
		int outSoma = 0;
		
		for (int i = 3; i <= iLimite; i++) {
			if(i % 2 == 0) {
				outSoma += i;
			}
		}
		
		System.out.println(outSoma);
	}
}