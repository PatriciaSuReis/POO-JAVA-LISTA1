package lista_1;

public class Exercicio3 {

	/*3) Faça um programa para receber um número qualquer e informar na tela 
	 * se é par ou ímpar.*/
	
	int numero;
	
	public void numeroParOuImpar(int numero) {
		if (numero % 2 == 0) {
			System.out.println("O numero e par.");
		}
		else if (numero % 2 == 1) {
			System.out.println("O numero e impar.");
		}
	}
	
}
