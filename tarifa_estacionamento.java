package atividades_if_else;

import java.util.Scanner;

public class tarifa_estacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("******************************************");
		System.out.println("***************BEM VINDO(a)***************");
		System.out.println("******************************************");
		
		System.out.println();
		System.out.println("Informe o seu nome: ");
		System.out.println();
		String nome= scan.next();
		
		System.out.println("Sr(a) " + nome + ", irei informar os valores do estacionamento: ");
		System.out.println();
		System.out.println("Até 2 horas: R$ 20,00");
		System.out.println("acima de 2 horas: R$ 30,00");
		System.out.println();
		System.out.print("O senhor(a) poderia me infomar o tempo que utilizou nosso estacionamento: ");
		System.out.println();
		
		double tempo = scan.nextDouble();
		
		if(tempo >= 1/2 ) {
			System.out.println("O senhor permaneceu estacionado em nosso estacionamento durante o periodo de: " + tempo + "horas");
			System.out.println("O valor que deve ser pago é de: R$ 20,00");
			
		}else {
			System.out.println("O senhor permaneceu estacionado em nosso estacionamento durante o periodo de: " + tempo + "horas");
			System.out.println("O valor que deve ser pago é de: R$ 30,00");
		}//fim
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

		
	}

}
