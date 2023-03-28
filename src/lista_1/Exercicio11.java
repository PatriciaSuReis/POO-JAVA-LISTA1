package lista_1;

public class Exercicio11 {
	/* 11) Escreva um algoritmo que leia o número de identificação, 
	 * as 3 notas obtidas por um aluno nas 3 verificações e a média dos
	 * exercícios que fazem parte da avaliação, e calcule a média de 
	 * aproveitamento, usando a fórmula: 
	 * MA := (nota1 + nota2 * 2 + nota 3 * 3 + ME)/7
	 * A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve 
	 * escrever o número do aluno, suas notas, a média dos exercícios, 
	 * a média de aproveitamento, o conceito correspondente e a mensagem 
	 * 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito 
	 * for D ou E.
	 * Média de aproveitamento Conceito:
	 * ● >= 90 A
	 * ● >= 75 e < 90 B
	 * ● >= 60 e < 75 C
	 * ● >= 40 e < 60 D
	 * ● < 40 E*/
	
	private int numeroAluno;
	private double nota1;
	private double nota2;
	private double nota3;
	private double mediaExercicio;
	private double mediaAproveitamento;
	
	//setter
	public void setNumeroAluno(int numeroAluno) {
		this.numeroAluno = numeroAluno;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void setMediaExercicio(double mediaExercicio) {
		this.mediaExercicio = mediaExercicio;
	}
	
	//metodo
	public void situacaoDoAluno() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("++++++++++++  AVALIACAO DO ALUNO ++++++++++++++");
		System.out.print("\nNumero do aluno: ");
			String numeroAluno = leia.nextLine();
		System.out.print("Nota 1: ");
			nota1 = leia.nextDouble();
		System.out.print("Nota 2: ");
			nota2 = leia.nextDouble();
		System.out.print("Nota 3: ");
			nota3 = leia.nextDouble();
		System.out.print("ME: ");
			mediaExercicio = leia.nextDouble();
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++");
		
		mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicio)/ 7;
		
		System.out.println("Numero do aluno: " + numeroAluno);
		System.out.printf("\nMedia de Exercicios: %.2f \n", mediaExercicio);
		System.out.printf("Media de Aproveitamento: %.2f \n\n", mediaAproveitamento);	
	}
	
	public String aprovadoReprovado() {
		if (mediaAproveitamento >= 9.0) {
			System.out.println("Aluno APROVADO.");
			return "A";
		}
		else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			System.out.println("Aluno APROVADO.");
			return "B";
		}
		else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			System.out.println("Aluno APROVADO.");
			return "C";
		}
		else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
			System.out.println("Aluno REPROVADO.");
			return "D";
		}
		else {
			System.out.println("Aluno REPROVADO.");
			return "E";
		}
	}
}
