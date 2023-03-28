package lista_1;

public class Exercicio7 {

	/*7) Faça um programa que leia uma variável e some 5 caso seja 
	 * par ou  some 8 caso seja ímpar, imprimir o resultado desta 
	 * operação.
	 */
	
	private int var;
	private int soma;

	public void setVar(int var) {
		this.var = var;
	}

	public void someParOuImpar() {
		if (var % 2 == 0) {
			soma = var + 5;
			System.out.println("\nA somar de um numero par com 5."
					+ "\nResultado: " + soma);
		}
		else {
			soma = var + 8;
			System.out.println("A somar de um numero impar com 8."
					+ "\nResultado: " + soma);
		}
	}
}
