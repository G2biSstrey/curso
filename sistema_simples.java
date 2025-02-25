package aula_4;

import java.util.Scanner;

public class sistema_simples {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("*********************************************");
		System.out.println("**𝔹𝔼𝕄 𝕍𝕀ℕ𝔻𝕆(𝔸) 𝔸𝕆 𝕊𝕀𝕊𝕋𝔼𝕄𝔸 𝔻𝔼 ℂ𝕆𝕄ℙℝ𝔸𝕊**");
		System.out.println("*********************************************");
		
		System.out.println();
		System.out.print("Informe o seu usuário: ");
		String user= scan.next();
		
		if(user.equals("admin")) {
			
			System.out.print("Qual é o produto: ");
			
			String produto = scan.next();
			
			System.out.print("Qual o preço do prooduto: ");
			
			double preço = scan.nextDouble();
			
			System.out.print("Quantidade: ");
		
			int quantidade = scan.nextInt();
			double total = preço * quantidade;
			
			System.out.println();
			
			if ( total >= 500) {
				System.out.println("************ℙ𝔸ℝ𝔸𝔹𝔼́ℕ𝕊***********");
				System.out.println("Você recebeu um desconto de 10%");
				
				System.out.println();

				double desconto = total * 0.10;
				
				double total_pagar = total - desconto;
				
				System.out.println("Preço a pagar: " + total);
				
				System.out.println("O valor total da compra com o desconto é de: " + total_pagar);
				System.out.println();
				System.out.println("O valor do descontou deu: " + desconto);
				
				System.out.println();
				
					if(desconto >= 300) {
						System.out.println("Pode realizar o pagamento em até 3x sem juros!");
						
						
					}else {
						System.out.println("Não é possével realizar o parcelamento.");
						System.out.println();
						System.out.println("Gostaria de finalizar a compra? Responda com s/n: ");
						
						String resposta1= scan.next();
						
						
							System.out.println("O valor total da compra ficou: " + total_pagar );
							
							System.out.println();
							
							System.out.println("Obrigada pela preferência!");
							
							System.out.println("****************************************");
					}
				
				
			}else { //valor sem desconto
				System.out.print("Gostaria de finalizar a compra? Responda com s/n: ");
				
				String resposta2= scan.next();
				
				
				if (resposta2.equals("s")) {
				
					System.out.println("O valor total da compra ficou: " + total );
					
					System.out.println("Obrigada pela preferência!");
					
					System.out.println("****************************************");
					
				}else {
					System.out.println("Gostaria de comprar algo a mais ou modificar o pedido? ");
					
				}
					
			}
		
		
		}else { //final
			System.out.println("Usuário incorreto!");
		}
		

		scan.close();
	}

}
