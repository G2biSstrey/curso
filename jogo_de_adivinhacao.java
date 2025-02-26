package aula_atividade_loop;

import java.util.Scanner;

public class jogo_de_adivinhacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		while(true) {
			
			System.out.println("******J̳O̳G̳O̳ ̳D̳E̳ ̳A̳D̳I̳V̳I̳N̳H̳A̳Ç̳Ã̳O̳******");
			
			System.out.println();
			
			System.out.println("O que é, o que é: ");
			System.out.println();
			System.out.println("Não tem asas, mas pode voar,");
			System.out.println();
			System.out.println("Não tem pernas, mas pode correr");
			System.out.println();
			System.out.println("E se esconde quando está de dia.");
			System.out.println();
			System.out.println("Respoda com somente uma palavra: ");
			System.out.println();
			
			String resposta = scan.next();
			
			if (resposta.equalsIgnoreCase("lua"))  {
				System.out.println("Parabéns, você acertou a resposta, você respondeu: " + resposta);
				break;
			}
			else {
				System.out.println("Você errou, tente novamente!");
			}
		}
	
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
