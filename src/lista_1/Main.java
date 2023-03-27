package lista_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("===============================================");
			System.out.println(" Lista 1 - POO");
			System.out.println(" Escolher o exercicio de 1 a 11 ou 0 para sair: ");
				int op = leia.nextInt();
			System.out.println("===============================================");
			
			if (op == 0) {
				break;
			}
			
			switch (op) {
				case 1:
					System.out.println("Digite tres valores interios:");
						int numA = leia.nextInt();
						int numB = leia.nextInt();
						int numC = leia.nextInt();
						
					Exercicio1 exer1 = new Exercicio1();
					System.out.println("-----------------------------------------------");
					exer1.somaEMenor(numA, numB, numC);
					
					break;
					
				case 2:
					System.out.println("Informe seu nome: ");
						String nome = leia.next();
					System.out.println("Informe seu sexo F(feminino) ou M(masculino):");
						String sexo = leia.next();
					System.out.println("Informe seu estado civil:");
						String estC = leia.next();
					
					Exercicio2 exer2 = new Exercicio2();
					//setar valores
					exer2.setNome(nome);
					exer2.setSexo(sexo);
					exer2.setEstadoCivil(estC);
					
					System.out.println("-----------------------------------------------");
					exer2.casadaInfo();

					break;
					
				case 3:
					System.out.println("Informe um numero inteiro para saber se "
							+ "e par ou impar:");
						int numero = leia.nextInt();
					
					Exercicio3 exer3 = new Exercicio3();
					
					exer3.numeroParOuImpar(numero);
						
					break;
					
				case 4:
					System.out.println("Digite dois valores inteiros, se forem "
							+ "\niguais ira somar, caso contrario multiplicar:");
					System.out.print("1 - ");
						int nuA = leia.nextInt();
					System.out.print("2 - ");
						int nuB = leia.nextInt();
						
					Exercicio4 exer4 = new Exercicio4();
					
					exer4.somarOuMultiplicar(nuA, nuB);
						
					break;
				
				case 5:
					System.out.println("Digite um numero pra saber o dobro ou triplo:");
						int num = leia.nextInt();
					
					Exercicio5 exer5 = new Exercicio5();
					
					exer5.dobroOuTriplo(num);
					
					break;
				
				case 6:
					System.out.println("Informe dois valores FALSOS ou VERDADEIROS:");
						Boolean x = leia.nextBoolean();
						Boolean y = leia.nextBoolean();
						
					Exercicio6 exer6 = new Exercicio6();
					
					exer6.verdadeOuFalso(x, y);
					
					break;
					
				case 7:
					
					break;
				
				case 8:
					System.out.println("-----------------------------------------------");
					break;
				
				case 9:
					System.out.println("-----------------------------------------------");
					break;
				
				case 10:
					System.out.println("-----------------------------------------------");
					break;
				
				case 11:
					System.out.println("-----------------------------------------------");
					break;
					
				default:
					System.out.println("Opcao invalida!");
					break;
			}
		//dentro do DO
			
			System.out.println("===============================================");
		  	System.out.println("Continuar S(Sim) ou N(Nao): ");
		  	leia.nextLine();
		} 
		while(leia.nextLine().equalsIgnoreCase("s"));
		System.out.println("===============================================");
		System.out.println("Bye!");
		
		leia.close();
	}
}
