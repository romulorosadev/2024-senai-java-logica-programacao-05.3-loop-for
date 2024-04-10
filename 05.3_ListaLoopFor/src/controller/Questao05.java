package controller;

import util.Teclado;

public class Questao05 {
	
	public static void main(String[] args) {
		int iLimite = 3;
		
		System.out.println("Informe os dados, conforme solicitado: \n");
		
		for (int i = 0; i < iLimite; i++) {
			String space = "\n";
			String inNomeCompleto = Teclado.lerTexto("Nome Completo: ");
			String inGenero = Teclado.lerTexto("Gênero: ").toUpperCase();
			int inIdade = Teclado.lerInt("Idade: ");
			
			boolean condGenero = inGenero.equals("MASCULINO");
			boolean condIdade = inIdade >= 21;
			boolean condExibirNome = condGenero && condIdade;
			
			if(condExibirNome) {
				System.out.println(inNomeCompleto);
				System.out.println(space);
			}
		}
		
	}

}
