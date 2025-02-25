package atividades_if_else;

import java.util.Scanner;

public class Sistema_Reserva_Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("╏╠══[ 𝙱𝚎𝚖-𝚟𝚒𝚗𝚍𝚘 𝚊𝚘 𝚁𝚎𝚏ú𝚐𝚒𝚘 𝚍𝚊𝚜 𝙴𝚜𝚝𝚛𝚎𝚕𝚊𝚜]      ");
		
		System.out.println();
		
		System.out.println("Localizado em Curitiba, o Refúgio das Estrelas oferece acomodações confortáveis ");
		
		System.out.println();
		
		System.out.println ("e serviços de alta qualidade para uma experiência única. ");
		
		System.out.println();
		
		System.out.println("Com quartos modernos, restaurante renomado e excelente localização perto de pontos turísticos,");
		
		System.out.println();
		
		System.out.println ("garantimos uma estadia agradável e conveniente para nossos hóspedes.");
		
		System.out.println();
		
		System.out.println("Qual seria o seu nome?");
		
		String nome= scan.next();
		
		System.out.println("Prazer " + nome + ". Qual seria o modelo de quarto que você gostaria de contratar?");
		
		System.out.println();
		
		System.out.println("Temos em nosso hotel dois modelos de quartos:");
		
		System.out.println();
		
		System.out.println("Quarto simples: R$ 150/dia");
		
		System.out.println();
		
		System.out.println("Quarto luxo: R$ 300/dia");
		
		System.out.println();
		
		System.out.print("Qual você desejaria contratar? Responde com (simples/luxo): ");
		
		System.out.println();
		
		String quarto= scan.next();
		
		 if (quarto.equals("simples")) {
			 
	            System.out.println("Você selecionou a opção: Quarto Simples");
	            
	            System.out.println();
	            
	            System.out.println("O valor da diária será R$ 150.");
	            
	            System.out.println();
	            
	            System.out.print("Me infomer agora quantos dias você deseja ficar no hotel: ");
	            
	            System.out.println();
	            
	            double dias = scan.nextDouble();
	            
	            System.out.println("Você selecionou a quantidade de: " + dias + " dias, aguarde um momento enquanto realizo o calculo.");
	      
	            double simples = 150;
	            double valores_dias = simples * dias;
	            
	            System.out.println("Você selecionou a quantidade de: " + dias + ", o valor total da reserva ficou de: R$" + valores_dias);
	            
	        
		}else {
			System.out.println("Você selecionou a opção: Quarto Luxo");
			
            System.out.println();
            
            System.out.println("O valor da diária será R$ 300.");
            
            System.out.println();
            
            System.out.print("Me infomer agora quantos dias você deseja ficar no hotel: ");
            
            System.out.println();
            
            double dias = scan.nextDouble();
            System.out.println();

         
            
            System.out.println("Você selecionou a quantidade de: " + dias + " dias, aguarde um momento enquanto realizo o calculo.");
            
            
            double luxo = 300;
            double valores_dias = luxo * dias;
            
        
            
            System.out.println("Você selecionou a quantidade de: " + dias + ", o valor total da reserva ficou de: R$" + valores_dias);
            
        
			
		}//fim
			
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
