package lista_1;

public class Exercicio9 {

	/*9) O IMC – Índice de Massa Corporal. A fórmula é 
	 * IMC = peso /( altura * altura). Elabore um programa que 
	 * leia o peso e a altura de um adulto e mostre sua condição 
	 * de acordo com a tabela abaixo.
	 * IMC em adultos Condição
	 * ● Abaixo de 18,5 Abaixo do peso
	 * ● Entre 18,5 e 25 Peso normal
	 * ● Entre 25 e 30 Acima do peso
	 * ● Acima de 30 obeso*/
	
	private double peso;
	private double altura;
	private double imc;
	
	//setters
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodo
	public void calculoIMC() {
		imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.printf("\nSeu IMC: %.2f", imc);
			System.out.println("\nVoce esta a baixo do peso.");
		}
		else if (imc >= 18.5 && imc <= 25) {
			System.out.printf("\nSeu IMC: %.2f", imc);
			System.out.println("\nVoce esta com peso normal.");
		}
		else if (imc >= 25 && imc <= 30) {
			System.out.printf("\nSeu IMC: %.2f", imc);
			System.out.println("\nVoce esta acima do peso.");
		}
		else if (imc > 30) {
			System.out.printf("\nSeu IMC: %.2f", imc);
			System.out.println("\nVoce esta obesidade.");
		}
	
	}
}
