package lista_1;

public class Exercicio6 {

	/*6) Escreva um programa que lê dois valores booleanos (lógicos) e então determina 
	 * se ambos são VERDADEIROS ou FALSOS.*/
	
	Boolean x;
	Boolean y;
	
	public void verdadeOuFalso(Boolean x, Boolean y) {
		if (x == y && x == true) {
			System.out.println("\nAmbos sao VERDADEIROS.");
		}
		else if (y == x && y == false) {
			System.out.println("\nAmbos sao FALSOS.");
		}
		else {
			System.out.println("\nUm e VERDADEIRO e o outro FALSO.");
		}
	}
	
}
