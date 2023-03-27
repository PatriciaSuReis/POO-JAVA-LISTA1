package lista_1;

public class Exercicio4 {

	/*4) Faça um programa que leia dois valores inteiros A e B se os valores
	 *forem iguais deverá se somar os dois, caso contrário multiplique A por B. 
	 *Ao final de qualquer um dos cálculosdeve-se atribuir o resultado para uma 
	 *variável C e mostrar seu conteúdo na tela.
	*/
	
	int a;
	int b;
	int resultado;
	
	public void somarOuMultiplicar(int a, int b) {
		if (a == b) {
			resultado = a + b;
			System.out.println("Resultado = " + resultado);
		}
		else {
			resultado = a * b;
			System.out.println("Resultado = " + resultado);
		}
	}
	
}
