package lista_1;

public class Exercicio10 {

	/*10) Elabore um algoritmo que calcule o que deve ser pago 
	 * por um produto, considerando o preço normal de etiqueta 
	 * e a escolha da condição de pagamento. Utilize os códigos 
	 * da tabela a seguir para ler qual a condição de pagamento 
	 * escolhida e efetuar o cálculo adequado.
	 * Código Condição de pagamento
	 * 1 À vista em dinheiro ou cheque, recebe 10% de desconto
	 * 2 À vista no cartão de crédito, recebe 15% de desconto
	 * 3 Em duas vezes, preço normal de etiqueta sem juros
	 * 4 Em duas vezes, preço normal de etiqueta mais juros de 10%.
	 * */
	private int escolha;
	private double valorInicial;
	private double valorFinal;
	private double valorDesconto;
	private double valorJuros;

	//setters
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	public void setValorInicial(double valorIncial) {
		this.valorInicial = valorIncial;
	}

	//metodo
	public void condicaoDoPagamento() {
		switch (escolha) {
		case 1:
			valorDesconto = valorInicial * 10 / 100;
			valorFinal = valorInicial - valorDesconto;
			
			System.out.print("Valor do produto: R$ " + valorInicial + "\n");
			System.out.print("Desconto: R$ " + valorDesconto + "\n");
			System.out.print("Valor final: R$ " + valorFinal + "\n");
			break;
			
		case 2:
			valorDesconto = valorInicial * 15 / 100;
			valorFinal = valorInicial - valorDesconto;
			
			System.out.print("\nValor do produto: R$ " + valorInicial + "\n");
			System.out.print("Desconto: R$ " + valorDesconto + "\n");
			System.out.print("Valor final: R$ " + valorFinal + "\n");
			break;
			
		case 3:
			valorFinal = valorInicial / 2;
			
			System.out.print("\nValor do produto: R$ " + valorInicial + "\n");
			System.out.print("Valor da parcela: R$ " + valorFinal + "\n");
			break;
			
		case 4:
			valorJuros = valorInicial * 10 / 100;
			valorFinal = valorInicial + valorJuros;
			double parcela = valorFinal / 3;
			
			System.out.print("\nValor do produto: R$ " + valorInicial + "\n");
			System.out.printf("Valor total com juros: R$ %.2f \n", valorFinal);
			System.out.printf("Valor da parcela: R$ %.2f \n", parcela);
			break;
			
		default:
			System.out.println("Opcao invalida!");
			break;
		}
	}
	
}




