package aula_3;

import java.util.Scanner;

public class cadastro_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("Digite o seu nome completo: ");
		String nome = scan.nextLine();
		
		System.out.println("Digites sua idade: ");
		int idade = scan.nextInt();
		
		scan.nextLine();
		
		
		System.out.println("Digite o nome completo da sua mãe: ");
		String nome_mae = scan.nextLine();
		
		System.out.println("***************");
		
		System.out.println("********CADASTRO********");
		
		System.out.println("***************");
		
		System.out.println("Nome completo: " + nome);
		
		System.out.println("Idade: " + idade);
		
		System.out.println("Nome completo da mãe: " + nome_mae);
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
