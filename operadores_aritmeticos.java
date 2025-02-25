package aula_3;

import java.util.Scanner;

public class operadores_aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner (System.in);
		
	
		System.out.println("***************");

		System.out.println("Notas escolares");

		System.out.println("***************");
		
		System.out.println("Digite o nome do aluno(a): ");
		
		String nome= scan.next();
		
		System.out.println("Aluno(a):  " + nome);
		
		System.out.println("Digite a nota 1: ");
		
		double nota1=scan.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		
		double nota2=scan.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		
		double nota3=scan.nextDouble();
		
		
		//calculo da média
		
		double media= (nota1 + nota2 + nota3) /3;
		

		if ( media >= 6.0) {
			System.out.println("O aluno(a)" + nome + "foi Aprovado com a média " + media); 
			
			System.out.println("*****************");
			System.out.println("VOCÊ FOI APROVADO");
			System.out.println("*****************");
			System.out.println("Como você foi aprovado, você ganhou a oportunidade de uma bolsa 100% no senac");
			
			System.out.println("Para os proximos passos, digite sua idade: ");
			int idade = scan.nextInt();
			
			if ( idade >= 16) {
				System.out.println("Parabéns " + nome + " você ganhou um curso"); }
			
				else {
					System.out.println("Idade não permitida para ingressar com a bolsa");
				}
		
		}else {
			System.out.println("O aluno(a)" + nome + "foi reprovado com a média " + media);
		
		}//fim
		
		
		
		scan.close();

		
	}

}
