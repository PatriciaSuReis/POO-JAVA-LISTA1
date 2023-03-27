package lista_1;

import java.util.Scanner;

public class Exercicio2 {

	/*2) Faça um programa que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja
	 * “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos). */

	
	private String nome;
	private String sexo;
	private String estadoCivil;

	//construtor
	public Exercicio2() {
	}

	//GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	//METODOS
	public void casadaInfo(){
		if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("Casada")) 
		{	
			Scanner sc = new Scanner(System.in);
			
			int anos;
			
			System.out.println("Roi, casada a quantos anos?");		
				anos = sc.nextInt();
			System.out.println("-----------------------------------------------");
			
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estados civil: " + estadoCivil);
			System.out.println("Anos de casada: " + anos);
			
			sc.close();
		} 
		else 
		{
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estados civil: " + estadoCivil);
		}
		
	}
}
