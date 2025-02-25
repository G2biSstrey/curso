package atividades_if_else;

import java.util.Scanner;

public class multas_transitos {

	public static void main(String[] args) {
 
		Scanner scan=new Scanner (System.in);
		
		System.out.println("******************************************");
		System.out.println("BEM VINDO AO SISTEMA DE CALCULOS DE MULTAS");
		System.out.println("******************************************");
		
		System.out.println();
		System.out.print("Informe o seu nome: ");
		String nome= scan.next();
		
		System.out.print("Sr(a) " + nome + ", me informe a velocidade que você estava para que ocorra o calcula da multa: ");
		System.out.println();
		double velocidade = scan.nextDouble();
        
        // Definir o limite de velocidade
        double limiteVelocidade = 60.0;
        
				if(velocidade >= limiteVelocidade) {
					 double excessoVelocidade = velocidade - limiteVelocidade;
					 double valorMulta = excessoVelocidade * 5; // R$ 5 por km acima do limite
					System.out.println("Você estava na velocidade de: " + limiteVelocidade);
					System.out.println();
					System.out.println("Você será cobrado em 5$ a cada km acima do limite permitido");
					System.out.println();
					System.out.println("Excesso de velocidade: " + excessoVelocidade + " km/h");
					System.out.println();
					 System.out.println("Valor da multa: R$ " + valorMulta);
					
					
		        } else {
		        	System.out.println("Você estava dentro do limite, não receberá multa.");
				
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
