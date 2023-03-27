package lista_1;

public class Exercicio1 {

	/*Faça um programa que leia os valores A, B, C e imprima na tela se a 
	 * soma de A + B é menor que C.*/
	
	int A;
	int B;
	int C;
	
	int valor;
	
	public void somaEMenor(int A, int B , int C) {
		valor = A + B;
		
		System.out.println("A= "+ A + "\nB= " + B + "\nC= " + C);
		System.out.println();
		System.out.printf("Soma de A=%d + B=%d = %d.\n", A, B, valor);
		
		if (valor < C) {
			System.out.printf("A soma de A=%d + B=%d e menor que o valor C=%d.\n", A, B, C);
		}
		else if (valor == C) {
			System.out.printf("A soma e igua o valor C=%d.\n", C);
		}
		else {
			System.out.printf("A soma de A=%d + B=%d e maior que o valor C=%d.\n", A, B, C);
		}
	}
	
}
