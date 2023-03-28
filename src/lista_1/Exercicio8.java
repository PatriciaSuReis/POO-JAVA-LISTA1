package lista_1;

public class Exercicio8 {

	/*8) Escreva um programa que leia três valores inteiros e 
	 * diferentes e mostre-os em ordem decrescente*/
	
	private int a, b, c;

	//seters, passar valores para as variaveis 
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	//metodo
	public void diferentesEDecrescente() {
		//verificar se sao diferentes
		if (a != b && a != c && b != c) {
			//a
			if (a > b && b > c) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", a, b, c);
			}
			else if (a > c) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", a, c, b);
			}
			//b
			else if (b > a && a > c) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", b, a, c);
			}
			else if (b > c) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", b, c, a);
			}
			//c
			else if (c > a && a > b) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", c, a, b);
			}
			else if (c > b) {
				System.out.printf("\nOrdem descrescente: "
						+ "\n%d - %d - %d.\n", c, b, a);
			}	
		}
		else {
			System.out.println("\nOs numeros nao sao diferentes.");
		}
	}
	
}
