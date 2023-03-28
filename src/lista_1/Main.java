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
					System.out.println("Digite um numero inteiro:");
						int var = leia.nextInt();
						
					Exercicio7 exer7 = new Exercicio7();
					
					exer7.setVar(var);
					exer7.someParOuImpar();
					
					break;
				
				case 8:
					System.out.println("Digite tres numeros inteiros, que"
							+ "\nserao colocados em ordem decrescente.");
					System.out.print("\n1 - ");
						int a = leia.nextInt();
					System.out.print("2 - ");
						int b = leia.nextInt();
					System.out.print("3 - ");
						int c = leia.nextInt();
					
					Exercicio8 exer8 = new Exercicio8();
					
					exer8.setA(a);
					exer8.setB(b);
					exer8.setC(c);
					exer8.diferentesEDecrescente();
						
					break;
				
				case 9:
					System.out.println("++  Calculo IMC  ++\n");
					System.out.println("Informe seu peso: ");
						double peso = leia.nextDouble();
					System.out.println("Informe sua altura: ");
						double altura = leia.nextDouble();
						
					Exercicio9 exer9 = new Exercicio9();
					
					exer9.setPeso(peso);
					exer9.setAltura(altura);
					exer9.calculoIMC();
						
					break;
				
				case 10:
					System.out.println("++++++++++++++++++++  PAGAMENTO ++++++++++++++++++++");
					System.out.println("\n Condicao de pagamento:\n"
									+ "\n  1- A vista em dinheiro ou cheque, 10% de desconto."
									+ "\n  2- A vista no cartao de credito, 15% de desconto."
									+ "\n  3- Em duas vezes, sem juros."
									+ "\n  4- Em tres vezes, juros de 10%. \n");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.print("Sua escolhar: ");
						int escolha = leia.nextInt();
					System.out.print("\nValor do produto: \nR$ ");
						double valor = leia.nextDouble();
						
					Exercicio10 exer10 = new Exercicio10();
					
					exer10.setEscolha(escolha);
					exer10.setValorInicial(valor);
					exer10.condicaoDoPagamento();
					
					break;
				
				case 11:
					System.out.println("++++++++++++  AVALIACAO DO ALUNO ++++++++++++++");
					System.out.print("\nNumero do aluno: ");
						String numeroAluno = leia.nextInt();
					System.out.print("Nota 1: ");
						double nota1 = leia.nextDouble();
					System.out.print("Nota 2: ");
						double nota2 = leia.nextDouble();
					System.out.print("Nota 3: ");
						double nota3 = leia.nextDouble();
					System.out.print("ME: ");
						double me = leia.nextDouble();
					System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++");
					
					Exercicio11 exer11 = new Exercicio11();
					
					exer11.setNumeroAluno(numeroAluno);
					exer11.setNota1(nota1);
					exer11.setNota2(nota2);
					exer11.setNota3(nota3);
					exer11.setMe(me);
					
					exer11.situacaoDoAluno();
					
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
