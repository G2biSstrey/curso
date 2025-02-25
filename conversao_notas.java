package atividades_if_else;

import java.util.Scanner;

public class conversao_notas {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		System.out.println("******************");

		System.out.println("**BEM - VINDO(A)**");

		System.out.println("******************");
		
		System.out.println("******************");

		System.out.println("*NOTAS ESCOLARES**");

		System.out.println("******************");
		
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
		
		System.out.println("O que você deseja consultar?");
		
		System.out.println();
		
		System.out.println("1.Média de aprovação");
		
		System.out.println();
		
		System.out.println("2.Classificação das notas");
		
		System.out.println();
		
		System.out.print("Selecione aopção escolhendo a opção 1 ou 2: ");
		
		@SuppressWarnings("unused")
		
		double opçao= scan.nextDouble();
		
			if( opçao >= 1) {
			
				//calculo da média
	
				System.out.println("Você selecionou a opção 1, aguarde um momento enquanto a soma de sua média é realizada"); 
				System.out.println();
				
				if( media >= 70 ) {
					System.out.println("O aluno(a)" + nome + "foi Aprovado com a média " + media); 
					
				}else {
					System.out.println("O aluno(a)" + nome + "foi reprovado com a média " + media);
					
				}
			
			}else {
				System.out.println("Você selecionou a opção 2, aguarde um momento enquanto é realizada sua classificação de notas");
				System.out.println();
				
				}if( media >= 70 ) {
				System.out.println( nome + "sua nota foi classificada como boa / excelente."); 
				
				}else {
				System.out.println( nome + "sua nota foi classificada como regular / insuficiente."); 
				}
			
				
			
		
		
		scan.close();
		
	}

}
