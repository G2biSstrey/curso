package aula_6;

import java.util.Scanner;

public class menu_interativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan= new Scanner (System.in);
		
	System.out.println("******MENU INTERATIVO******");
	System.out.println();
	
	while(true) {
		
		System.out.println("[1] - imprimir uma mensagem");
		System.out.println();
		System.out.println("[2] - Somar 2 números");
		System.out.println();
		System.out.println("[3] - sair");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		
		int opcao = scan.nextInt();
		
		if(opcao == 1) {
			System.out.println("Se você pode sonhar, pode realizar!");
		
		}
		else if (opcao == 2) {
			System.out.print("Digite o primeiro número: ");
			double numero1 = scan.nextDouble();
			System.out.print("Digite o segundo número: ");
			double numero2 = scan.nextDouble();
			
			double valor = numero1 + numero2;
			
			System.out.println("A soma dos dois números selecionados é de: " + valor);
			
			
		}else if (opcao == 3) {
			System.out.println("Você saiu do menu interativo!");
			
		}else {
			System.out.println("Você selecionou uma opção invalida, selecione uma nova opção: ");
			
		}
		System.out.println("Você deseja retornar ao sistema? (S/N)");
		char escolha = scan.next().charAt(0);
		
		if(escolha != 's') {
			System.out.println("Saindo do programa...");
			break;
		
	}
		
			
			
		}
	
		

		scan.close();
		
		}
	}