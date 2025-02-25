package aula_2;

import java.util.Scanner;

public class entrada_dinamica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		
		String nome = scan.next();
		
		System.out.println("Olá "+ nome + "!");
		
		System.out.println("");
		
		System.out.println("Sua idade?: ");
		
		int idade =scan.nextInt();
		
		System.out.println("");
		
		System.out.println("Sua altura: ");
		
		double altura = scan.nextDouble();
		
		System.out.println("");
		
		System.out.println("Deseja se  cadastrar no sistema? (S/N): ");
		
		char resposta = scan.next().charAt(0);
		
		System.out.println("");
		
		System.out.println("Obrigada pelo cadastro, " + nome +" seja bem vinda!");
				
		
		
		
		scan.close();
	
				
				
		
	}

}
