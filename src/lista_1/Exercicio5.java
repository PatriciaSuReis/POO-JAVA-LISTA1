package lista_1;

public class Exercicio5 {

	/*5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo 
	 * caso seja negativo, imprimindo o resultado.
	 */
	
	int numero, pos, neg;
	
	public void dobroOuTriplo(int numero) {
		pos = numero * 2;
		neg = numero * 3;
		
		if (numero % 2 == 0) {
			System.out.printf("\nO numero %d e POSITIVO e seu dobro e %d.\n", numero, pos);
		}
		else {
			System.out.printf("\nO numero %d e NEGATIVO e seu triplo e %d.\n", numero, neg);
		}
	}
}
